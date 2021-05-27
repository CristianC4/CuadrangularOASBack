package com.cristian.core.controllers;

import java.util.List;
import java.util.Optional;

import com.cristian.core.entities.Tournament;

public interface TournamentController {
	public String addTournament(Tournament tournament);
	public Optional<Tournament> getTournamentById(int id_tournament);
	public List<Tournament> getTournaments();
}
