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

import java.text.SimpleDateFormat; 
/*
 * Overall is just a class that holds the data information
 * User inputs information
 * Information is held here in the private strings and private double
 * Dispensed from here when called for
 */

public class Transaction {
	private String Date = new SimpleDateFormat("MM-DD-YYYY").format(new java.util.Date()); //Data field to name the date to add to the expense txt file
	private String Description = ""; //Description data field to add to the expense txt file
	private double Amount = 0.0; //Amount cost data field to add to the expense txt file
	
	//Accessors and mutator methods
	public double getAmount() {
		return Amount;
	}
	
	public String getDate() {
		return Date;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setAmount(double amount) {
		this.Amount = Amount;
	}
	
	public void setDate(String date) {
		this.Date = Date;
	}
	
	public void setDescription(String description) {
		this.Description = Description;
	}
	
	//No argument constructor that is the default
	public Transaction() {
	}
	
	//Argument constructor that creates a new expense based on the data provided
	public Transaction(String Date, String Description, double Amount) {
		this.Date = Date;
		this.Description = Description;
		this.Amount = Amount;
		
	}
	
	//Announcement of the data, expense description and amount spent on said expense
	@Override
	public String toString() {
		return String.format ("\n Today's Date is: " + Date + "\n Description: " + Description + "\n Your amount for today is: " + Amount);
	}
}