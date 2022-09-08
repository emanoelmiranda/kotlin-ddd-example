package com.example.contacts.presentation.apis.controllers

import com.example.contacts.application.RegisterContactAppService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/contacts", consumes = [MediaType.APPLICATION_JSON_VALUE])
class ContactController(
    private val registerContactAppService: RegisterContactAppService
) {

    @PostMapping
    fun register(
        @RequestBody contactRequest: ContactRequest
    ): ResponseEntity<ContactResponse> {

        val contact = registerContactAppService.register(contactRequest.createInput())

        return ResponseEntity.status(HttpStatus.CREATED).body(ContactResponse.of(contact))
    }
}