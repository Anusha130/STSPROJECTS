package com.devlop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlop.Model.StagesModel;
import com.devlop.Repository.StagesRepository;


@Service
public class StageService {
	@Autowired
	private StagesRepository repo;

	public StagesModel addstage(StagesModel stage) {
		// TODO Auto-generated method stub
		return repo.save(stage);
	}

	public List<StagesModel> getallStages() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public StagesModel updatestage(StagesModel stage) {
		// TODO Auto-generated method stub
		return repo.save(stage);
	}

}
