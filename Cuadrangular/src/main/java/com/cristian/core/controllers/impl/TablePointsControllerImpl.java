package com.cristian.core.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.core.controllers.TablePointController;
import com.cristian.core.entities.TablePoints;
import com.cristian.core.services.TablePointsService;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600) //Front-End
@RestController
public class TablePointsControllerImpl implements TablePointController{

	@Autowired
	private TablePointsService tableService;
	
	@Override
	@GetMapping(value = "/table/{id}" , produces = "application/json")
	public List<TablePoints> getTablePointsByIdTournament(@PathVariable int id_tournament) {
		return tableService.getTablePointsByIdTournament(id_tournament);
	}

	@Override
	@GetMapping(value = "/table/{name}" , produces = "application/json")
	public List<TablePoints> getTablePointsByNameTournament(@PathVariable String name_tournament) {
		return tableService.getTablePointsByNameTournament(name_tournament);
	}

	@Override
	@PutMapping(value ="/table/update" , produces = "application/json")
	public String updateTablePoints(TablePoints infoTable) {
		return tableService.updateTablePoints(infoTable);
	}

	@Override
	@PostMapping(value ="/table/add" , produces = "text/plain")
	public String addTablePoints(TablePoints infoTable) {
		return tableService.registerTablePoints(infoTable);
	}

}
