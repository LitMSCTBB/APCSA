import java.util.*;

public class BMI {
	static int height, weight;
	static double bMI;
	static String category;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Calculate your body mass index!");
		System.out.println("First, enter your height in inches ...");
		height = s.nextInt();
		
		System.out.println("Next, enter your weight in pounds...");
		weight = s.nextInt();
		
		bMI = (double) weight / Math.pow(height, 2) * 703;
		
		if (bMI < 18.5) {
			category = "Underweight";
		} else if (18.5 <= bMI && bMI < 25) {
			category = "Normal weight";
		} else if (25 <= bMI && bMI < 30) {
			category = "Overweight";
		} else {
			category = "Obesity";
		}
		
		System.out.println("Your category is \""+category+"\" based on a BMI of "+bMI+".");
		
		s.close();
	}
}
