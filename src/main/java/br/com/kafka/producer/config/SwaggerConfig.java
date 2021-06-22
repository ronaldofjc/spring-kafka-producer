package br.com.kafka.producer.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI greetingApi() {
        return new OpenAPI()
                .info(info());
    }

    private Info info() {
        return new Info()
                .title("API Spring Kafka Producer Messages")
                .description("This project presents a way to use Kafka as a message producer with Spring Boot")
                .version("1.0.0");
    }
}
