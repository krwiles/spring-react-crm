package com.crm.crm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.crm.crm.model.Contact;

@CrossOrigin(origins = "http://localhost:3000")
public interface ContactRepository extends CrudRepository<Contact, Long> {
    
}
