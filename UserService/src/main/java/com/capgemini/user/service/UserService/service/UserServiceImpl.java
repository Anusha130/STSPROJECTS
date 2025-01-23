package com.capgemini.user.service.UserService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.user.service.UserService.entity.User;
import com.capgemini.user.service.UserService.exceptions.ResourceNotFoundException;
import com.capgemini.user.service.UserService.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
   UserRepository userRepo;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id does not exist in the server"+userId));
	}

}
