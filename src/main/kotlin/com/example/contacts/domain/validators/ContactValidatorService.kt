package com.example.contacts.domain.validators

import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.shared.validator.ValidatorService
import org.springframework.stereotype.Component

@Component
class ContactValidatorService: ValidatorService<Contact> {

    override fun validate(entity: Contact) {
        /**
         * Will validate rules that the entity alone cannot validate
         */

        /**
         * In case of the fail, try specific exception or
         * accumulate one queue of errors
         */
    }
}