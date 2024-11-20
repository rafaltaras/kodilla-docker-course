FROM gradle:7.6-jdk11 AS build

WORKDIR /usr/src/app

COPY build.gradle settings.gradle ./
COPY gradle/ gradle/

RUN gradle dependencies --stacktrace

COPY . .

RUN gradle clean build --no-daemon -x test

FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=build /usr/src/app/build/libs/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

