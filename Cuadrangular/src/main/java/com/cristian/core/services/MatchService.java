package com.cristian.core.services;

import java.util.Optional;

import com.cristian.core.entities.Match;

public interface MatchService {
	public String registerMatch(Match information_match);
	public Optional<Match> getMatchById(int id_match);
}
