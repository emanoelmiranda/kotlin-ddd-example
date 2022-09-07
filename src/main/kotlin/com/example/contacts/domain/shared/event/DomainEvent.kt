package com.example.contacts.domain.shared.event

interface DomainEvent<T> {
    val entity: T
}