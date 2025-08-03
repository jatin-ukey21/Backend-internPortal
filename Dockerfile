# Use Maven image with Java 21 and Maven installed
FROM maven:3.9.4-eclipse-temurin-21 as builder

# Set working directory
WORKDIR /app

# Copy the entire project
COPY . .

# Build the project
RUN mvn clean install -DskipTests

# ----------------------------------------------

# Use a smaller image to run the application
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy the JAR from the builder image
COPY --from=builder /app/target/*.jar app.jar

# Run the JAR
CMD ["java", "-jar", "app.jar"]
