package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.User;


@Repository
public interface UserRepo extends JpaRepository<User, String>{

}
