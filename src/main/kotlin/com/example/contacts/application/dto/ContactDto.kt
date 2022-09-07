package com.example.contacts.application.dto

import com.example.contacts.domain.entities.Contact

data class ContactDto(
    val name: String
) {
    fun toModel() = Contact(name)
}
