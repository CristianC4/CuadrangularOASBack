package com.cristian.core.controllers.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.core.controllers.MatchController;
import com.cristian.core.entities.Match;
import com.cristian.core.services.MatchService;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600) //Front-End
@RestController
public class MatchControllerImpl implements MatchController {
	@Autowired
	private MatchService matchService;

	@Override
	@PostMapping(value ="/match/add" , produces = "text/plain")
	public String addMatch(Match match) {
		return matchService.registerMatch(match);
	}

	@Override
	@GetMapping(value = "/match/{id}" , produces = "application/json")
	public Optional<Match> getMatchById(@PathVariable int id_match) {
		return matchService.getMatchById(id_match);
	}
	
}
