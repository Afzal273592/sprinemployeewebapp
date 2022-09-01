From openjdk:17
Expose 8097
Add target/Web-Employee-Application-0.0.1-SNAPSHOT.jar Web-Employee-Application-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Web-Employee-Application-0.0.1-SNAPSHOT.jar"]