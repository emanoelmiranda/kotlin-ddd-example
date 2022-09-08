package com.example.contacts.infrastructure.persistence.memory

import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.repositories.ContactRepository
import org.springframework.stereotype.Component

@Component
class MemoryContactRepositoryImpl: ContactRepository {
    override fun save(contact: Contact): Contact {

        /**
         * Should persist in memory with specific persistence entity
         */

        return contact
    }
}