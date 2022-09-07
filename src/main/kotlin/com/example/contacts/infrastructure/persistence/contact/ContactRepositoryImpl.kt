package com.example.contacts.infrastructure.persistence.contact

import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.repositories.ContactRepository
import org.springframework.stereotype.Component

@Component
class ContactRepositoryImpl: ContactRepository {

    override fun save(contact: Contact): Contact {
        return Contact("Name")
    }
}