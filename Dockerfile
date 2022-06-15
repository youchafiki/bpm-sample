FROM openjdk:8u111-jdk-alpine
VOLUME /tmp
ADD target/bpm-sample-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
