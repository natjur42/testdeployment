FROM eclipse-temurin
WORKDIR /testingforpodman2

# COPY testingforpodman2 testingforpodman2

COPY testingforpodman2/build.gradle testingforpodman2/gradlew testingforpodman2/gradlew.bat testingforpodman2/settings.graadle /testingforpodman2/
COPY testingforpodman2/gradle /testingforpodman2/gradle
COPY testingforpodman2/.gradle /testingforpodman2/.gradle
RUN ./gradlew --no-daemon dependencies 

COPY testingforpodman2/src /testingforpodman2/src

RUN ./graadlew --no-daemon build

EXPOSE 80

CMD ["java", "-jar", "build/libs/your-app.jar"]