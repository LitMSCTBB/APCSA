package trio;

import java.util.Arrays;

//Declare the Trio class.  It must implement the MenuItem interface.
public class Trio implements MenuItem
{
	// declare the instance variables that you need for a trio object
	private Sandwich sw; private Salad s; private Drink d;

	// write a constructor that takes a Sandwich, Salad, and a Drink, in that order
	public Trio(Sandwich sw2, Salad s2, Drink d2) {
		sw = sw2; s = s2; d = d2;
	}

	// write the getName method it should return
	// sandwich name/salad name/drink name Trio
	public String getName() {
		return sw.getName()+"/"+s.getName()+"/"+d.getName()+" Trio";
	}

	// write the getPrice method
	// it should return the price of the two highest price items in the trio.
	public double getPrice() {
		double[] prices = { sw.getPrice(), s.getPrice(), d.getPrice() };
		Arrays.sort(prices); return prices[1]+prices[2];
	}

	public static void main(String[] args)
	{
		Sandwich burger = new Sandwich("Cheeseburger",2.75);
		Sandwich club = new Sandwich("Club Sandwich", 2.75);
		Salad spinachSalad = new Salad("Spinach Salad",1.25);
		Salad coleslaw = new Salad("Coleslaw", 1.25);
		Drink orange = new Drink("Orange Soda", 1.25);
		Drink cap = new Drink("Cappuccino", 3.50);
		Trio trio1 = new Trio(burger,spinachSalad, orange);
		System.out.println("It should print Cheeseburger/Spinach Salad/Orange Soda Trio and it prints: " + trio1.getName());
		System.out.println("It should print 4.0 and it prints: " + trio1.getPrice());
		Trio trio2 = new Trio(club,coleslaw,cap);
		System.out.println("It should print Club Sandwich/Coleslaw/Capuccino Trio and it prints: " + trio2.getName());
		System.out.println("It should print 6.25 and it prints: " + trio2.getPrice());
	}
}
