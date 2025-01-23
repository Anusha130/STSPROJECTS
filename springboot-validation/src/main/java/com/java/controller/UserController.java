package com.java.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.User;
import com.java.service.UserService;

@RestController
@RequestMapping("api")

@Validated
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User re = service.createUser(user);
		return new ResponseEntity<User>(re, HttpStatus.CREATED);
	}

	@GetMapping("/getByname")
	public User FindbyUserName(@RequestBody User user) {
		return service.getbyName(user);

	}

	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> user = service.getAllUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	/*
	 * @GetMapping("/allusers") public List<User> getAllUsers() { return
	 * service.getAllUsers(); }
	 */

	@GetMapping("/findById")
	public User getById(@PathVariable int id) {
		return service.getById(id);

	}

}
