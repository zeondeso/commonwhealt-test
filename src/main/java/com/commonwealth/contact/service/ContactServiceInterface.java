package com.commonwealth.contact.service;

import java.util.List;

import com.commonwealth.contact.model.Contact;

public interface ContactServiceInterface {

	List<Contact> findAll();
	
	List<Contact> findContactByName(String name);
	
	List<Contact> findContactByPhone(String phone);
	
	public void saveOrUpdate(Contact contact);
	
	public void delete(Long id);
	
	public void update(Contact contact, Long id);
}
