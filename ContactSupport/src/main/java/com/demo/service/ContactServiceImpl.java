package com.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list = List.of(new Contact(22L,"Ram@gmail.com",22L),
			new Contact(23L,"Raj@gmail.com",23L),
			new Contact(24L,"Ajit@gmail.com",24L),
			new Contact(25L,"Mohan@gmail.com",25L),
			new Contact(26L,"Sheeta@gmail.com",26L));

	@Override
	public List<Contact> getContacts(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
