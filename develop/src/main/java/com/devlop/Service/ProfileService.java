package com.devlop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlop.Model.ProfilesModel;
import com.devlop.Repository.ProfileRepository;


@Service
public class ProfileService {
	@Autowired
	private ProfileRepository repo;

	public ProfilesModel addprofile(ProfilesModel profile) {
		// TODO Auto-generated method stub
		return repo.save(profile);
	}

	public List<ProfilesModel> getallprofiles() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public ProfilesModel updateprofile(ProfilesModel profile) {
		// TODO Auto-generated method stub
		return repo.save(profile);
	}

}
