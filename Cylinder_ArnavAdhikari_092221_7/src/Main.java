import java.util.*;

public class Main {
	
	public static final double pi = 3.14159265;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		int height;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type in the radius of the cylinder base...");
		radius = s.nextDouble();
		
		System.out.println("Type in the height of the cylinder...");
		height = s.nextInt();
		
		double volume = volumeCylinder(radius, height);
		double surfaceArea = surfaceAreaCylinder(radius, height);
		
		System.out.println("The volume of the cylinder is "+volume+" and the surface area of the cylinder is "+surfaceArea+".");
		
		s.close();
		
	}
	
	static double volumeCylinder(Double radius, Integer height) {
		return pi*Math.pow(radius, 2)*height;
	}
	
	static double surfaceAreaCylinder(Double radius, Integer height) {
		return 2*pi*Math.pow(radius, 2)+2*pi*radius*height;
	}

}
