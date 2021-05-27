package com.cristian.core.controllers;

import java.util.List;
import java.util.Optional;

import com.cristian.core.entities.Team;

public interface TeamController{
	public Optional<Team> getTeamById(int id);
	public String addTeam(Team team); 
	public List<Team> getTeams();
}
