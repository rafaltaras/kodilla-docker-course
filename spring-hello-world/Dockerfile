FROM gradle:7.6-jdk11 AS build

WORKDIR /app

COPY build.gradle settings.gradle ./

RUN gradle build -i --stacktrace || return 0

COPY . .

RUN gradle clean build

FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=build /app/build/libs/spring-hello-world-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

