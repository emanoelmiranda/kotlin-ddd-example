package com.example.contacts.infrastructure.event

import com.example.contacts.domain.shared.event.DomainEvent
import com.example.contacts.domain.shared.event.PublishDomainEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class PublishEvent<Any>(
    private val applicationEventPublisher: ApplicationEventPublisher
): PublishDomainEvent<Any> {

    @Async(value = "PublisherEventExecutor")
    override fun publish(event: DomainEvent<Any>) {
        applicationEventPublisher.publishEvent(event)
    }
}