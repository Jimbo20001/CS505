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

/*
 * A class method that holds the data for 3 different predetermined people
 * All three of these people are not random
 * These are three users that do exist
 * All 5 data fields have been filled out
 */
public class CustomerDB {
	public static Customer getCustomer(Integer ID) {
	if (ID == 1007) 
		{
			return new Customer("Nicholas", "13198 Blossom Valley Drive" , "Florida", "Clermont", "34711");
		}
		else if (ID == 1008)
		{
			return new Customer("Elizabeth", "1180 Seven Seas Drive", "Florida", "Lake Buena Vista", "32836");	
		}
		else if (ID == 1009)
		{
			return new Customer("Nonno", "10 Grant Street", "Massachusetts", "Framingham", "01702");
		}
		else 
		{
			return new Customer();
		}	
	}
}