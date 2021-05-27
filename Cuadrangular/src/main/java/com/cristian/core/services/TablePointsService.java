package com.cristian.core.services;

import java.util.List;

import com.cristian.core.entities.TablePoints;

public interface TablePointsService {
	public List<TablePoints> getTablePointsByIdTournament(int id_tournament);
	public List<TablePoints> getTablePointsByNameTournament(String name_tournament);
	public String updateTablePoints(TablePoints infoTable);
	public String registerTablePoints(TablePoints infoTable);
}
