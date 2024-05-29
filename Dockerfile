FROM openjdk:17-jdk-alpine
MAINTAINER Wagner Luiz
COPY target/odatagraphql-0.0.1.jar odatagraphql-0.0.1.jar
ENTRYPOINT ["java","-jar","/odatagraphql-0.0.1.jar"]