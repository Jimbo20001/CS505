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
public class TestCustomerAccountApp {
	public static void main(String[] args) {
		System.out.println("Welcome!");
		System.out.print("Enter one of the three customer ID's (1007,1008,1009): "); //User input is done here by putting in one of the three ID's
		Account fakeAccount = new Account(); //Creating new account to store info on
		Scanner ID = new Scanner(System.in);  //Stores the choices made by the user
		Customer Person = CustomerDB.getCustomer(ID.nextInt());
		String Menu; //Variable used to store the choice that user picks between balance, withdraw and deposit
		String FinalAnswer = "YES"; //Variable used for storing the value of choosing to continue
		
		/*
		 * Value's used to decide what the user is going to do
		 * Displays the menu provided from Account.java
		 * Provides an invalid option if user puts something that is not a D,W or B
		 */
		do
		{
			fakeAccount.displayMenu(); //Displays menu from Account.java
			Menu = ID.next(); //Stores decision made by the user
            switch(Menu) 
            {
            case "D": case "d": //Deposit the amount into the user's account
            	System.out.println();
                System.out.print("Enter deposit amount: ");
                fakeAccount.Deposit(ID.nextDouble());
                break;
            case "W": case "w": //Withdraw the amount from the user's account
            	System.out.println();
                System.out.print("Enter withdraw amount: ");
                fakeAccount.withdraw(ID.nextDouble());
                break;
            case "B": case "b": //Provides the balance of the user's account
            	System.out.println();
            	double Balance = fakeAccount.getBalance();
                System.out.printf("Account balance: $%,6.2f\n", fakeAccount.getBalance());
                break;
            default:
                System.out.println("Error: Invalid option");
                break;
        }
            System.out.print("Continue...(YES/NO): "); //Provides option if you wish to continue working on the account
            FinalAnswer = ID.next(); //Stores the answer into the variable
		}
		while(FinalAnswer.charAt(0) == 'Y'); //If the user choose yes, they will continue working with the account
		
		if (FinalAnswer.equals("n") == false) //If the user choose No, then they will be provided with a message about what will be displayed 
		{
			System.out.println();
            System.out.println("Since you said " + FinalAnswer + ", your balance and today's date will be displayed below, along with your information");
        }
		System.out.println();
		System.out.println("--- User's Information ---");
		System.out.println(Person.toString()); //Provides user's information
		System.out.printf("Today's date is %s\n", fakeAccount.GetTransactionDate()); //Provides the transaction date
		System.out.printf("The balance in your account is: $%,6.2f\n", fakeAccount.getBalance());; //Provides the user's balance for that account
		ID.close(); //Closer the ID
	}
}