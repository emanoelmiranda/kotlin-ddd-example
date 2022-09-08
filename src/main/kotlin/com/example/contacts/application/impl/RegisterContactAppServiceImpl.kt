package com.example.contacts.application.impl

import com.example.contacts.application.RegisterContactAppService
import com.example.contacts.application.dto.ContactCreationDto
import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.events.ContactCreatedEvent
import com.example.contacts.domain.repositories.ContactRepository
import com.example.contacts.domain.shared.event.PublishDomainEvent
import com.example.contacts.domain.shared.validator.ValidatorService
import org.springframework.stereotype.Service

@Service
class RegisterContactAppServiceImpl(
    private val contactRepository: ContactRepository,
    private val publishDomainEvent: PublishDomainEvent<Contact>,
    private val validatorService: ValidatorService<Contact>
): RegisterContactAppService {

    override fun register(input: ContactCreationDto): Contact {
        var contact = input.toModel()

        /**
         * Try exception or return errors list
         */
        validatorService.validate(contact)

        /**
         * Process some application logic...
         */

        contact = contactRepository.save(contact)

        publishDomainEvent.publish(ContactCreatedEvent(contact))

        return contact
    }
}