# Etapa 1: Build con Gradle 8.14.4 y JDK 21 (Compilacion)
FROM gradle:8.14.4-jdk21 AS build
COPY --chown=gradle=gradle . /plazti-play/
WORKDIR /plazti-play
RUN gradle bootJar --no-daemon

#Etapa 2: Runtime con JDK 21 (Ejecución)
FROM eclipse-temurin:21-jdk
WORKDIR /plazti-play
COPY --from=build /platzi-play/build/libs*.jar plazti_play.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "plazti_play.jar"]
