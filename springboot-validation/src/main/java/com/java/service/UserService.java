package com.java.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.model.User;
import com.java.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public User createUser(User user) {
		return repo.save(user);
	}

	public User findbyUserName(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	/*
	 * public List<User> getAllUsers() { // TODO Auto-generated method stub return
	 * repo.findAll(); }
	 */

	

	public User getbyName(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return repo.save(id);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		try {
			return repo.findAll();
		} catch (Exception ex) {
			throw new RuntimeException("An error occurred while retrieving employees.");
		}
	}

	/*
	 * public User findByname(String name) { return repo.save(name); // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	/*
	 * public List<User> findById(@Max(value = 5) int id) { // TODO Auto-generated
	 * method stub return repo.save(id); }
	 * 
	 * public List<User> findById(@NotEmpty String email) { // TODO Auto-generated
	 * method stub return repo.save(email); }
	 */

}
