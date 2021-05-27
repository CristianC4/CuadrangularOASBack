package com.cristian.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristian.core.entities.TablePoints;
import com.cristian.core.repositories.TablePointsRepository;
import com.cristian.core.services.TablePointsService;

@Service
public class TableServiceImpl implements TablePointsService{

	@Autowired
	private TablePointsRepository tableRepository;

	@Override
	public List<TablePoints> getTablePointsByIdTournament(int id_tournament) {
		return tableRepository.getTablePointsByTournamentId(id_tournament);
	}

	@Override
	public List<TablePoints> getTablePointsByNameTournament(String name_tournament) {
		return tableRepository.getTablePointsByTournamentName(name_tournament);
	}

	@Override
	public String updateTablePoints(TablePoints infoTable) {
		int num = infoTable.getId_table();
		if (tableRepository.findById(num).isPresent()) {
			TablePoints table = new TablePoints();
			table.setId_table(table.getId_table());
			table.setTeam_name(table.getTeam_name());
			table.setPoints(table.getPoints());
			table.setPlayed(table.getPlayed());
			table.setWin(table.getWin());
			table.setDraw(table.getDraw());
			table.setLose(table.getLose());
			table.setGoals_f(table.getGoals_f());
			table.setGoals_a(table.getGoals_a());
			table.setDifference(table.getDifference());
			tableRepository.save(table);
			return "Customer modificado";
		}
		return "Error al modificar la Tabla";
	}

	@Override
	public String registerTablePoints(TablePoints infoTable) {
		try {
			if(infoTable != null) {
				tableRepository.save(infoTable);
				return "Marcador Registrado!!";
			}
			return "No se pudo registrar el Marcador información nula";
		} catch (Exception e) {
			return "No se pudo registrar el Marcador ERROR: "+ e;
		}
	}
	
}
