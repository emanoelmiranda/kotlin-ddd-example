package com.example.contacts.domain.shared

import java.util.UUID

data class Guid private constructor(val value: UUID) {
    companion object {
        fun fromString(value: String) = Guid(UUID.fromString(value))
        fun generate() = Guid(UUID.randomUUID())
    }

    override fun toString() = value.toString()
}