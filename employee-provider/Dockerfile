# Start with a base image containing Java runtime
FROM openjdk:17-oracle

# Make port 8080 available to the world outside this container
#EXPOSE 8080

ADD target/employee-provider.jar employee-provider.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","employee-provider.jar"]
