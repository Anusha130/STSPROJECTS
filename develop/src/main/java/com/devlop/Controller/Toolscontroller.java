package com.devlop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlop.Model.ToolsModel;
import com.devlop.Service.ToolsService;


@RestController
@RequestMapping("tool")
public class Toolscontroller {
@Autowired
private ToolsService service;
@PostMapping("/add")
public ToolsModel addTools(@RequestBody ToolsModel tool) {
	return service.addTools(tool);
	
}
@GetMapping("/all")
public List<ToolsModel> getallTools(){
	return service.getallTools();
}

  @PutMapping("/updatebyId{id}") 
  public ToolsModel updateTools(@RequestBody ToolsModel tool) {
	  return service.updateTools(tool); }
 
}