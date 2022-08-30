import java.util.*;
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,2,2,8,8,8,4,4,4,7,3,5,5,5,5,5};
		int[] b = {1,2,4,2,8,8,8,4,4,4,7,3,5,5,5,5,5};
		int[] c = {1,2,2,2,8,8,8,4,4,4,7,2,2,5,5,5,5};
		int[] d = {9,9,3,3,3,4,5,5};
		
		System.out.println(groupCount(a));
		System.out.println(groupCount(d));
		
		Arrays.stream(a)
		
	}
	
	public static int groupCount(int[] arr) {
		int cur = arr[0]; int count = 1;
		for (int i=1; i<arr.length; i++) {
			if (arr[i] != cur) { count++; cur = arr[i]; }
		}
		return count;
	}

}
