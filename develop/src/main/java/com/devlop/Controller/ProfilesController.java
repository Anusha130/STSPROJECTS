package com.devlop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlop.Model.ProfilesModel;
import com.devlop.Service.ProfileService;

@RestController
@RequestMapping("profile")
public class ProfilesController {
@Autowired
private ProfileService service;
@PostMapping("/add")
public ProfilesModel addprofile(@RequestBody ProfilesModel profile ) {
	return service.addprofile(profile);
}
@GetMapping("/all")
public List<ProfilesModel> getallprofiles(){
	return service.getallprofiles();
}
@PutMapping("/upadte")
public ProfilesModel updateprofile(@RequestBody ProfilesModel profile ) {
	return service.updateprofile(profile);
}
}