package com.commonwealth.contact.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.commonwealth.contact.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

	List<Contact> findByName(String name);
	
	List<Contact> findByPhone(String phone);
}
