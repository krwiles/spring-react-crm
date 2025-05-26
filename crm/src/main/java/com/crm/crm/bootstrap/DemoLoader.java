package com.crm.crm.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.crm.crm.model.Contact;
import com.crm.crm.repositories.ContactRepository;

@Component
public class DemoLoader implements CommandLineRunner {
    
    private final ContactRepository contactRepository;

    public DemoLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // Note: commandline arguments get passed into args when spring boot loads
    @Override
    public void run(String... args) throws Exception {
        this.contactRepository.save(new Contact("Kurtis", "Wiles", "kwiles2@wgu.edu"));
    }
    
}
