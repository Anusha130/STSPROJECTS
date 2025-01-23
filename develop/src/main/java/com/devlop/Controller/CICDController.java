package com.devlop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlop.Model.CICDplatform;
import com.devlop.Service.CICDService;

@RestController
@RequestMapping("cicd")
public class CICDController {
@Autowired
private CICDService service;
@PostMapping("/add")
public  CICDplatform addCICDplatform(@RequestBody CICDplatform cicd ){
	return service.addCICD(cicd);
}
@GetMapping("/all")
public List<CICDplatform> getallcicd(){
	return service.getallcicd();

}
@PutMapping("/Update")
public  CICDplatform UpdateCICDplatform(@RequestBody CICDplatform cicd ){
	return service.UpdateCICDplatform(cicd);
}
}