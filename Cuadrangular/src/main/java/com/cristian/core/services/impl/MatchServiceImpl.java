package com.cristian.core.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.core.entities.Match;
import com.cristian.core.repositories.MatchRepository;
import com.cristian.core.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

	@Autowired
	private MatchRepository matchRepository;

	@Override
	public String registerMatch(Match information_match) {
		try {
			if(information_match != null) {
				matchRepository.save(information_match);
				return "Partido Registrado";
			}
			return "Partido con información Nula";
		} catch (Exception e) {
			return "No se pudo registrar el partido ERROR: "+ e;
		}		
	}

	@Override
	public Optional<Match> getMatchById(int id_match) {
		return matchRepository.findById(id_match);
	}

}
