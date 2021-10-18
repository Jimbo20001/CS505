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

public class Ball extends Product {
	private String Color;//Value is stored here in the color string
	private String Weight;//Value is stored here in the weight string
	
	//A no argument constructor
	public Ball() {
		super();
		Color = "";
		Weight = "";
	}
	
	//Accessor and mutators for the color and weight values
	public String getColor() {
		return Color;
	}
	
	public String getWeight() {
		return Weight;
	}
	
	public void setColor(String color) {
		Color = color;
	}
	
	public void setWeight(String weight) {
		Weight = weight;
	}
	
	@Override
	//Output for the values of the ball descriptions
	public String toString() {
		return super.toString()+ "\nThe color of the ball is: " + Color + "\nIt's weight is: " + Weight;
	}
}