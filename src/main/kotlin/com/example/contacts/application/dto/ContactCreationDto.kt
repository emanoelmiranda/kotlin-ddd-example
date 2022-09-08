package com.example.contacts.application.dto

import com.example.contacts.domain.entities.Contact

data class ContactCreationDto(
    val name: String,
    val email: String
) {
    fun toModel() = Contact.of(name, email)
}
