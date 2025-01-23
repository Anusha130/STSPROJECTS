package com.SpringBootCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootCrud.model.Usersdetail;
import com.SpringBootCrud.repository.UserRepo;

@Service
public class UserService {
	@Autowired

	public UserRepo repo;

	public List<Usersdetail> getAlldetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Usersdetail addUser(Usersdetail user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public Usersdetail UpdateUser(Usersdetail user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public Usersdetail DeleteUser(Usersdetail user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

}
