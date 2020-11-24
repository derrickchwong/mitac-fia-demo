package com.example.mitacfiademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactRestController {

    @Autowired ContactService contactService;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return contactService.getAllContacts();
    }

    @GetMapping("/contact/{id}")
    public Contact getContactById(@PathVariable Long id){
        return contactService.getContactById(id);
    }

    @PostMapping("/contact")
    public Contact addContact(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }

    @GetMapping("/findcontact/{name}")
    public List<Contact> findContactByName(@PathVariable String name){
        return contactService.getContactsByName(name);
    }
}
