package com.cristian.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian.core.entities.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {

}
