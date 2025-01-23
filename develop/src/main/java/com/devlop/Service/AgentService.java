package com.devlop.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlop.Model.AgentModel;
import com.devlop.Repository.AgentRepository;


@Service
public class AgentService {
	@Autowired
	private AgentRepository repo;

	public AgentModel addAgent(AgentModel agent) {
		// TODO Auto-generated method stub
		return repo.save(agent);
	}

	public List<AgentModel> getallAgent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public AgentModel UpdateAgent(AgentModel agent) {
		// TODO Auto-generated method stub
		return repo.save(agent);
	}

}
