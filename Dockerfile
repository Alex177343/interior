FROM eclipse-temurin:17-jre-alpine
WORKDIR /app1
COPY target/Interior-0.0.1-SNAPSHOT.jar interior.jar
EXPOSE 8080
CMD ["java", "-jar", "interior.jar"]