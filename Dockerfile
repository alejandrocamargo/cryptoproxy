FROM openjdk:8-jdk-alpine
COPY target/cryptoproxy-0.0.1-SNAPSHOT.jar cryptoproxy-0.0.1-SNAPSHOT.jar
RUN java -jar /cryptoproxy-0.0.1-SNAPSHOT.jar