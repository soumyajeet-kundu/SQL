package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

//List<Employee> ls = empDao.getEmployees();
//for (Employee allEmp : ls) {
//	System.out.println(allEmp);
//}
import com.ltts.dao.PlayerDaoImplementation;
import com.ltts.dao.TeamDaoImplementation;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class ApplicationMain {

	public static void main(String[] args) throws SQLException, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String playerName, playerAddress, skill;
		String continueKey;
		String dateOfBirth;
		int playerId, numberOfMatches, wickets, teamId;
		int updateField;
		int searchChoice;
		int initialChoice;
		String teamName, ownerName, coachName;
		Player play = new Player();
		Team tm = new Team();
		PlayerDaoImplementation playDao = new PlayerDaoImplementation();
		TeamDaoImplementation teamDao = new TeamDaoImplementation();

		System.out.println("What Would you like to add \n 1. Enter 1 for team \n 2. Enter 2 for player");
		initialChoice = Integer.parseInt(br.readLine());
		switch (initialChoice) {
		case 1:
			do {

				System.out.println("Select One Option from Below Menu \n");
				System.out.println("1: Insert Data Into Team");
				System.out.println("2: Get Data Into Team");
				System.out.println("3: Update Data Into Team");
				System.out.println("4: Delete Data Into Team");
				System.out.println("5. Get All Data from Teams");
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					System.out.println("Enter Team Name \n");
					teamName = br.readLine();
					System.out.println("Enter Owner Name \n");
					ownerName = br.readLine();
					System.out.println("Enter Coach Name \n");
					coachName = br.readLine();
					tm.setTeam_name(teamName);
					tm.setOwnerName(ownerName);
					tm.setCoachName(coachName);
					teamDao.addTeam(tm);
					System.out.println("Data Added Successfully");
					break;
				case 2:
					System.out.println("Ways To Search \n 1. By Id \n");
					searchChoice = Integer.parseInt(br.readLine());
					if (searchChoice == 1) {
						System.out.println("Enter Id to be searched \n");
						teamId = Integer.parseInt(br.readLine());
						System.out.println("Data Fetched");
						Team e = teamDao.getTeam(teamId);
						System.out.println(e.getTeam_id() + " " + e.getTeam_name() + " " + e.getOwnerName() + " "
								+ e.getCoachName());

					} else {
						System.out.println("Invalid choice");
					}
					break;
				case 3:
					System.out.println("Enter Team Id");
					teamId = Integer.parseInt(br.readLine());
					System.out.println("Enter Field to be updated \n");
					System.out.println("Enter 1 for Name Updation \n");
					System.out.println("Enter 2 for Owner Updation \n");
					System.out.println("Enter 3 for Coach Updation \n");

					updateField = Integer.parseInt(br.readLine());
					if (updateField == 1) {
						System.out.println("Enter Team Name");
						teamName = br.readLine();
						Team tempEmployee = teamDao.getTeam(teamId);
						tempEmployee.setTeam_name(teamName);
						teamDao.updateTeam(tempEmployee);
						System.out.println("Successfully Updated");

					} else if (updateField == 2) {
						System.out.println("Enter Owner Name");
						ownerName = br.readLine();
						Team tempEmployee = teamDao.getTeam(teamId);
						tempEmployee.setOwnerName(ownerName);
						teamDao.updateTeam(tempEmployee);
						System.out.println("Successfully Updated");
					} else {
						System.out.println("Enter Coach Name");
						coachName = br.readLine();
						Team tempEmployee = teamDao.getTeam(teamId);
						tempEmployee.setCoachName(coachName);
						teamDao.updateTeam(tempEmployee);
						System.out.println("Successfully Updated");
					}
					break;
				case 4:
					System.out.println("Enter Id to delete \n");
					playerId = Integer.parseInt(br.readLine());
					playDao.delete(playerId);
					System.out.println("Deleted Successfully");
					break;
				case 5:
					System.out.println("All Teams");
					List<Team> ls = teamDao.getTeams();
					for (Team allEmp : ls) {
						System.out.println(allEmp);
					}
					break;
				default:
					System.out.println("Entered Wrong Input");
					break;
				}
				System.out.println("Enter Yes to Continue \n");

				continueKey = br.readLine();

				if (continueKey.equalsIgnoreCase("Yes")) {
					System.out.println("Selected To Continue \n");
				}
			} while (continueKey.equalsIgnoreCase("Yes"));
			System.out.println("Exited ");
			break;
		case 2:
			// PLayer Data
			do {
				System.out.println("Select One Option from Below Menu \n");
				System.out.println("1: Insert Data");
				System.out.println("2: Get Data");
				System.out.println("3: Update Data");
				System.out.println("4: Delete Data");
				System.out.println("5. Get All Data");
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					System.out.println("Enter Player Name \n");
					playerName = br.readLine();
					System.out.println("Enter Player Addess \n");
					playerAddress = br.readLine();
					System.out.println("Enter Number of Matches \n");
					numberOfMatches = Integer.parseInt(br.readLine());
					System.out.println("Enter Number Of Wickets");
					wickets = Integer.parseInt(br.readLine());
					System.out.println("Enter Player Skill \n");
					skill = br.readLine();
					System.out.println("Enter Date of Birth");
					dateOfBirth = br.readLine();
					System.out.println("Enter TeamId");
					teamId = Integer.parseInt(br.readLine());
					Date date = Date.valueOf(dateOfBirth);
					System.out.println(date);
					play.setPlayer_name(playerName);
					play.setPlayer_address(playerAddress);
					play.setPlayer_numberOfMatches(numberOfMatches);
					play.setWickets(wickets);
					play.setSkill(skill);
					play.setDateOfBirth(date);
					play.setTeamId(teamId);
					playDao.add(play);
					System.out.println("Data Added Successfully");
					break;
				case 2:
					System.out.println("Ways To Search \n 1. By Id \n 2.By Name \n 3. By Skill \n 4. By Date \n");
					searchChoice = Integer.parseInt(br.readLine());
					if (searchChoice == 1) {
						System.out.println("Enter Id to be searched \n");
						playerId = Integer.parseInt(br.readLine());
						System.out.println("Data Fetched");
						Player p1 = playDao.getPlayer(playerId);
						System.out.println(p1.getPlayer_name() + " " + p1.getPlayer_address() + " "
								+ p1.getPlayer_numberOfMatches() + " " + p1.getWickets() + " " + p1.getSkill() + " " + p1.getDateOfBirth());

					}  else {
						System.out.println("Invalid choice");
					}

					break;
				case 3:
					System.out.println("Enter Player Id");
					playerId = Integer.parseInt(br.readLine());
					System.out.println("Enter Field to be updated \n");
					System.out.println("Enter 1 for Name Updation \n");
					System.out.println("Enter 2 for Address Updation \n");
					System.out.println("Enter 3 for Number of Match Updation \n");
					System.out.println("Enter 4 for Wickets Updation \n");
					System.out.println("Enter 5 for Skill Updation \n");
					updateField = Integer.parseInt(br.readLine());
					if (updateField == 1) {
						System.out.println("Enter Player Name");
						playerName = br.readLine();
						Player tempEmployee = playDao.getPlayer(playerId);

						tempEmployee.setPlayer_name(playerName);

						playDao.update(tempEmployee);
						System.out.println("Successfully Updated");

					} else if (updateField == 2) {
						System.out.println("Enter Player Name");
						playerName = br.readLine();
						Player tempEmployee = playDao.getPlayer(playerId);
						tempEmployee.setPlayer_name(playerName);
						playDao.update(tempEmployee);
						System.out.println("Successfully Updated");
					} else if (updateField == 3) {
						System.out.println("Enter Number of Matches");
						numberOfMatches = Integer.parseInt(br.readLine());
						Player tempEmployee = playDao.getPlayer(playerId);
						tempEmployee.setPlayer_numberOfMatches(numberOfMatches);
						playDao.update(tempEmployee);
						System.out.println("Successfully Updated");
					} else if (updateField == 4) {
						System.out.println("Enter Wickets");
						wickets = Integer.parseInt(br.readLine());
						Player tempEmployee = playDao.getPlayer(playerId);
						tempEmployee.setWickets(wickets);
						playDao.update(tempEmployee);
						System.out.println("Successfully Updated");
					} else {
						System.out.println("Enter Player Skill");
						skill = br.readLine();
						Player tempEmployee = playDao.getPlayer(playerId);
						tempEmployee.setSkill(skill);
						playDao.update(tempEmployee);
						System.out.println("Successfully Updated");
					}
					break;
				case 4:
					System.out.println("Enter Id to delete \n");
					playerId = Integer.parseInt(br.readLine());
					playDao.delete(playerId);
					System.out.println("Deleted Successfully");
					break;
				case 5:
					System.out.println("All Players");
					List<Player> ls = playDao.getPlayers();
					for (Player allPlayer : ls) {
						System.out.println(allPlayer);
					}
					break;
				default:
					System.out.println("Entered Wrong Input");
					break;
				}
				System.out.println("Enter Yes to Continue \n");

				continueKey = br.readLine();

				if (continueKey.equalsIgnoreCase("Yes")) {
					System.out.println("Selected To Continue \n");
				}
			} while (continueKey.equalsIgnoreCase("Yes"));
			System.out.println("Exited ");
			break;
		default:
			System.out.println("Invalid Choice");
		}

	}
}
