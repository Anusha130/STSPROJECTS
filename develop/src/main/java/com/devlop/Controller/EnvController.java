package com.devlop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlop.Model.EnvModel;
import com.devlop.Service.EnvService;

@RestController
@RequestMapping("env")
public class EnvController {
@Autowired
private EnvService service;
@PostMapping("/add")
 public EnvModel addenv(@RequestBody EnvModel env) {
	 return service.addenv(env);
 }
@GetMapping("/all")
public List<EnvModel> getallenv(){
	return service.getallenv();
}
@PutMapping("/Update")
public EnvModel updateenv(@RequestBody EnvModel env) {
	 return service.updateenv(env);
}
}
