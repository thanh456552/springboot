package com.example._giuaki.swagger;

import io.swagger.v3.oas.models.OpenAPI; // Correct import
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() { // Fixed return type
        return new OpenAPI()
                .info(new Info()
                        .title("Shopping Cart API")
                        .version("1.0")
                        .description("API documentation for Shopping Cart application")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("your.email@example.com")
                                .url("https://example.com"))
                );
    }
}
