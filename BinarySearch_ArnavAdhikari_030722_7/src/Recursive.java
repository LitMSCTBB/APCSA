
public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-1, 5, 15, 54, 255, 523, 6643, 9897, 1235689, 1234567890}; int target = 1235689;
		System.out.print(bs(arr, target, 0, 9));
		
	}
	
	public static int bs(int[] arr, int target, int low, int high) {
		if (low == high) return low;
		int m = (low+high)/2; int t = arr[m]; if (target == t) return m;
		if (t > target) return bs(arr, target, low, m-1);
		return bs(arr, target, m+1, high);
	}

}
