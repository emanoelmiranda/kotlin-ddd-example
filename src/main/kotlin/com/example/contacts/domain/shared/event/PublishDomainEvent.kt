package com.example.contacts.domain.shared.event

interface PublishDomainEvent<T> {
    fun publish(event: DomainEvent<T>)
}