FROM openjdk:17

MAINTAINER sonpt

COPY target/api-gateway-1.0.jar app.jar

EXPOSE 8080:8080

ENTRYPOINT ["java","-jar","app.jar"]