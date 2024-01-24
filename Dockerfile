FROM openjdk:17
EXPOSE 8080
ADD target/webservices.jar webservices.jar
ENTRYPOINT ["java", "-jar", "/webservices.jar"]