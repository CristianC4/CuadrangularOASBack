package com.cristian.core.services;

import java.util.List;
import java.util.Optional;

import com.cristian.core.entities.Tournament;

public interface TournamentService {
	public String registerTournament(Tournament informationTournament);
	public Optional<Tournament> getTournamentById(int id_tournament);
	public List<Tournament> getTournaments();
}
