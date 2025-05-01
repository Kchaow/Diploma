FROM eclipse-temurin:23.0.2_7-jre
EXPOSE 8009
ADD target/email-service-0.0.1-SNAPSHOT.jar email-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/email-service-0.0.1-SNAPSHOT.jar"]