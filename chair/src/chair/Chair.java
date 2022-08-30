package chair;

public class Chair {
	// A. instance variables
	private String color;
	private double height;
	
	// B. methods
	
	// 1. constructors
	public Chair(String c, double h) {
		color = c;
		height = h;
	}
	
	// 2. Mutator/setter : prefix set
	
	public void setColor(String c) {
		color = c;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	// 3. getter : prefix get
	
	public String getColor() {
		return color;
	}
	
	public double getHeight() {
		return height;
	}
	
	// 4. auxiliary
	
	public String toString() {
		String str = "color: "+color+"\nheight: "+height;
		return str;
	}
}//end
