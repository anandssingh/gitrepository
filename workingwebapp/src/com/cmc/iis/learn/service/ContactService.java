package com.cmc.iis.learn.service;

import java.util.List;

import com.cmc.iis.learn.form.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
