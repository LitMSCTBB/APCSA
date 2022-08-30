import java.util.*;

public class Magic8Ball_ArnavAdhikari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("enteer your question to be answered by the might mighty 8-ballliving inside YOUR COMPURERE. type \"exit\" if you think I'm black magic.");
			
			String res = s.nextLine();
			if (!res.endsWith("?")) {
				System.out.println("must end in question mark and be answerable with yes or no!");
				continue;
			}
			if (res.equals("exit")) break;
			
			int r = (int)(Math.random()*8);
			
			if (r == 0) {
				System.out.println("100000000%");
			}
			if (r == 1) {
				System.out.println("less probable than me living on mars");
			}
			if (r == 2) {
				System.out.println("maybe, maybe not. how bout you just wait and see instead of seeking approval from a literal rng");
			}
			if (r == 3) {
				System.out.println("FOR SURE");
			}
			if (r == 4) {
				System.out.println("not at all");
			}
			if (r == 5) {
				System.out.println("your question doesn't make sense. then again i'm not even reading your question.");
			}
			if (r == 6) {
				System.out.println("75% chance");
			}
			if (r == 7) {
				System.out.println("25% chance");
			}					
		}
		
		s.close();
		
	}

}
