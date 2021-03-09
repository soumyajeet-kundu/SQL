package com.ltts.model;
import java.sql.Date;
import java.time.*;
public class Player {

	private int player_id;
	private String player_name;
	private String player_address;
	private int player_numberOfMatches;
	private int wickets;
	private String skill;
	private Date dateOfBirth;
	private int teamId;

	public Player() {
	}


	public Player(String player_name, String player_address, int player_numberOfMatches, int wickets, String skill, Date dateOfBirth, int teamId) {
		this.player_name = player_name;
		this.player_address = player_address;
		this.player_numberOfMatches = player_numberOfMatches;
		this.wickets = wickets;
		this.skill = skill;
		this.dateOfBirth = dateOfBirth;
		this.teamId = teamId;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPlayer_address() {
		return player_address;
	}

	public void setPlayer_address(String player_address) {
		this.player_address = player_address;
	}

	@Override
	public String toString() {
		return "player_id=" + player_id + ",player_name=" + player_name + ", player_address=" + player_address
				+ ",  numberOfMatch=" + player_numberOfMatches + ",  wickets=" + wickets + ",  skill =" + skill + "";
	}

	public int getPlayer_numberOfMatches() {
		return player_numberOfMatches;
	}

	public void setPlayer_numberOfMatches(int player_numberOfMatches) {
		this.player_numberOfMatches = player_numberOfMatches;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date date) {
		this.dateOfBirth = date;
	}


	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
