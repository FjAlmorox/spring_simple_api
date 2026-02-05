# Spring Simple API

A simple Spring Boot 3 application with Java 21, providing basic example APIs.

## Features

- **Java 21**: Leveraging the latest LTS features.
- **Spring Boot 4.0.2**: Modern framework for building web applications.
- **REST APIs**: Simple endpoints for testing.

## Getting Started

### Prerequisites

- Java 21
- Maven (wrapper included)

### Running the Application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`.

### API Endpoints

- **GET** `/api/hello` - Returns a welcome message.
- **GET** `/api/time` - Returns the current server time.
- **POST** `/api/echo` - Echoes back the JSON payload with a timestamp.

Example usage:

```bash
curl http://localhost:8080/api/hello
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
