FROM openjdk:21-jdk

# Copy the JAR file to the container
ADD target/test.jar test.jar

EXPOSE 8090

# Run the application
ENTRYPOINT [ "java","-jar","test.jar" ]