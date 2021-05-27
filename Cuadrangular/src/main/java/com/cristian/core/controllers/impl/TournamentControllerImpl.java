package com.cristian.core.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.core.controllers.TournamentController;
import com.cristian.core.entities.Tournament;
import com.cristian.core.services.TournamentService;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600) //Front-End
@RestController
public class TournamentControllerImpl implements TournamentController{

	@Autowired
	private TournamentService tournamentService;
	
	@Override
	@PostMapping(value ="/tournament/add" , produces = "text/plain")
	public String addTournament(Tournament tournament) {
		return tournamentService.registerTournament(tournament);
	}

	@Override
	@GetMapping(value = "/tournament/{id}" , produces = "application/json")
	public Optional<Tournament> getTournamentById(@PathVariable int id_tournament) {
		return tournamentService.getTournamentById(id_tournament);
	}

	@Override
	@GetMapping(value = "/customers" , produces = "application/json")
	public List<Tournament> getTournaments() {
		return tournamentService.getTournaments();
	}

}
