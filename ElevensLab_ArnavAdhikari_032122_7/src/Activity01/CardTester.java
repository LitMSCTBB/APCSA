package Activity01;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("A", "clubs", 15);
		Card c2 = new Card("A", "clubs", 15);
		Card c3 = new Card("4", "spades", 512);
		System.out.println(c1.matches(c2)); System.out.println(c2.matches(c3)); System.out.println(c3.matches(c1));
		System.out.println(c1); System.out.println(c2); System.out.println(c3); 
	}
}
