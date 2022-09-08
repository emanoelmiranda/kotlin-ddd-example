package com.example.contacts.infrastructure.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.concurrent.Executors

@Configuration
class ThreadPoolExecutorsConfiguration {
    @Bean("PublisherEventExecutor")
    fun eventsExecutor() = Executors.newFixedThreadPool(1)
}