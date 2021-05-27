package com.cristian.core.controllers;

import java.util.Optional;

import com.cristian.core.entities.Match;

public interface MatchController {
	public String addMatch(Match match);
	public Optional<Match> getMatchById(int id_match);
}
