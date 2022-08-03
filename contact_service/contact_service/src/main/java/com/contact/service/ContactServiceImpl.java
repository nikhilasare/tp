package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	
	//fake list of contacts
	
	List<Contact> list =List.of(
			new Contact(1L,"amit@gmail.com","amit",1311L),
			new Contact(2L,"sumit@gmail.com","sumit",1311L)
			,new Contact(3L,"rohan@gmail.com","Rohan",1313L),
			new Contact(4L,"Nikhil@gmail.com","Nikhil",1314L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {

		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
		
	}

}
