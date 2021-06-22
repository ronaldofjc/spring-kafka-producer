## Sample Kafka Producer
This project presents a way to use Kafka as a message producer with Spring Boot

Technologies used: Java, Spring Boot, Maven, Swagger, Lombok, Kafka

Consumer project: ([Link](https://github.com/ronaldofjc/spring-kafka-consumer))


## Pre-Requires

- JDK 11
- Maven 3
- Docker

## Kafka on Docker
```shell script
  $ docker-compose config/docker/kafka/docker-compose.yml
```

## Swagger
- The generated swagger html page is available in the following address
```
    http://localhost:8080/swagger-ui.html
```

## Application Commands

- Compile project
```shell script
  mvn compile
```

- Clear target directory
```shell script
  mvn clean
```

- Start project
```shell script
  mvn spring-boot:run
```

- Install packages
```shell script
  mvn install
```