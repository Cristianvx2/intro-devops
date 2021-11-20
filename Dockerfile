FROM maven:3.8.3-jdk-11-slim as builder

COPY . .
EXPOSE 8080

RUN mvn install

FROM openjdk:11-jre-slim-buster

COPY --from=builder /target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java","-jar","/app.jar" ]