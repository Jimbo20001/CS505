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
/*
 * Overall this class prompts users to input proper values for each data field
 */
public class ValidatorIO {
	//Creates a getInt method that has arguments of scanner sc and string prompt
	public static int getInt(Scanner sc, String prompt) {
		int input = 0; //Input value held here from user input
		boolean isValid = false; //Makes sure value is valid
		
		while(!isValid) {
			System.out.print(prompt);
			
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("\n Error! Invalid integer value. "); //If value is not a proper integer value a system error will appear
			}
			sc.hasNextLine();
		}
		return input; //Returns the input value when called
	}
	
	//Creates a getDouble method with arguments from Scanner sc and String prompt
	public static double getDouble(Scanner sc, String prompt) {
		double input = 0; //Input value is held here for amount
		boolean isValid = false; //Makes sure value is a valid value
		
		while(!isValid) {
			System.out.print(prompt);
			
			if(sc.hasNextInt()) {
				input = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("\n Error! Invalid integer value. "); //Prompts the user that the value is not allowed here
			}
			sc.hasNextLine();
		}
		return input; //Returns back to the user to make a proper input
	}
	
	//Creates a getString method with arguments from Scanner sc and String prompt
	public static String getString(Scanner sc, String prompt) {
		String input = ""; //Makes sure a description value is inputed here
		System.out.print(prompt);		
		if(sc.hasNext()) {
				input = sc.next();
			}
			else
			{
				System.out.println("\n Error! Invalid integer value. "); //Prompts the user to input a proper and provides the user with an error
			}
			sc.hasNextLine();
		return input; //Returns back the user to enter a proper value for the description
	}
}