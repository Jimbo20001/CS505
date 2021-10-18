/*
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 * Comprehensive Version (12th ed.). Pearson Education, Inc.
 * Modified by R. Krasso 2021
 * Additional modifications by A. Student 2021
 */
/*
 * Tabor, J. (2021). CIS 505 Intermediate Java Programming. 
 * Bellevue University.
 */
public class Team {
	private String teamName; //Data string to hold the team name
	private String[] players = new String [20];//Limits how many players can be on the team
	private int playerCount = 0; //Starts the player count at zero and adds 1 for every person
	
	public Team (String teamName) {
		this.teamName = teamName; //Constructor for argument of the team name
	}
	
	public void addPlayer(String player) {
		players[playerCount] = player; //Adds player to the data field that are added to the array
		playerCount++;
	}
	
	//Setters and Getters
	public String[] getPlayers() {
		return players;
	}
	
	public int getplayerCount() {
		return playerCount;
	}
	
	public String getteamName() {
		return teamName;
	}
}