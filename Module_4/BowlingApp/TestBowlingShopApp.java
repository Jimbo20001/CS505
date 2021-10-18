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
public class TestBowlingShopApp{
	public static void main(String[] args) {
		//Creates a Scanner object so that user input can be stored
		Scanner UserInput = new Scanner(System.in);
		//Holds userinput in this data value
		String UserChoice = "A";
		
		//Continue a loop until the user types out x to quit the program
		while(!UserChoice.equalsIgnoreCase("x")){
			//Displays a menu for the user inputs
			displayMenu();
			UserChoice = UserInput.nextLine();
			//Creates a new GenericQueue to store all the products information
			GenericQueue<Product> Choice = new GenericQueue<Product>();
			//Produces the product that was choosen by the user
			if (Choice instanceof GenericQueue) {
				Choice = ProductDB.getProducts(UserChoice);
				System.out.println("\n**Product Listing**");
				System.out.println("");
			}
			//A loop that gets all the product values and outputs the items to the user
			while(Choice.size() > 0) {
				System.out.println(Choice.dequeue().toString());
				System.out.println("");
			}
		}
	}
	/*A menu used to display the options that are available to the user
	 * As well as asking for the user input
	 */
	public static void displayMenu() {
		System.out.println("Please choose one of the following options:");
		System.out.println("Please type Bag to view the bowling bags <Bag>");
		System.out.println("Please type Ball to view the bowling balls <Ball>");
		System.out.println("Please type Shoe to view the bowling shoes <Shoe>");
		System.out.println("To quit type x below");
		System.out.print("\nYour choice: ");
	}
}