package com.example.contacts.application.impl

import com.example.contacts.application.RegisterContactAppService
import com.example.contacts.application.dto.ContactDto
import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.events.ContactCreatedEvent
import com.example.contacts.domain.repositories.ContactRepository
import com.example.contacts.domain.shared.event.PublishDomainEvent
import org.springframework.stereotype.Service

@Service
class RegisterContactAppServiceImpl(
    private val contactRepository: ContactRepository,
    private val publishDomainEvent: PublishDomainEvent<Contact>
): RegisterContactAppService {

    override fun register(contactDto: ContactDto) {
        val contact = contactRepository.save(contactDto.toModel())

        publishDomainEvent.publish(ContactCreatedEvent(contact))
    }
}