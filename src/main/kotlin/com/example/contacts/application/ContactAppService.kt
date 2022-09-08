package com.example.contacts.application

import com.example.contacts.application.dto.ContactCreationDto
import com.example.contacts.domain.entities.Contact

interface RegisterContactAppService {
    fun register(input: ContactCreationDto): Contact
}

interface UpdateContactAppService {
    fun register(input: ContactCreationDto): Contact
}