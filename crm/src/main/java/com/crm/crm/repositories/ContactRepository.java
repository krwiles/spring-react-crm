package com.crm.crm.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crm.crm.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    
}
