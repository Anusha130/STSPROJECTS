package com.dailycodebuffer.graphQlDemo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.graphQlDemo.Model.Player;
import com.dailycodebuffer.graphQlDemo.Model.Team;

import jakarta.annotation.PostConstruct;

@Service
public class Playerservice {

	private List<Player> list = new ArrayList<>();

	AtomicInteger id = new AtomicInteger(0);// used to get the id sequentially

	public List<Player> findAll() {
		return list;

	}

	public Optional<Player> findOne(Integer id) {
		return list.stream().filter(list -> list.Id() == id).findFirst();
	}

	public Player create(String name, Team team) {
		Player player = new Player(id.incrementAndGet(), name, team);
		// increamentandgetis built in method in automaticInteger
		// we will get the increament inetager sequentially
		list.add(player);
		return player;

	}

	public Player delete(Integer id) {
		Player player = list.stream().filter(c -> c.Id() == id).findFirst()
				.orElseThrow(() -> new IllegalArgumentException());
		list.remove(player);
		return player;

	}
	public Player update(Integer id,String name ,Team team) {
		Player updatedplayer = new Player(id,name,team);
		Optional<Player>opt = list.stream().filter(c ->c.Id()==id).findFirst();
		if(opt.isPresent()) {
			Player player = opt.get();
			int index = list.indexOf(player);
			list.set(index, updatedplayer);
		}
		else {
			throw new IllegalArgumentException("player not found");
		}
		return updatedplayer;
	}
	
	
	@PostConstruct
	private void init() {
		list.add(new Player(id.incrementAndGet(),"Msdhoni",Team.csk));
		list.add(new Player(id.incrementAndGet(),"Rohoit sharma",Team.Mi));
		list.add(new Player(id.incrementAndGet(),"Suresh Raina",Team.Dc));
		list.add(new Player(id.incrementAndGet(),"hgsyfd",Team.Gt));
		list.add(new Player(id.incrementAndGet(),"grwv",Team.Rcs));
	}
}
