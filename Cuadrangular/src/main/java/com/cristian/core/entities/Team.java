package com.cristian.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_team;
	@Column
	private String name_team;
	@Column
	private Date date_team;
	@Column
	private String country_team;
	@Column
	private String city_team;
	public int getId_team() {
		return id_team;
	}
	public void setId_team(int id_team) {
		this.id_team = id_team;
	}
	public String getName_team() {
		return name_team;
	}
	public void setName_team(String name_team) {
		this.name_team = name_team;
	}
	public Date getDate_team() {
		return date_team;
	}
	public void setDate_team(Date date_team) {
		this.date_team = date_team;
	}
	public String getCountry_team() {
		return country_team;
	}
	public void setCountry_team(String country_team) {
		this.country_team = country_team;
	}
	public String getCity_team() {
		return city_team;
	}
	public void setCity_team(String city_team) {
		this.city_team = city_team;
	}
	
}
