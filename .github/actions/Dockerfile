FROM eclipse-temurin
# VOLUME /tmp
WORKDIR /testingforpodman2
ARG  JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]