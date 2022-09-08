package com.example.contacts.presentation.apis.controllers

import com.example.contacts.domain.entities.Contact
import com.fasterxml.jackson.annotation.JsonProperty

data class ContactResponse(
    @JsonProperty("contactId")
    val contactId: String,

    @JsonProperty("name")
    val name: String
) {
    companion object {
        fun of(contact: Contact) =
            ContactResponse(contact.id.toString(), contact.name)
    }
}
