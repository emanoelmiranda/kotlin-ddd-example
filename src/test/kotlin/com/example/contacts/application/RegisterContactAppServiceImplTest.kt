package com.example.contacts.application

import com.example.contacts.application.dto.ContactCreationDto
import com.example.contacts.application.impl.RegisterContactAppServiceImpl
import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.events.ContactCreatedEvent
import com.example.contacts.domain.repositories.ContactRepository
import com.example.contacts.domain.shared.event.PublishDomainEvent
import com.example.contacts.domain.shared.validator.ValidatorService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class RegisterContactAppServiceImplTest {

    @Mock
    private lateinit var contactRepository: ContactRepository

    @Mock
    private lateinit var publishDomainEvent: PublishDomainEvent<Contact>

    @Mock
    private lateinit var validationService: ValidatorService<Contact>

    @InjectMocks
    private lateinit var appService: RegisterContactAppServiceImpl

    @Test
    fun `Should register a contact with success`() {
        val contactCreationDto = ContactCreationDto("João da Silva", "joao@gmail.com")
        val contact = contactCreationDto.toModel()

        doNothing().`when`(validationService).validate(contact)

        val result = appService.register(contactCreationDto)

        verify(validationService, times(1)).validate(contact)
    }
}