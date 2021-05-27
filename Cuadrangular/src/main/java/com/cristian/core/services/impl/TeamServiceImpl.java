package com.cristian.core.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.core.entities.Team;
import com.cristian.core.repositories.TeamRepository;
import com.cristian.core.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public String registerTeam(Team informationTeam) {
		
		try {
			if(informationTeam != null) {
				teamRepository.save(informationTeam);
				return "Equipo Registrado!!";
			}
			return "No se pudo registrar el Equipo información nula";
		} catch (Exception e) {
			return "No se pudo registrar el Equipo ERROR: "+ e;
		}
		
	}

	@Override
	public Optional<Team> getTeamById(int id_team) {
		return teamRepository.findById(id_team);
	}

	@Override
	public List<Team> getTeams() {
		return teamRepository.findAll();
	}
}
