package com.test.vishnuvy.springapi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResourceController {

	ConcurrentHashMap<String, Contact> ccHasmap = new ConcurrentHashMap<String, Contact>();

	@GetMapping("/{id}")
	public Contact getContact(@PathVariable String id) {
		System.out.println("Prints contacts");
		return ccHasmap.get(id);
	}

	@GetMapping("/")
	public List<Contact> getAllContacts() {

		System.out.println("Prints all contacts");
		return new ArrayList<Contact>(ccHasmap.values());
	}

	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact) {
		System.out.println("Added all contacts");

		ccHasmap.put(contact.getId(), contact);

		return contact;
	}

}
