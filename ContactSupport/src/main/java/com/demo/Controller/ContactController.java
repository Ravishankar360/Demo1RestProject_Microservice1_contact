package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Contact;
import com.demo.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts (@PathVariable("userId") Long userId){
		return this.contactService.getContacts(userId);
	}
	

}

