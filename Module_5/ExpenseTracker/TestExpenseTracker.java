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
import java.util.ArrayList;
import java.io.IOException;

public class TestExpenseTracker {
	public static void main(String[] args) {
		 	
		//Creating a scanner to allow user input
		Scanner sc = new Scanner(System.in);
		
		//Char that holds the user's decisions based on Yes or Y
		char Continous = 'Y';
		
		//String used to hold user input date
		String Date = "";
		
		//Do statement to allow users to continue till they are done with the program
		do {
			
			//Collecting user inputs
			int input = ValidatorIO.getInt(sc, menu());
			
			//If user inputs a 1 they will get the expenses in the expense.txt file
			if(input == 1) {
				try {
					ArrayList<Transaction> transactions = new ArrayList<Transaction>(TransactionIO.findALL());
					System.out.print("\n Monthly Expenses");
					
					//Creates an array list from the expenses
					for (Transaction transaction : transactions) 
					{
						System.out.println(transaction.toString());
					}
				}
				catch(IOException e) {
					System.out.println("\n Exception (option 1): " + e.getMessage());
				}
			}
			
			//Allows users to input a 2 so that way they can add a transaction to the expense.txt
			else if (input == 2) {
				
				//String value used to hold the users answers
				String Option2 = "yes";
				ArrayList<Transaction> transactions = new ArrayList<>();
				
				//Creates each statement so that it gathers user input
				while (Option2.equalsIgnoreCase("yes")) {
					String description = ValidatorIO.getString(sc, "\n Enter your description here: "); //User inputs the description here
					double amount = ValidatorIO.getDouble(sc, " Enter your amount here: "); //User inputs the cost amount here
					String date = ValidatorIO.getString(sc, " Enter today's date here: "); //User inputs today's date here
					
					//Adds transaction to the expense.txt file
					Transaction SuperTransaction = new Transaction(date, description, amount);
					transactions.add(SuperTransaction);
					
					//Prompts user if they want to create another transaction
					Option2 = ValidatorIO.getString(sc, "\n Want to add another transaction? [Yes/No] ");
					 
					//Prompts user if they do not put in a yes or no answer
					while(!Option2.equalsIgnoreCase("Yes") && !Option2.equalsIgnoreCase("No")) {
						System.out.print("\n You can not enter that!");
						Option2 = ValidatorIO.getString(sc, "\n Want add another transaction? [Yes/No]");
					}
					
				}
				try {
					TransactionIO.bulkInsert(transactions);
				} catch(IOException e) {
					System.out.println("\n Exception: " + e.getMessage());
				}
			} 
			
			//Last option provides the user to view all the expenses (Total amount of expenses in the file)
			else if (input == 3) {
				ArrayList<Transaction> FinalList = null;
				
				//Creates a value to holds the final expenses total in here
				double TotalAmount = 0.0;
				try {
					
					//Calls for all the expenses
					FinalList = TransactionIO.findALL();
				} catch(IOException e) {
					System.out.println("\n Exception: " + e.getMessage());
				}
				
				//Gets the total from all the expenses by adding them all together
				for(Transaction SuperTransaction : FinalList) {
					TotalAmount += SuperTransaction.getAmount();
				}
				
				//Prompts user with a message and the grand total of all the expenses
				System.out.printf("\n The total amount of expenses that you have expended are $%,6.2f. \n", TotalAmount);
			}
			
			//Asks the user if they wish to continue with the program
			System.out.print("\n Do you wish to continue? [Yes/No]: ");
			
			//If user says no then it continues with the next line
			Continous = sc.next().charAt(0);
		}
		
		//Answer has to be a yes
		while(Continous == 'Y' || Continous == 'y');
		
		//Final message asking the user to come back again
		System.out.println("\n Please do come back!");
	}
	
	//Menu that is used for the user to pick an option
	public static String menu() {
		return "\n Menu Options \n Press 1 to view your transactions \n Press 2 to add a Transaction \n Press 3 to view your expenses \n Please choose an option: ";
	}
}