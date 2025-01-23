package com.file.csvToDb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.csvToDb.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
