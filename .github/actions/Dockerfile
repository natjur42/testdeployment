FROM eclipse-temurin
ARG  JAR_FILE=testingforpodman2/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
