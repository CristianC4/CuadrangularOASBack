package com.cristian.core.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.core.entities.Tournament;
import com.cristian.core.repositories.TournamentRepository;
import com.cristian.core.services.TournamentService;

@Service
public class TournamentServiceImpl implements TournamentService{

	@Autowired
	private TournamentRepository tournamentRepository;
	
	@Override
	public String registerTournament(Tournament informationTournament) {
		try {
			if(informationTournament != null) {
				tournamentRepository.save(informationTournament);
				return "Torneo Registrado";
			}
			return "Torneo con información Nula";
		} catch (Exception e) {
			return "No se pudo registrar el torneo ERROR: "+ e;
		}
		
	}

	@Override
	public Optional<Tournament> getTournamentById(int id_tournament) {
		return tournamentRepository.findById(id_tournament);
	}

	@Override
	public List<Tournament> getTournaments() {
		return tournamentRepository.findAll();
	}
	
}
