package com.example.contacts.presentation.apis.controllers

import com.example.contacts.application.dto.ContactCreationDto

data class ContactRequest(
    val name: String,
    val email: String
) {
    fun createInput() =
        ContactCreationDto(name, email)
}
