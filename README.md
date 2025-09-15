# Distributed Task Management System (JAVA)

A scalable backend system for distributed task management, built with Java and Spring Boot. Supports user authentication, task assignment, status tracking, and RESTful APIs.

## Features
- User registration and authentication (JWT-based)
- Task creation, assignment, and status updates
- Role-based access control (Admin, User)
- RESTful API endpoints for all operations
- Distributed architecture ready for scaling
- Error handling and validation

## Technologies Used
- Java 17+
- Spring Boot
- Spring Security (JWT)
- Hibernate/JPA
- PostgreSQL/MySQL (configurable)
- Gradle

## Getting Started

### Prerequisites
- Java 17 or higher
- Gradle
- PostgreSQL/MySQL

### Setup

1. **Clone the repository**
   ```bash
   git clone <repo-url>
   cd task-management-system
   ```

2. **Configure Database**
   - Edit `src/main/resources/application.yaml` with your DB credentials.

3. **Build and Run**
   ```bash
   ./gradlew build
   ./gradlew bootRun
   ```

4. **API Documentation**
   - Swagger UI available at `/swagger-ui.html` (if enabled).

## Usage

- Register a user via `/api/auth/register`
- Login via `/api/auth/login` to receive JWT token
- Use token for authenticated requests to `/api/tasks`, `/api/users`, etc.


[//]: # (Needs refactoring)
[//]: # (## Main Endpoints)

[//]: # ()
[//]: # (| Endpoint                | Method | Description                |)

[//]: # (|-------------------------|--------|----------------------------|)

[//]: # (| `/api/auth/register`    | POST   | Register new user          |)

[//]: # (| `/api/auth/login`       | POST   | Authenticate user          |)

[//]: # (| `/api/tasks`            | GET    | List all tasks             |)

[//]: # (| `/api/tasks`            | POST   | Create new task            |)

[//]: # (| `/api/tasks/{id}`       | PUT    | Update task                |)

[//]: # (| `/api/tasks/{id}`       | DELETE | Delete task                |)

## Project Structure

- `src/main/java/.../controller` - REST controllers
- `src/main/java/.../service` - Business logic
- `src/main/java/.../model` - Entity models
- `src/main/java/.../repository` - Data access

[//]: # (Pending needs to be developed)
[//]: # (- `src/main/java/.../security` - JWT & security config )

## Docker

How to spin up the environment:

```commandline
docker compose --env-file .env up --build
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first.

## License

MIT
