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

public class Bag extends Product {
	private String Type;//Type value stored here
	private String Size;//Size value stored here
	
	//No argument constructor
	public Bag() {
		super();
		Type = "";
		Size = "";
	}
	
	//Accessor and mutators for the Bag data fields
	public String getType() {
		return Type;
	}
	
	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}
	
	public void setType(String type) {
		Type = type;
	}
	
	@Override
	/*Output for bag values
	 * Gives description of the bag
	 */
	public String toString() {
		return super.toString()+"\nThe type of bag you have is: " + Type + "\nThe size of the bag is: " + Size; 
	}
}