package com.ltts.model;

public class Team {
	private int team_id;
	private String team_name;
	private String ownerName;
	private String coachName;
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public Team()
	{
		
	}
	public Team(int team_id, String team_name, String ownerName, String coachName) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
		this.ownerName = ownerName;
		this.coachName = coachName;
	}
	@Override
	public String toString() {
		return "team_id=" + team_id + ", team_name=" + team_name + " ownerName = " + ownerName + "coachName = "+coachName +"";
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	
}

