package com.commonwealth.contact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commonwealth.contact.model.Contact;
import com.commonwealth.contact.repository.ContactRepository;

@Service
public class ContactService implements ContactServiceInterface {
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<Contact>();
		contactRepository.findAll().forEach(contact -> contacts.add(contact));
		
		return contacts;
	}

	@Override
	public List<Contact> findContactByName(String name) {
		List<Contact> contacts = new ArrayList<Contact>();
		contactRepository.findByName(name).forEach(contact -> contacts.add(contact));
		
		return contacts;
	}

	@Override
	public List<Contact> findContactByPhone(String phone) {
		List<Contact> contacts = new ArrayList<Contact>();
		contactRepository.findByPhone(phone).forEach(contact -> contacts.add(contact));
		
		return contacts;
	}

	@Override
	public void saveOrUpdate(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public void delete(Long id) {
		contactRepository.deleteById(id);
	}

	@Override
	public void update(Contact contact, Long id) {
		contactRepository.save(contact);
	}
	
	

}
