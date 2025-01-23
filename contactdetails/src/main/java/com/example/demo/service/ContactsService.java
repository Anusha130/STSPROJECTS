package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ContactsModel;
import com.example.demo.repo.ContactsRepo;

@Service
public class ContactsService {
@Autowired
private ContactsRepo repo;

public List<ContactsModel> allContacts() {
	// TODO Auto-generated method stub
	List<ContactsModel> contacts = repo.findAll();
	
	System.out.println("getting data fron db:" + contacts);

	return repo.findAll();
}

public ContactsModel addContact(ContactsModel contact) {
	// TODO Auto-generated method stub
	return repo.save(contact);
}

public ContactsModel deleteContactByslNo(ContactsModel contact ) {
	// TODO Auto-generated method stub
        
	return repo.save(contact);
	


}

/*
 * public ContactsModel updateContactByslNo( ContactsModel contact) { // TODO
 * Auto-generated method stub return repo.save(contact); }
 */

/*
 * public List<ContactsModel> search(ContactSearch cons) { // TODO
 * Auto-generated method stub
 * 
 * if(cons.getName()!= null && cons.getNumber()==0) { return }cons. return
 * repo.save(cons); }
 */
/*
 * public boolean searchbyName(String name,)
 * 
 * 
 * 
 * }
 */


public Map<String, Long> getNames() {
    return repo.findAll().stream()
            .collect(Collectors.toMap(ContactsModel::getName, ContactsModel::getNumber));
}

public Map<String, Long> getNumbers() {
    return repo.findAll().stream()
            .collect(Collectors.toMap(ContactsModel::getName, ContactsModel::getNumber));
}

public ContactsModel updateConcats(int id, ContactsModel model) {
	// TODO Auto-generated method stub

	ContactsModel user = repo.findById(id).get();

	        user.setName(model.getName());
	      

	        return repo.save(user);
}

public Optional<ContactsModel> getContactById(int slNo) {
	// TODO Auto-generated method stub
	
        return repo.findById(slNo);
    }
}


