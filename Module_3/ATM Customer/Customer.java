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
 * User data input for below
 * Each set of data is place on a string
 */
public class Customer {
	private String Name; //Person's name is held here
	private String Address; //Person's address is held here
	private String City; //Person's city is held here
	private String Zip; //Person's zip is held here
	private String State; //Person's state is held here
	
	/*
	 * No Argument Constructor is below
	 * I decided that I would use myself for the argument constructor
	 */
	public Customer() {
		Name = "Jim";
		Address = "13198 Blossom Valley Drive";
		City = "Clermont";
		Zip = "34711";
		State = "Florida";
	}
	
	//Below is the argument constructor that creates all the field requirements for the user
	public Customer (String Name, String Address, String City, String Zip, String State) {
		this.Name = Name;
		this.Address = Address;
		this.City = City;
		this.Zip = Zip;
		this.State = State;
	}
	
	//Below are all your accessor methods that are need when getting the user's information
	public String getAddress() {
		return Address;
	}
	public String getCity() {
		return City;
	}
	public String getName() {
		return Name;
	}
	public String getState() {
		return State;
	}
	public String getZip() {
		return Zip;
	}
	
	/*
	 * Override method added
	 * This is used at the end of the program
	 * It will then give the user their information attached to their account
	 */
	@Override
	public String toString() {
		return String.format("My name is: " + Name + "\nThe state I live in is: " + City + 
				"\nThe City that I live in is: " + Zip + "\nMy address is: " + Address + 
				"\nMy zip code is: " + State); 
	}
}