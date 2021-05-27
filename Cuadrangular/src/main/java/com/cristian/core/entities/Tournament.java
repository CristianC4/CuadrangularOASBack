package com.cristian.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tournament")
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_tournament;
	@Column
	private String name_tournament;
	@Column
	private Date date_start_tournament;
	@Column
	private Date date_end_tournament;
	public int getId_tournament() {
		return id_tournament;
	}
	public void setId_tournament(int id_tournament) {
		this.id_tournament = id_tournament;
	}
	public String getName_tournament() {
		return name_tournament;
	}
	public void setName_tournament(String name_tournament) {
		this.name_tournament = name_tournament;
	}
	public Date getDate_start_tournament() {
		return date_start_tournament;
	}
	public void setDate_start_tournament(Date date_start_tournament) {
		this.date_start_tournament = date_start_tournament;
	}
	public Date getDate_end_tournament() {
		return date_end_tournament;
	}
	public void setDate_end_tournament(Date date_end_tournament) {
		this.date_end_tournament = date_end_tournament;
	}
	
}
