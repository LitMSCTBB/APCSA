
public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,8,-15,-6,9, -3, -10, 8,12};
		System.out.println("Neg: "+neg(arr));
		System.out.println("Pos: "+pos(arr));
		System.out.println("Odd: "+odd(arr));
		System.out.println("Even: "+even(arr));
		
	}
	
	public static int neg(int[] arr) {
		int ret = 0;
		for (int i : arr) {
			if (i < 0) ret++;
		}
		return ret;
	}
	
	public static int pos(int[] arr) {
		int ret = 0;
		for (int i : arr) {
			if (i > 0) ret++;
		}
		return ret;
	}
	
	public static int odd(int[] arr) {
		int ret = 0;
		for (int i : arr) {
			if (mod(i,  2) == 1) ret++;
		}
		return ret;
	}
	
	public static int even(int[] arr) {
		int ret = 0;
		for (int i : arr) {
			if (mod(i, 2) == 0) ret++;
		}
		return ret;
	}
	
	static int mod(int a, int m) {
		return Math.floorMod(a, m);
	}

}
