package com.devlop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlop.Model.AgentModel;
import com.devlop.Service.AgentService;

@RestController
@RequestMapping("agent")
public class AgentController {
@Autowired
private AgentService service;
@PostMapping("/add")
public AgentModel addAgent(@RequestBody AgentModel agent ){
	return service.addAgent(agent);
}
@GetMapping("/all")
public List<AgentModel> getallAgent(){
	return service.getallAgent();
}
@PutMapping("/update")
	public AgentModel UpdateAgent(@RequestBody AgentModel agent ){
		return service.UpdateAgent(agent);	
}
}
