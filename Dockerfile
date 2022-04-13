FROM openjdk:11
ADD target/file-storage-service-0.0.1-SNAPSHOT.jar file-storage-service.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","file-storage-service.jar"]