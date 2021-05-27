package com.cristian.core.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.core.controllers.TeamController;
import com.cristian.core.entities.Team;
import com.cristian.core.services.TeamService;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600) //Front-End
@RestController
public class TeamControllerImpl implements TeamController{

	@Autowired
	private TeamService teamService;
	
	@GetMapping(value = "/team/{id}" , produces = "application/json")
	@Override
	public Optional<Team> getTeamById(@PathVariable int id) {
		return teamService.getTeamById(id);
	}

	@PostMapping(value = "/team/add" , produces = "text/plain")
	@Override
	public String addTeam(Team team) {
		System.out.println(team.getId_team()+" nombre "+team.getName_team());
		return teamService.registerTeam(team);
	}
	
	@GetMapping(value = "/team" , produces = "application/json")
	@Override
	public List<Team> getTeams() {
		return teamService.getTeams();
	}

}
