package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ContactsModel;

@Repository
public interface ContactsRepo extends JpaRepository<ContactsModel, Integer>{



	ContactsModel save(int slNo);



	

	

	




	



}
