package com.cristian.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian.core.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
