FROM eclipse-temurin:17
COPY target/devopstask2.jar devopstask2.jar
CMD ["java", "-jar", "devopstask2.jar"]