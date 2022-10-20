package com.demo.service;

import java.util.List;

import com.demo.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContacts(Long userId);

}
