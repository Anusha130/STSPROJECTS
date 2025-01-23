package com.devlop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlop.Model.CICDplatform;
import com.devlop.Repository.CICDPlatformRepository;

@Service
public class CICDService {
	@Autowired
	private CICDPlatformRepository repo;

	
	public CICDplatform addCICD(CICDplatform cicd) {
		// TODO Auto-generated method stub
		return repo.save(cicd);
	}


	public List<CICDplatform> getallcicd() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public CICDplatform UpdateCICDplatform(CICDplatform cicd) {
		// TODO Auto-generated method stub
		return repo.save(cicd);
	}

	

}
