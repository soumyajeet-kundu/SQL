package com.ltts.dao;
import java.sql.SQLException;
import java.util.List;
import com.ltts.model.*;

public interface TeamDao {

	public int addTeam(Team tm) throws SQLException;

	public void deleteTeam(int id) throws SQLException;

	public Team getTeam(int id) throws SQLException;

	public List<Team> getTeams() throws SQLException;

	public void updateTeam(Team tm) throws SQLException;
}