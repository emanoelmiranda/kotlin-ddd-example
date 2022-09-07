package com.example.contacts.application

import com.example.contacts.application.dto.ContactDto

interface RegisterContactAppService {
    fun register(contactDto: ContactDto)
}