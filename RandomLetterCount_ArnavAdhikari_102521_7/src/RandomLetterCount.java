import java.util.Scanner;

public class RandomLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String phrase = s.nextLine();
		
		char letter = phrase.charAt((int)(Math.random()*phrase.length()));
		
		while (!Character.isLetter(letter)) letter = phrase.charAt((int)(Math.random()*phrase.length()));
		
		int letterCount = 0;
		for (int i=0; i<phrase.length(); i++) {
			if ((""+phrase.charAt(i)).toLowerCase().equals((""+letter).toLowerCase())) letterCount++;
		}
		
		System.out.println("There are " + letterCount + " occurences of '" + (""+letter).toLowerCase() + "' or '" + (""+letter).toUpperCase() + "' in the phrase \"" + phrase +  "\".");
		
		s.close();
	}

}
