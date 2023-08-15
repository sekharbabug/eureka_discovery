# Start with a base image containing Java runtime
FROM openjdk:17-oracle

# Make port 8080 available to the world outside this container
#EXPOSE 8080

ADD target/config-server.jar config-server.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","config-server.jar"]
