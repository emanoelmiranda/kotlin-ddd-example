package com.example.contacts.application

import com.example.contacts.application.dto.ContactDto
import com.example.contacts.application.impl.RegisterContactAppServiceImpl
import com.example.contacts.domain.entities.Contact
import com.example.contacts.domain.repositories.ContactRepository
import com.example.contacts.domain.shared.event.PublishDomainEvent
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class RegisterContactAppServiceImplTest {

    @Mock
    private lateinit var contactRepository: ContactRepository

    @Mock
    private lateinit var publishDomainEvent: PublishDomainEvent<Contact>

    private lateinit var appService: RegisterContactAppService

    @BeforeEach
    fun setUp() {
        appService = RegisterContactAppServiceImpl(
            contactRepository,
            publishDomainEvent
        )
    }

    @Test
    fun `Should register a contact with success`() {
        val contactDto = ContactDto("João da Silva")
        val contact = contactDto.toModel()

        Mockito.`when`(contactRepository.save(contact)).thenReturn(contact)

        appService.register(ContactDto("João da Silva"))

        Mockito.verify(contactRepository.save(contact))
    }
}