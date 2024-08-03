# Operation Layer

This is a Spring Boot project that implements the operation layer for authentication, authorization, file management, project management, task execution, and monitoring.

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
│   │   │               │   ├── ProjectController.java
│   │   │               │   └── TaskController.java
│   │   │               ├── model
│   │   │               │   ├── User.java
│   │   │               │   ├── File.java
│   │   │               │   └── Project.java
│   │   │               ├── repository
│   │   │               │   ├── UserRepository.java
│   │   │               │   ├── FileRepository.java
│   │   │               │   └── ProjectRepository.java
│   │   │               ├── service
│   │   │               │   ├── AuthService.java
│   │   │               │   ├── FileService.java
│   │   │               │   └── ProjectService.java
│   │   │               └── websocket
│   │   │                   ├── WebSocketConfig.java
│   │   │                   └── TaskWebSocketHandler.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   ├── static
│   │   │   └── templates
│   │   └── webapp
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── operationlayer
│                       ├── OperationLayerApplicationTests.java
│                       └── controller
│                           ├── AuthControllerTest.java
│                           ├── FileControllerTest.java
│                           ├── ProjectControllerTest.java
│                           └── TaskControllerTest.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Getting Started

To run this project, follow these steps:

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd operation-layer`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Configuration

The application can be configured by modifying the `application.properties` file located in the `src/main/resources` directory.

## Usage

The operation layer provides the following functionalities:

- User authentication and registration
- File management (creation, renaming, deletion, modification)
- Project management (synchronization, recovery, configuration)
- Task execution and management
- Monitoring of user machine system information

Refer to the documentation and the source code for detailed usage instructions.

## Testing

To run the tests for this project, execute the following command:

```bash
mvn test
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
```

Please note that this is a template README.md file and you may need to update it with the specific details and instructions relevant to your project.