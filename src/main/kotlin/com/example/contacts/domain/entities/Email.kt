package com.example.contacts.domain.entities

data class Email private constructor(
    val value: String
) {
    companion object {
        private val regex = "^([0-9a-zA-Z]+([_.-]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[0-9,a-z,A-Z,.,-]*(.){1}[a-zA-Z]{2,4})+$"

        fun of(value: String): Email {

            return Email(value)
        }
    }
}
