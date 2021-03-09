
package com.ltts.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltts.model.Team;
import com.ltts.util.DatabaseConnection;

//import com.ltts.*;
public class TeamDaoImplementation implements TeamDao {

	static Connection con = DatabaseConnection.getConnection();

	@Override
	public int addTeam(Team tm) throws SQLException {
		String query = "insert into TEAM(team_name, " + "ownerName, " + "coachName) VALUES (?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, tm.getTeam_name());
		ps.setString(2, tm.getOwnerName());
		ps.setString(3, tm.getCoachName());
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public void deleteTeam(int id) throws SQLException {
		String query = "delete from TEAMS where team_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public Team getTeam(int id) throws SQLException {

		String query = "select * from TEAMS where team_id= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, id);
		Team tm = new Team();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			tm.setTeam_id(rs.getInt("team_id"));
			tm.setTeam_name(rs.getString("team_name"));
			tm.setOwnerName(rs.getString("ownerName"));
			tm.setCoachName(rs.getString("coachName"));
		}

		if (check == true) {
			return tm;
		} else
			return null;
	}

	@Override
	public List<Team> getTeams() throws SQLException {
		String query = "select * from TEAMS";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Team> ls = new ArrayList();

		while (rs.next()) {
			Team tm = new Team();
			tm.setTeam_id(rs.getInt("team_id"));
			tm.setTeam_name(rs.getString("team_name"));
			tm.setOwnerName(rs.getString("ownerName"));
			tm.setCoachName(rs.getString("coachName"));
			ls.add(tm);
		}
		return ls;
	}

	@Override
	public void updateTeam(Team tm) throws SQLException {

		String query = "update TEAMS set team_name=?, "+" ownerName = ?, "+" coachName = ? where team_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, tm.getTeam_name());
		ps.setString(2, tm.getOwnerName());
		ps.setString(3, tm.getCoachName());
		
		ps.setInt(4, tm.getTeam_id());
		ps.executeUpdate();
	}
}