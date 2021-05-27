package com.cristian.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_match;
	@Column
	private int id_local_team;
	@Column
	private int id_visitor_team;
	@Column
	private Date date_match;
	@Column
	private int goal_local;
	@Column
	private int goal_visitor;
	
	@Column
	private int id_tournament;
	
	public int getId_match() {
		return id_match;
	}
	public void setId_match(int id_match) {
		this.id_match = id_match;
	}
	public int getId_local_team() {
		return id_local_team;
	}
	public void setId_local_team(int id_local_team) {
		this.id_local_team = id_local_team;
	}
	public int getId_visitor_team() {
		return id_visitor_team;
	}
	public void setId_visitor_team(int id_visitor_team) {
		this.id_visitor_team = id_visitor_team;
	}
	public Date getDate_match() {
		return date_match;
	}
	public void setDate_match(Date date_match) {
		this.date_match = date_match;
	}
	public int getGoal_local() {
		return goal_local;
	}
	public void setGoal_local(int goal_local) {
		this.goal_local = goal_local;
	}
	public int getGoal_visitor() {
		return goal_visitor;
	}
	public void setGoal_visitor(int goal_visitor) {
		this.goal_visitor = goal_visitor;
	}
	public int getId_tournament() {
		return id_tournament;
	}
	public void setId_tournament(int id_tournament) {
		this.id_tournament = id_tournament;
	}	
}
