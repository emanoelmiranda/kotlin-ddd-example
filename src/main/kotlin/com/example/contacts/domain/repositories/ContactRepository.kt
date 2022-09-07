package com.example.contacts.domain.repositories

import com.example.contacts.domain.entities.Contact

interface ContactRepository {
    fun save(contact: Contact): Contact
}