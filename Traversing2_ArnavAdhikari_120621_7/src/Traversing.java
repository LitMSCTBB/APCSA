
public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,20,3,10,42,15,17,24}; double[] b = {1.1, 3.5, 5.1, 9.5, 8.2, 4.75, 3.2,1.25, 0.05};
		
		System.out.println(average(a));
		System.out.println(average(b));
		System.out.println(averageOdd(b));
		
	}
	
	public static double average(int[] arr) {
		double sum = 0; for (int e : arr) sum += e; return sum/arr.length;
	}
	
	public static double average(double[] arr) {
		double sum = 0; for (double e : arr) sum += e; return sum/arr.length;
	}
	
	public static double averageOdd(int[] arr) {
		double sum = 0; int c = 0;
		for (int e : arr) {
			if (e % 2 == 1) {
				sum += e; c++;
			}
		}
		return sum/c;
	}
	
	public static double averageOdd(double[] arr) {
		double sum = 0; int c = 0;
		for (double e : arr) {
			if (lastDigit(e) % 2 == 1) {
				sum += e; c++;
			}
		}
		return sum/c;
	}
	
	public static double averageEvenIndex(int[] arr) {
		double sum = 0; int c = 0;
		for (int i=0; i<arr.length; i+=2) {
			sum += arr[i]; c++;
		}
		return sum/c;
	}
	
	public static double averageEvenIndex(double[] arr) {
		double sum = 0; int c = 0;
		for (int i=0; i<arr.length; i+=2) {
			sum += arr[i]; c++;
		}
		return sum/c;
	}
	
	public static int findMax(int[] arr) {
		int max = 0; for (int e : arr) if (e > max) max = e; return max;
	}
	
	public static double findMax(double[] arr) {
		double max = 0; for (double e : arr) if (e > max) max = e; return max;
	}
	
	private static int lastDigit(double d) {
		String str = ""+d; return Integer.parseInt(str.substring(str.length()-1));
	}

}
