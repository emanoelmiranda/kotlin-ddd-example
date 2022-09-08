package com.example.contacts.application.dto

import java.util.UUID

data class ContactUpdateDto(
    val id: UUID,
    val name: String,
    val email: String
)