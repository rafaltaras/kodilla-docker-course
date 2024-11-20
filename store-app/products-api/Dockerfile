FROM gradle:7.6-jdk11 AS build

# Katalog roboczy w kontenerze buildera
WORKDIR /usr/src/app

# Kopiowanie plików build.gradle i settings.gradle oraz konfiguracji Gradle
COPY build.gradle settings.gradle ./
COPY gradle/ gradle/

# Pobranie zależności (cache builda w Gradle)
RUN gradle dependencies --stacktrace

# Kopiowanie całej aplikacji do kontenera
COPY . .

# Budowanie aplikacji
RUN gradle clean build --no-daemon -x test

# Etap produkcyjny
FROM openjdk:11-jre-slim

# Katalog roboczy w produkcyjnym kontenerze
WORKDIR /app

# Kopiowanie pliku .jar z kontenera build
COPY --from=build /usr/src/app/build/libs/*.jar app.jar

# Otwieranie portu aplikacji
EXPOSE 8080

# Uruchamianie aplikacji
CMD ["java", "-jar", "app.jar"]

