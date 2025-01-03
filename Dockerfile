FROM openjdk:21-jdk-slim
VOLUME /tmp
COPY *.jar capx-0.0.1-SNAPSHOT-exec.jar
ENTRYPOINT ["java","-jar","/capx-0.0.1-SNAPSHOT-exec.jar"]
