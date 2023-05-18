# Use an OpenJDK base image
FROM openjdk:8-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/apollo_docker.jar apollo_docker.jar

# Expose the port on which the application will run (assuming it's port 8080)
EXPOSE 8080

# Set the command to run the application
CMD ["java", "-jar", "apollo_docker.jar"]
