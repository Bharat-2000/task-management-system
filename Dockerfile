# Use official OpenJDK image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy Gradle wrapper and config first (better caching)
COPY gradlew .
COPY gradle ./gradle
COPY build.gradle settings.gradle ./

# Give gradlew execution permissions
RUN chmod +x ./gradlew

# Download dependencies (cached unless build.gradle changes)
RUN ./gradlew dependencies --no-daemon || return 0

# Copy application source
COPY src ./src

# Default command: run Spring Boot app with Gradle
CMD ["./gradlew", "bootRun"]
