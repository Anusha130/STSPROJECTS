package com.SpringBootCrud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootCrud.model.Usersdetail;
import com.SpringBootCrud.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	public UserService service;

	@GetMapping("/allUserdetails")
	public List<Usersdetail> getAlluserdetails() {

		return service.getAlldetails();
	}

	@PostMapping("/adduserdetails")
	public Usersdetail addUserdetails(@RequestParam Usersdetail user) {
		return service.addUser(user);

	}

	@PutMapping("/updateuser")
	public Usersdetail UpdateUserdetails(@RequestParam Usersdetail user) {
		return service.UpdateUser(user);
	}
	@DeleteMapping("/deleteById")
	public Usersdetail DeleteUserdetails(@RequestParam Usersdetail user) {
		
		
		System.out.println("deleted successfully");
		return service.UpdateUser(user);
	}
	
}

