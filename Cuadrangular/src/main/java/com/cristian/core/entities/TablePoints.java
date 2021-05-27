package com.cristian.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tablepoints")
public class TablePoints {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_table;
	@Column
	private int id_team;
	@Column
	private int points;
	@Column
	private int played;
	@Column
	private int win;
	@Column
	private int draw;
	@Column
	private int lose;
	@Column
	private int goals_f;
	@Column
	private int goals_a;
	@Column
	private int difference;
	@Column
	private int id_tournament;
	
	public int getId_table() {
		return id_table;
	}
	public void setId_table(int id_table) {
		this.id_table = id_table;
	}
	public int getTeam_name() {
		return id_team;
	}
	public void setTeam_name(int team_name) {
		this.id_team = team_name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getPlayed() {
		return played;
	}
	public void setPlayed(int played) {
		this.played = played;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getGoals_f() {
		return goals_f;
	}
	public void setGoals_f(int goals_f) {
		this.goals_f = goals_f;
	}
	public int getGoals_a() {
		return goals_a;
	}
	public void setGoals_a(int goals_a) {
		this.goals_a = goals_a;
	}
	public int getDifference() {
		return difference;
	}
	public void setDifference(int difference) {
		this.difference = difference;
	}
	public int getId_tournament() {
		return id_tournament;
	}
	public void setId_tournament(int id_tournament) {
		this.id_tournament = id_tournament;
	}
}
