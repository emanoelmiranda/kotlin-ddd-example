package com.example.contacts.domain.shared.validator

interface ValidatorService<T> {
    fun validate(entity: T)
}