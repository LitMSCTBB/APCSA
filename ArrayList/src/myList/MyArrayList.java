package myList;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		List<Double> x = new ArrayList<>(Arrays.asList(12.75, 7.5, 8.5, 5.5));
		x.add(1, 4.0); x.add(x.indexOf(7.5)+1, 3.75);
		x.add(x.size()-1, 10.0);
		x.remove(x.size()-1);
		double tmp = x.get(0); x.set(0, x.get(2)); x.set(2, tmp);
		x.remove(0);
		for (int i=0; i<(x.size()+1)/2; i++) System.out.print(x.get(i)+" ");
		
	}

}
