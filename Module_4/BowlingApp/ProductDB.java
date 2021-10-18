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


public class ProductDB {
	//Returns the products based upon the select value or typed word
	public static GenericQueue<Product> getProducts(String code){
		//User inputs the word bag and it produces all the bag products
		if(code.equalsIgnoreCase("Bag")) {
			//Creates a new GenericQueue of bags
			GenericQueue<Product> Bags =  new GenericQueue<Product>();
			
			//Bag 1 values
			Bag Firstbag = new Bag();//Creates new bag
			Firstbag.setCode("0001");//ID for code string
			Firstbag.setPrice(10.00);//Value for price string
			Firstbag.setDescription("Basic Bag");
			Firstbag.setType("New Player");
			Firstbag.setSize("Small");
			Bags.enqueue(Firstbag);
			
			//Bag 2 values
			Bag Secondbag = new Bag();
			Secondbag.setCode("0002");//ID for code string
			Secondbag.setPrice(20.00);//Value for price string
			Secondbag.setDescription("Intermidate Bag");
			Secondbag.setType("Advance Player");
			Secondbag.setSize("Medium");
			Bags.enqueue(Secondbag);
			
			//Bag 3 values
			Bag Thirdbag = new Bag();
			Thirdbag.setCode("0003");//ID for code string
			Thirdbag.setPrice(30.00);//Value for price string
			Thirdbag.setDescription("Expert Bag");
			Thirdbag.setType("Expert Player");
			Thirdbag.setSize("Large");
			Bags.enqueue(Thirdbag);
			
			//Bag 4 values
			Bag Fourthbag = new Bag();
			Fourthbag.setCode("0004");//ID for code string
			Fourthbag.setPrice(40.00);//Value for price string
			Fourthbag.setDescription("Special Bag");
			Fourthbag.setType("Professional Player");
			Fourthbag.setSize("Extra Large");//Value for Size string
			Bags.enqueue(Fourthbag);
			
			//Returns all the bags from above
			return Bags;
		}
		
		//If the user inputs the word Ball, all the ball products will be produced
		else if(code.equalsIgnoreCase("Ball")) {
			//Creates a new GenericQueue so that all ball products will be returned
			GenericQueue<Product> Balls = new GenericQueue<Product>();
            
			//Ball 1 values
			Ball Smallball = new Ball();//Creates new ball
            Smallball.setCode("1000");//ID for code string
            Smallball.setPrice(25.00);//Value for price string
            Smallball.setDescription("Beginner Ball");
            Smallball.setColor("Dark Blue");
            Smallball.setWeight("5 Pounds");
            Balls.enqueue(Smallball);

            //Ball 2 Values
            Ball Biggerball = new Ball();
            Biggerball.setCode("1001");//ID for code string
            Biggerball.setPrice(50.00);//Value for price string
            Biggerball.setDescription("Class Ball");
            Biggerball.setColor("Silver");
            Biggerball.setWeight("6 Pounds");
            Balls.enqueue(Biggerball);

            //Ball 3 Values
            Ball Mediumball = new Ball();
            Mediumball.setCode("1003");//ID for code string
            Mediumball.setPrice(75.00);//Value for price string
            Mediumball.setDescription("Advance Ball");
            Mediumball.setColor("Green");
            Mediumball.setWeight("8 Pounds");
            Balls.enqueue(Mediumball);

            //Ball 4 Values
            Ball Expertball = new Ball();
            Expertball.setCode("1004");//ID for code string
            Expertball.setPrice(100.00);//Value for price string
            Expertball.setDescription("Expert Ball");
            Expertball.setColor("Red");
            Expertball.setWeight("10 Pounds");
            Balls.enqueue(Expertball);

            //Ball 5 Values
            Ball Professionalball = new Ball();//Creates new ball
            Professionalball.setCode("1005");//ID for code string
            Professionalball.setPrice(2000.00);//Value for price string
            Professionalball.setDescription("Professional Ball");// Wording for description string
            Professionalball.setColor("Gold");//Color value for color string
            Professionalball.setWeight("12 Pounds");// Weight value for weight string
            Balls.enqueue(Professionalball);//Outputs ball 5

            //Returns the new GenericQueue for all ball objects
            return Balls;
		}
		
		//If a user inputs the word Shoe they will get all the shoe products that are created
		else if(code.equalsIgnoreCase("Shoe")) {
			//Creates a new GenericQueue for the shoe products to be returned
			GenericQueue<Product> Shoes = new GenericQueue<Product>();
			
			Shoe BeginnerShoe = new Shoe();//Creates new shoe
			BeginnerShoe.setCode("9999");//ID for code string
			BeginnerShoe.setPrice(20.00);//Value for price string
			BeginnerShoe.setDescription("New Player Shoes");
			BeginnerShoe.setSize(6.0);
			BeginnerShoe.setLaceColor("Green");
			Shoes.enqueue(BeginnerShoe);//Outputs shoe 1
			
			Shoe ClassShoe = new Shoe();
			ClassShoe.setCode("9998");//ID for code string
			ClassShoe.setPrice(40.00);//Value for price string
			ClassShoe.setDescription("Class Shoes");
			ClassShoe.setSize(8.0);
			ClassShoe.setLaceColor("Red");
			Shoes.enqueue(ClassShoe);
			
			Shoe AdvanceShoe = new Shoe();
			AdvanceShoe.setCode("9997");//ID for code string
			AdvanceShoe.setPrice(60.00);//Value for price string
			AdvanceShoe.setDescription("Advance Shoes");
			AdvanceShoe.setSize(10.0);
			AdvanceShoe.setLaceColor("Black");
			Shoes.enqueue(AdvanceShoe);
			
			Shoe ExpertShoe = new Shoe();
			ExpertShoe.setCode("9996");//ID for code string
			ExpertShoe.setPrice(80.00);//Value for price string
			ExpertShoe.setDescription("Expert Shoes");
			ExpertShoe.setSize(12.0);
			ExpertShoe.setLaceColor("Purple");
			Shoes.enqueue(ExpertShoe);
			
			Shoe ProfessionalShoe = new Shoe();
			ProfessionalShoe.setCode("9995");//ID for code string
			ProfessionalShoe.setPrice(100.00);//Value for price string
			ProfessionalShoe.setDescription("Professional Shoes");
			ProfessionalShoe.setSize(14.0);//Value for Size string
			ProfessionalShoe.setLaceColor("Gold");//Value for LaceColor string
			Shoes.enqueue(ProfessionalShoe);
			
			//Returns the new GenericQueue that has all the shoe products stored on it
			return Shoes;
		}
		
		//If the user inputs the x, the program will quit and it will return an empty GenericQueue
		else {
			//Empty GenericQueue
			return new GenericQueue<Product>();
			
		}
	}
}