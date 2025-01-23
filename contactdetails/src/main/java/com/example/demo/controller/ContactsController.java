package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ErrorResponse;
import com.example.demo.exception.InvalidContactException;
import com.example.demo.model.ContactsModel;
import com.example.demo.service.ContactsService;

@RestController
@RequestMapping("/add")
public class ContactsController {

    private static final Logger logger = LoggerFactory.getLogger(ContactsController.class); // Logger for logging exceptions

	@Autowired
	private ContactsService service;

	@GetMapping("/allContacts")
	public List<ContactsModel> allContacts() {
		

		return service.allContacts();

	}

	
	 @GetMapping("/getByslNo/{slNo}")
	    public ResponseEntity<Object> getContactById(@PathVariable int slNo) {
	        Optional<ContactsModel> contactOptional = service.getContactById(slNo);

	        try {
	            // Check if contact is present
	            if (!contactOptional.isPresent()) {
	                // If contact is not found, throw InvalidContactException
	                throw new InvalidContactException("Invalid slNo: " + slNo); // Exception is thrown here
	            }

	            // Return the contact if found
	            return new ResponseEntity<>(contactOptional.get(), HttpStatus.OK);

	        } catch (InvalidContactException e) {
	            // Log the exception (optional)
	          //  logger.error("Exception occurred: {}", e.getMessage());
	            ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), "Invalid_slNo");
	            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	        }
	    }
	 
	@PostMapping("/addcontact")
	public ResponseEntity<Object> addContact(@RequestBody ContactsModel contact) {
        try {
            // Validate the contact name
            if (contact.getName() == null || contact.getName().isEmpty()) {
                throw new InvalidContactException("You have provided a null or empty name. Please provide a valid name.");
            }

            // Call the service layer to add the contact
            ContactsModel savedContact = service.addContact(contact);

            // Return a successful response with the saved contact
            return new ResponseEntity<>(savedContact, HttpStatus.CREATED);

        } catch (InvalidContactException e) {
            // Handle the InvalidContactException with a specific error code and message
            ErrorResponse errorResponse = new ErrorResponse(e.getMessage(), "INVALID_CONTACT_NAME");
            
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        }
	}
	@DeleteMapping("/deleteContact{slNo}")
	public ContactsModel deleteContactByslNo(@RequestBody ContactsModel contact) {
		return service.deleteContactByslNo(contact);
		
			
		}
	  @PutMapping("/{id}")
	    public ResponseEntity<ContactsModel> updateConcat(@PathVariable int id, @RequestBody ContactsModel model) {
		  ContactsModel updatedUser = service.updateConcats(id, model);
	        return ResponseEntity.ok(updatedUser);
	  }
	/*
	 * @PostMapping("/search") public List<ContactsModel> search(@RequestBody
	 * ContactSearch cons){ return service.search(cons); }
	 */
	 public Map<String, List<Long>> getNameAndNumber() {
	        Map<String, List<Long>> response = new HashMap<>();
	        
	        //List<Long> names = service.getNames(); // Ensure this returns a List<Long>
	      //  List<Long> numbers = service.getNumbers(); // Ensure this returns a List<Long>
	        
	      //  response.put("names", names);
	       // response.put("numbers", numbers);

	        return response;
}
}
	

