package zdfgdfghfdgs;

public class VideoGame {
	
	//1. Instance Variables
	
	private int year;  // year first published
	private String name;   // game title
	private double price;  // how much when first published
	
	//2. Methods:
	
	//2.1 Constructors  (overload as necessary)
	
	public VideoGame() {  //default.... no parameter list
		
	}
	public VideoGame(String nm) {  //intialize the title
		name = nm;
	}
	public VideoGame(String nm, double price) {  //intialize both price and title
		name = nm;
		this.price = price;  // use of the keyword this as the parameter price is the same as the attribute variable price
	}
	// et  cetera....
	
	
	//2.2 Mutators or SETters... prefixed with "set"... must show all
	
	public void setName(String name) { //note upper case letter of the second word
		this.name = name;  /// notice the parameter and attribute are the same; hence, the "this."
	}
	public void setPrice(double p) {
		this.price = p;  //  "this." refers to the attribute/instance variable
	}
	public void setYear(int y) {
		year = y;  /// notice the parameter and attribute are the same; hence, the "this."
	}
	
	
	//2.3 Accessors or GETters
	
	
	public String getName() { //note upper case letter of the second word
		return name; 
	}
	public double getPrice() {
		return price;  
	}
	public int getYear() {
		return year; 
	}
	
	//2.4 Helper/Auxiliary method
	
	public String toString() {
		// align the colons per line; you can your the attribute or accessor
		
		String str = " Title: " + getName()+ "\n"+
				     " Price: " + price + "\n"+
				     "  Year: " + year ;
		return str;
		
	}
	
	

}
