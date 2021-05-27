package com.cristian.core.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.core.entities.TablePoints;

public interface TablePointsRepository extends JpaRepository<TablePoints, Integer> {
	@Modifying
    @Query(value = "select tp.* from tablepoints as tp, tournament as tor where tp.id_tournament=tor.id_tournament and name_tournament like = ?1", nativeQuery = true)
	@Transactional
    List<TablePoints> getTablePointsByTournamentName(String name_tournament);
	@Modifying
    @Query(value = "select * from tablepoints where id_tournament=?1", nativeQuery = true)
	@Transactional
    List<TablePoints> getTablePointsByTournamentId(int id_tournamentS);
}
