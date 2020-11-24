package com.example.mitacfiademo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    public Contact getContactById(Long id){

        return contactRepository.findById(id).get();
    }

    public Contact addContact(Contact contact){
        log.info("create new contact {}", contact.getName());
        return contactRepository.save(contact);
    }

    public List<Contact> getContactsByName(String name){
        return contactRepository.findAllByNameCaseInsensitive(name);
    }
}
