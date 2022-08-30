package sorting;

import java.util.Arrays;

public class Sorting101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr2 = new int[7][10];
		for (int i=0; i<7; i++) {
			for (int j=0; j<10; j++) {
				arr2[i][j] = (int)(Math.random()*90)+10;
			}
		}
		
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.deepToString(sortedRows(arr2)));
	}
	
	public static int[] insertSort(int[] arr1) {
		int n = arr1.length; int[] ret = new int[n]; ret[0] = arr1[0];
		for (int i=1; i<n; i++) {
			int e = arr1[i]; int ni = i; while (ni > 0 && e < ret[ni-1]) {
				ret[ni] = ret[--ni];
			}
			ret[ni] = e;
		}
		return ret;
	}
	
	public static int[] selectSort(int[] arr1) {
		int[] arr = arr1.clone(); int n = arr.length;
		for (int i=0; i<n-1; i++) {
			int ind = i;
			for (int j=i+1; j<n; j++) {
				if (arr[j] < arr[ind]) {
					ind = j;
				}
			}
			int e = arr[ind]; arr[ind] = arr[i]; arr[i] = e;
			
		}
		return arr;
	}
	
	
	public static int[][] sortedRows(int[][] arr2)  {
		int[][] arr = arr2.clone();
		for (int i=0; i<arr2.length; i++) {
			arr[i] = selectSort(arr[i]);
		}
		return arr;
	}

}
