FROM openjdk:17
EXPOSE 8080
ADD target/webservices.jar webservices.jar
<<<<<<< HEAD
ENTRYPOINT ["java", "-jar", "/webservices.jar"]
=======
ENTRYPOINT ["java", "-jar", "/webservices.jar"]
>>>>>>> origin/main
