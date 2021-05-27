package com.cristian.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian.core.entities.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
