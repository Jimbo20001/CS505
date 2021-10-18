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
 * Below is the String values needed to hold the data
 */
public class Product {
	private String Code; //ID value for the Product
	private String Description; //Describing the product
	private double Price; //Price values for product
	
	//Default constructor
	public Product() {
		Code = "";
		Description = "";
		Price = 0.0;
	}
	
	//Get the code value that was stored
	public String getCode() {
		return Code;
	}
	
	//Get the description value that was stored
	public String getDescription() {
		return Description;
	}
	
	//Get the price value that was stored
	public double getPrice() {
		return Price;
	}
	
	//All three mutators are below: Code, Description and Price
	public void setCode(String code) {
		Code = code;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public void setPrice(double price) {
		Price = price;
	}
	
	@Override
	//Output of the products values: code, description and price
	public String toString( ) {
		return "Product Number:" + Code + "\nDescription of Product:" + Description + "\nThe price of the product is:" + String.valueOf(Price);
	}
}