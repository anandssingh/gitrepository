package com.cmc.iis.learn.dao;

import java.util.List;

import com.cmc.iis.learn.form.Contact;

public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
