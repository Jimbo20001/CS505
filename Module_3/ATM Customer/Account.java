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
import java.util.Date;

public class Account {
	private double balance = 200;
	
	public double getBalance() {
		return balance;
	}
	
	public void Deposit (double amt) {
		balance += amt;
	}
	
	public void withdraw (double amt) {
		if (balance >= amt) {
			balance += amt;
		}
	}
	
	public void displayMenu() {
		System.out.println();
		System.out.println("Account Menu");
		System.out.println("Enter <D/d> for Deposit");
		System.out.println("Enter <W/w> for Withdraw");
		System.out.println("Enter <B/b> for Balance");
		System.out.print("Enter Option >: ");
	}
	
	public String GetTransactionDate() {
		Date Transaction = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
		return formatter.format(Transaction);
	}
}