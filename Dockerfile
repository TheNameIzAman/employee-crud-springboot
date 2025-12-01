# Build stage
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom and source code
COPY pom.xml .
COPY src ./src

# Build the application (jar)
RUN mvn -q -DskipTests package

# Run stage
FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose default port
EXPOSE 8080

# Render provides PORT env variable, and in application.properties
# we set: server.port=${PORT:8080}
ENV PORT=8080

# Start app
ENTRYPOINT ["java","-jar","/app/app.jar"]
