package com.cristian.core.controllers;

import java.util.List;

import com.cristian.core.entities.TablePoints;

public interface TablePointController {
	public List<TablePoints> getTablePointsByIdTournament(int id_tournament);
	public List<TablePoints> getTablePointsByNameTournament(String name_tournament);
	public String updateTablePoints(TablePoints infoTable);
	public String addTablePoints(TablePoints infoTable);
}
