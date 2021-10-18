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

public class TestComposerApp {
	public static void main(String[] args) {
	
	//Creating a new object to call for when user input is need to be saved
	Scanner music = new Scanner(System.in);
	
	//A boolean object that will allow the user to continue with the app until they are satisfied with its use
	boolean end = false;
	
	//A new list object that used in the while loop
	MemComposerDao list = new MemComposerDao();
	
	while(!end) {
		
		//Prints out a string menu that will give options to the user
		System.out.print(menu());
		String UserInput = music.next();
		
		switch(UserInput) {
		/*
		 * This case calls for the findAll override so that all the composers will be posted
		 * The case then calls the toString to match up the data from the list to the toString post
		 */
		case "1":
			for(Composer composers : list.findAll()) { //Calls for the composers by using the findAll override
				System.out.print(composers.toString()); //findAll override goes into the toString line
			}
			break;
		
		/*
		 * Calls for the user to enter an ID
		 * The ID will find the specific composer and their data
		 * It will then call the findBy override which will post the composer
		 * The composer will then go to the toString line and post the data
		 */
		case "2":
			System.out.print("\n Enter an ID from (9999-9994) unless another composer has been added: ");
			String IDNumber = music.next();
			System.out.print(list.findBy(Integer.valueOf(IDNumber)).toString()); //Calls the findBy override and string toString
			break;
			
		/*
		 * This case calls for user input when adding a new composer
		 * Adds the composers ID, name, genre and recommended song
		 * Takes all the data and inserts it into the Singers arraylist and into the constructor
		 */
		case "3":
			System.out.print("\n Enter a ID here: ");
			String New = music.next();
			music.hasNextLine();
			System.out.print("Enter the persons name or the bands name here: ");
			String BandPerson = music.nextLine();
			System.out.print("Enter the genre of the person or band: ");
			String Genres = music.nextLine();
			System.out.print("Enter their recommended song here: ");
			String Songs = music.nextLine();
			list.insert(new Composer(Integer.valueOf(New), BandPerson, Genres, Songs));
			break;
		
		//Final case allows the user to exit the app
		case "Exit":
			end = true;
			System.out.println("\n Thank you and please come again!");
			break;
		}
	} 
	music.close(); //Ends the loop here
	}
	
	//A string method used to post the menu for the user
	public static String menu() {
		return "\n \n Menu Options \n 1) View Singers  \n 2) Find a Specific Singer (9999-9994)  \n 3) Add a Singer \n 4) Type Exit to end the program! \n Please choose one of the following choices: ";
	}
	
}