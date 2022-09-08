package com.example.contacts.domain.entities

import com.example.contacts.domain.shared.Guid

data class Contact(
    val id: Guid,
    val name: String,
    val email: Email
) {
    companion object {
        fun of(name: String, email: String) =
            Contact(
                id = Guid.generate(),
                name = name,
                email = Email.of(email)
            )
    }
}
