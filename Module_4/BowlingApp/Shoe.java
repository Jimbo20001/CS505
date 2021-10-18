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

public class Shoe extends Product {
	private double Size;//Size value of the shoe is stored here
	private String LaceColor;//Lace color value of the shoe is stored here
	
	//A no argument constructor
	public Shoe() {
		super();
		Size = 0.0;
		LaceColor = "";
	}
	
	//Accessor and Mutators for the shoe product
	public String getLaceColor() {
		return LaceColor;
	}
	
	public double getSize() {
		return Size;
	}
	
	public void setLaceColor(String color) {
		LaceColor = color;
	}
	
	public void setSize(double size) {
		Size = size;
	}
	
	@Override
	/*Output for the shoe product
	 * Values are posted that were stored into the Size and LaceColor data fields
	 */
	public String toString( ) {
		return super.toString() + "\nThe size of the shoe is: " + String.valueOf(Size) + "\nThe color of the laces on the shoes are: " + LaceColor;
	}
}