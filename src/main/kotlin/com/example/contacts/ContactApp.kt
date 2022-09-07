package com.example.contacts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ContactApp

fun main(args: Array<String>) {
    runApplication<ContactApp>(*args)
}
