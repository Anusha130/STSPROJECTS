package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.ContactsModel;
import com.example.demo.repo.ContactsRepo;
import com.example.demo.service.ContactsService;
@RunWith(SpringRunner.class)
@SpringBootTest
class ContactdetailsApplicationTests {
    @Autowired
	private ContactsService service;
	@MockBean
	private ContactsRepo repo;
	@Test
	public void getContactsTest() {
		when(repo.findAll()).thenReturn(Stream.
	of(new ContactsModel(1,"anitha",98764321),new ContactsModel(33,"juli",789865465)).collect(Collectors.toList()));
		assertEquals(2,service.allContacts().size());
	}
	@Test
	public void saveContactsTest() {
		ContactsModel contact = new ContactsModel(34,"sunitha",889977654);
		when(repo.save(contact)).thenReturn(contact);
		assertEquals(contact,service.addContact(contact));
		
	}
	/*
	 * @Test public void deleteContactByslNoTest() { int slNo =3;
	 * when(repo.deleteContactByslNo(3)).thenReturn(Stream. of( new
	 * ContactsModel(1,"anitha",98764321)).collect(Collectors.toList()));
	 * 
	 * }
	 */
	
}
