package com.example.contacts.domain.events

import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.shared.event.DomainEvent

data class ContactCreatedEvent(
    override val entity: Contact
): DomainEvent<Contact>
