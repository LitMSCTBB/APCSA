package trio;

public class TrioRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
