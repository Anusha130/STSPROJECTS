package com.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootCrud.model.Usersdetail;

@Repository
public interface UserRepo extends JpaRepository<Usersdetail, Integer> {

}
