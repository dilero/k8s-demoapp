FROM maven:3.5-jdk-8-alpine
ENV APP_HOME /demoApp
RUN mkdir $APP_HOME
COPY pom.xml $APP_HOME
COPY src $APP_HOME/src/
WORKDIR $APP_HOME
RUN mvn package

FROM openjdk:8-jdk-alpine
WORKDIR $APP_HOME
RUN pwd
RUN ls
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]