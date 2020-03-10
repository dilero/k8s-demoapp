FROM maven:3.5-jdk-8-alpine
COPY pom.xml /app/
COPY src /app/src/
WORKDIR /app/
RUN mvn clean package
ENTRYPOINT ["java","-jar","target/demo-0.0.1-SNAPSHOT.jar"]