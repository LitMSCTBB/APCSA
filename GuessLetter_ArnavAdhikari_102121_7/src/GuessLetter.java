import java.util.Scanner;

public class GuessLetter {
	
	static String word;
	static char guessLetter, randomLetter;
	static int trials;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("type in a word");
		
		word = s.nextLine();
		randomLetter = word.charAt((int)(Math.random()*word.length()));
		trials = word.length()/2;
		
		int y = 0;  // number of tries
		boolean gets = false;
		
		while (y<trials) {
			System.out.println("guess a character from ["+word+"]");
			guessLetter = s.nextLine().charAt(0);
			y++;
			
			if (guessLetter == randomLetter) {
				System.out.println("congrats on  guessing it! so good!!! it  took "+y+" tries");
				gets = true;
				break;
			}
		}
		
		if (!gets) System.out.println("ripp, you took more than "+ trials + " trials. the answer was ... i'm not telling you !!!                                                                      jk it  was '" + randomLetter+"'");
		
		s.close();
	}

}
