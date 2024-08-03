# Operation Layer

This is a Spring Boot project for the operation layer of the application.

## Project Structure

```
operation-layer
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── operationlayer
│   │   │               ├── OperationLayerApplication.java
│   │   │               ├── config
│   │   │               │   └── SecurityConfig.java
│   │   │               ├── controller
│   │   │               │   ├── AuthController.java
│   │   │               │   ├── FileController.java
│   │   │               │   └── ProjectController.java
│   │   │               ├── dto
│   │   │               │   └── UserDto.java
│   │   │               ├── model
│   │   │               │   └── User.java
│   │   │               ├── repository
│   │   │               │   └── UserRepository.java
│   │   │               ├── service
│   │   │               │   ├── AuthService.java
│   │   │               │   ├── FileService.java
│   │   │               │   └── ProjectService.java
│   │   │               └── websocket
│   │   │                   └── WebSocketConfig.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── static
│   │   └── webapp
│   │       └── WEB-INF
│   │           └── views
│   │               └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── operationlayer
│                       └── OperationLayerApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Description

- `OperationLayerApplication.java`: The main class of the Spring Boot application. It serves as the entry point for the application.
- `SecurityConfig.java`: The configuration for OAuth 2.0 security. It sets up the authentication and authorization mechanisms for the application.
- `AuthController.java`: The controller class for handling authentication-related endpoints such as user registration and login.
- `FileController.java`: The controller class for handling file-related endpoints such as file creation, renaming, deletion, and modification.
- `ProjectController.java`: The controller class for handling project-related endpoints such as project synchronization and resource management.
- `UserDto.java`: The DTO (Data Transfer Object) class for representing user data transferred between the frontend and the backend.
- `User.java`: The model class for representing the user entity in the database.
- `UserRepository.java`: The repository interface for providing methods for database operations on the user entity.
- `AuthService.java`: The service class for handling user authentication and registration logic.
- `FileService.java`: The service class for handling file-related operations such as file synchronization and management.
- `ProjectService.java`: The service class for handling project-related operations such as project synchronization and resource management.
- `WebSocketConfig.java`: The configuration for WebSocket support. It sets up the WebSocket endpoint and message broker.
- `application.properties`: The application-specific configuration properties such as database connection details and server port.
- `static`: The directory for storing static files such as CSS, JavaScript, and images.
- `index.html`: The HTML template for the frontend view.
- `OperationLayerApplicationTests.java`: The test class that includes test cases for the application.
- `mvnw` and `mvnw.cmd`: The Maven wrapper scripts that allow you to run Maven commands without having to install Maven globally.
- `pom.xml`: The Maven configuration file that lists the project dependencies and plugins.
- `README.md`: The documentation for the project.

Please refer to the individual files for more details on their implementation and functionality.

```

This file provides an overview of the project structure and describes the purpose of each file in the project. It serves as a reference for developers working on the project to understand the organization and functionality of the codebase.

You can update this file as the project evolves to reflect any changes or additions to the project structure or functionality.

Feel free to modify this file according to your project's specific requirements and add any additional information or instructions that may be helpful for developers working on the project.
```