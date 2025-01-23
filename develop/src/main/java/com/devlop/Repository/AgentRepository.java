package com.devlop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlop.Model.AgentModel;



@Repository
public interface AgentRepository extends JpaRepository<AgentModel,Integer>{

	

}
