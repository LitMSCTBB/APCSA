import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
		
		String phrase = s.nextLine(); int len = phrase.length();
		
		int wordCount = 0;
		
		for (int i=0; i<len; i++) {
			if (phrase.charAt(i) != ' ' && ((i == 0) || (i > 0 && phrase.charAt(i-1) == ' '))) wordCount++;
		}
		
		System.out.println(wordCount);
		
		s.close();
		
	}
	
}
