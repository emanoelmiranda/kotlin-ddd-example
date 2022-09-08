package com.example.contacts.domain.exceptions

class ContactAlreadyRegisteredException(
    message: String
): RuntimeException(message)