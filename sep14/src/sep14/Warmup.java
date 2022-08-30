package sep14;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int lowLimit = s.nextInt();
		int highLimit = s.nextInt();
		if (lowLimit > highLimit) {
			int tmp = lowLimit;
			lowLimit = highLimit;
			highLimit = tmp;
		}
		
		int r = (int) (Math.random() * (highLimit - lowLimit)) + lowLimit;
		System.out.println(r);
		
		for (int x=0; x<20; x++) {
			System.out.println((int) (Math.random() * (highLimit - lowLimit)) + lowLimit);
		}
		
		s.close();
		
		
	}

}
