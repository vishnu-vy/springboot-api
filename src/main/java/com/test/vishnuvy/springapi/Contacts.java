package com.test.vishnuvy.springapi;

import java.util.List;

public class Contacts {

	private List<Contact> listOfContact;

	public Contacts() {

	}

	public Contacts(List<Contact> listOfContact) {
		super();
		this.listOfContact = listOfContact;
	}

	public List<Contact> getListOfContact() {
		return listOfContact;
	}

	public void setListOfContact(List<Contact> listOfContact) {
		this.listOfContact = listOfContact;
	}

}
