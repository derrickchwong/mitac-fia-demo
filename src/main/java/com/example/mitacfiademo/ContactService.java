package com.example.mitacfiademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        //
        return contactRepository.save(contact);
    }

    public List<Contact> getContactsByName(String name){
        return contactRepository.findAllByNameCaseInsensitive(name);
    }
}
