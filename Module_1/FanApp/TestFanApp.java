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
public class TestFanApp {
	
	public static void main(String[] args) {
		
		//Creates the default constructor
		FanApp fan2 = new FanApp();
		System.out.println(fan2.toString());
		//End of the first fan
		
		//Creates the argument constructor based on the set speed
		FanApp fan1 = new FanApp(2, true, 8, "blue");
		System.out.println(fan1.toString());
		//End of the second fan
		
	}// End Main
} //End Class TestFanApp