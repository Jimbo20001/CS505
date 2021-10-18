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
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransactionIO {
	private final static String FILE_NAME = "expenses.txt"; //Data field used to find and understand that the expenses.txt file is the default
	private static File NewFile = new File(FILE_NAME);
	
	//Static method that is named bulkInsert inserts transactions into the transactions file
	public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
		PrintWriter output = null;
		
		if (NewFile.exists()) 
		{
			output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true)); //Appends the current existing file
		}
		
		else
		{
			output = new PrintWriter(FILE_NAME); //Creates a new file here
		}
		
		for (Transaction tran : transactions) { //Creates the array of data in here based on user input
			output.print(tran.getDate()+ " ");
			output.print(tran.getDescription()+ " ");
			output.println(tran.getAmount());
		}
		output.close(); //Closes once all data has been entered
	}
	/*
	 * Finds all the data within the transaction file and then reproduces it when its called for
	 * Returns the findALL with all data held in it
	 */
	public static ArrayList<Transaction> findALL() throws IOException {
		Scanner UserInput = new Scanner(NewFile);
		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		while(UserInput.hasNext())
		{
			transactions.add(new Transaction(UserInput.next(), UserInput.next(), UserInput.nextDouble()));
		}
		UserInput.close(); //Closes once it is done returning all the data
		return transactions; //Returns transactions here
	}
}