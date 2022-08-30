package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck d1 = new Deck( new String[] {"A", "B", "C"}, new String[] {"Giraffes", "Lions"}, new int[] { 2,1,6 } );
		Deck d2 = new Deck( new String[] {"A", "B", "C"}, new String[] {"Giraffes", "Monkeys"}, new int[] { 2,1,6 } );
		Deck d3 = new Deck( new String[] {"C", "X", "Z"}, new String[] {"Monkeys", "Lions"}, new int[] { 5,7,12 } );
		System.out.println(d1.size()); System.out.println(d2.size()); System.out.println(d3.size());
		System.out.println(d1.deal()); System.out.println(d2.deal()); System.out.println(d3.deal());
		System.out.println(d1.size()); System.out.println(d2.size()); System.out.println(d3.size());
	}
}
