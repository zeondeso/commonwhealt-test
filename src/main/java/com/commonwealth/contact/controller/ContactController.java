package com.commonwealth.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commonwealth.contact.model.Contact;
import com.commonwealth.contact.service.ContactServiceInterface;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceInterface contactService;
	
	@GetMapping("/showAllContacts")
	private List<Contact> getAllContact(){
		return contactService.findAll();
		
	}
	
	@GetMapping("/contact/{name}")
	private List<Contact> getContactByName(@PathVariable("name") String name){
		return contactService.findContactByName(name);
	}
	
	@DeleteMapping("/contact/{id}")
	private void deleteContact(@PathVariable("id") Long id) {
		contactService.delete(id);
	}
	
	@PostMapping("/contact")
	private Long saveNewContact(@RequestBody Contact contact) {
		contactService.saveOrUpdate(contact);
		return contact.getId();
	}
	
	@PutMapping("/contact")
	private Contact update(@RequestBody Contact contact) {
		contactService.saveOrUpdate(contact);
		return contact;
	}
}
