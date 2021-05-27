package com.cristian.core.services;

import java.util.List;
import java.util.Optional;

import com.cristian.core.entities.Team;

public interface TeamService {
	public String registerTeam(Team informationTeam);
	public Optional<Team> getTeamById(int id_team);
	public List<Team> getTeams();
}
