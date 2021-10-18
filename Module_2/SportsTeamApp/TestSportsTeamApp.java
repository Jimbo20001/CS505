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
import java.util.Scanner;

public class TestSportsTeamApp {
	public static void main (String[] args) {
		/* A while loop to make sure the user inputs when asked too
		 * A user must provide a team name and players
		 * Provides the team summary
		 */
		while (true)
			{ 
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a Team Name: "); //Prompts the user to input a team name
			String teamName = reader.nextLine(); //Reads the input from the user and stores it into the string teanName
			
			Team NewerTeam = new Team(teamName); //Creates a new object for the team class
			System.out.print("Enter Players Names (Up to 20 Players).\n"); //Proceed to input players names
			
			System.out.print("Please use commas for multiple players with no spaces: "); 
			String roster = reader.nextLine();//Takes values and stores them
			
			
			String[] NewRoster = roster.split(","); //Converts players into a array
			for(int i=0; i<=NewRoster.length-1; i++) //Performs the loop necessary for the assignment
			{
				NewerTeam.addPlayer(NewRoster[i]);
			}
			
			System.out.println(" ***Team Summary*** ");
			System.out.println(" The team name is: " + NewerTeam.getteamName());//Prints the teams name
			System.out.println(" The Number of players on the team: " + NewerTeam.getplayerCount()); //prints the amount of players
			System.out.println(" The players on the " + NewerTeam.getteamName() + " are: " + NewerTeam.getPlayers()); //prints the team name as well as the players who are in the team
			
			System.out.println(" Continue? (Yes or No): ");
			String startover = reader.nextLine();
			
			if(startover.equals("No"))//if the user enters no the program ends
				System.out.println("Ending program!");
			break;

			}		
	}
}