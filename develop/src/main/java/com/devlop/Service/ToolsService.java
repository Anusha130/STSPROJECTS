package com.devlop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlop.Model.ToolsModel;
import com.devlop.Repository.ToolsRepository;

@Service
public class ToolsService {
	@Autowired
	private ToolsRepository  repo;

	public ToolsModel addTools(ToolsModel tool) {
		// TODO Auto-generated method stub
		return repo.save(tool);
	}

	public List<ToolsModel> getallTools() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public ToolsModel updateTools(ToolsModel tool) {
		// TODO Auto-generated method stub
		return repo.save(tool);
	}

}
