package com.devlop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlop.Model.EnvModel;
import com.devlop.Repository.EnvRepository;


@Service
public class EnvService {
	@Autowired
	private EnvRepository repo;

	public EnvModel addenv(EnvModel env) {
		// TODO Auto-generated method stub
		return repo.save(env);
	}

	public List<EnvModel> getallenv() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public EnvModel updateenv(EnvModel env) {
		// TODO Auto-generated method stub
		return repo.save(env);
	}

}
