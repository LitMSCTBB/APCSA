import java.util.Scanner;

public class GuessNumber {
	
	static int guessNum, trials, randomNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("guess a number");
		
		int a = -10; int b = 40;
		
		randomNum =  (int)(Math.random()*(b-a+1))+a;
		trials = 2;
		
		int y = 0;  // number of tries
		boolean gets = false;
		
		while (y<trials) {
			guessNum = s.nextInt();
			y++;
			
			if (guessNum == randomNum) {
				System.out.println("congrats on  guessing it! so good!!! it  took "+y+" tries");
				gets = true;
				break;
			} else if (guessNum > randomNum) {
				System.out.println("too high bro chill out");
			} else {
				System.out.println("you depressed or something? becauses that was too low");
			}
		}
		
		if (!gets) System.out.println("ripp, you took more than "+ trials + " trials. the answer was ... i'm not telling you !!!                                                                      jk it  was " + randomNum);
		
		s.close();
	}

}
