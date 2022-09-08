package com.example.contacts.infrastructure.configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfiguration {

    @Bean
    fun customOpenAPI(@Value("\${springdoc.version}") appVersion: String?): OpenAPI? {
        return OpenAPI().info(
            Info().title("Controller API")
                .version(appVersion)
                .description("This is a sample server created using springdocs - a library for OpenAPI 3 with spring boot.")
                .termsOfService("http://swagger.io/terms/")
                .license(
                    License().name("Apache 2.0")
                        .url("http://springdoc.org")
                )
        )
    }
}