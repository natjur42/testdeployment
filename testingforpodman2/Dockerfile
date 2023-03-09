FROM eclipse-temurin
# VOLUME /tmp
WORKDIR /testingforpodman2
COPY . .
# ARG  JAR_FILE="./testingforpodman2/build/libs/testingforpodman2-0.0.1-SNAPSHOT.jar"
# COPY ${JAR_FILE} app.jar

COPY testingforpodman2/build.gradle testingforpodman2/gradlew testingforpodman2/gradlew.bat testingforpodman2/settings.graadle /testingforpodman2/
COPY testingforpodman2/gradle /testingforpodman2/gradle
COPY testingforpodman2/.gradle /testingforpodman2/.gradle
RUN ./gradlew --no-daemon dependencies 

COPY testingforpodman2/src /testingforpodman2/src

RUN ./graadlew --no-daemon build

EXPOSE 80

CMD ["java", "-jar", "build/libs/your-app.jar"]