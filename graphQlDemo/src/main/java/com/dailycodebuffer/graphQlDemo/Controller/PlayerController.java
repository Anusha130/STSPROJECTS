package com.dailycodebuffer.graphQlDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.dailycodebuffer.graphQlDemo.Model.Player;
import com.dailycodebuffer.graphQlDemo.Model.Team;
import com.dailycodebuffer.graphQlDemo.Service.Playerservice;

@Controller
public class PlayerController {
	private Playerservice service;
	
	public PlayerController(Playerservice service) {
		this.service = service;
	}
	
	@QueryMapping
	public List<Player> findAll(){
		return service.findAll();
	}
	
	@QueryMapping
	public Optional<Player> findOne(@Argument Integer id){
		return service.findOne(id);
		
	}
	
	@MutationMapping
	public Player create(@Argument String name, @Argument Team team){
	
	// a value you provide for a particular field in your query
		return service.create(name, team);
}
	@MutationMapping
	public Player update(@Argument Integer id,@Argument String name, @Argument Team team){
	return service.update(id,name, team);
}
	@MutationMapping
	public Player delete(@Argument Integer id){
	return service.delete(id);
	}
}
