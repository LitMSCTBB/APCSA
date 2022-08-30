import java.util.*;

public class SequentialSearch {
	
	public static int sequentialSearch(List x, Object target) {
		int ret = -1;
		for (int i=0; i<x.size(); i++) {
			if (target.equals(x.get(i))) {
				ret = i; break;
			}
		}
		return ret;
	}
	
	// assumes x sorted
	public static int binarySearch(List<String> x, String target) {
		int lo = 0; int hi = x.size()-1;
		while (lo <= hi) {
			if (lo == hi) {
				 if (target.equals(x.get(lo))) return lo; else break;
			}
			if (lo + 1 == hi) {
				if (target.equals(x.get(lo))) return lo;
				else lo = hi;
			}
			int mid = (lo+hi)/2; String sm = x.get(mid);
			if (target.compareTo(sm) < 0) hi = mid-1;
			else lo = mid;
		}
		return -1;
	}
	
	// assumes x sorted
	public static int binarySearch(List<Integer> x, Integer target) {
		int lo = 0; int hi = x.size()-1;
		while (lo <= hi) {
			if (lo == hi) {
				if (target.equals(x.get(lo))) return lo; else break;
			}
			if (lo + 1 == hi) {
				if (target.equals(x.get(lo))) return lo;
				else lo = hi;
			}
			int mid = (lo+hi)/2; Integer sm = x.get(mid);
			if (target < sm) hi = mid-1;
			else lo = mid;
		}
		return -1;
	}
	
	// assumes x sorted
	public static int binarySearch(List<Double> x, Double target) {
		int lo = 0; int hi = x.size()-1;
		while (lo <= hi) {
			if (lo == hi) {
				if (target.equals(x.get(lo))) return lo; else break;
			}
			if (lo + 1 == hi) {
				if (target.equals(x.get(lo))) return lo;
				else lo = hi;
			}
			int mid = (lo+hi)/2; Double sm = x.get(mid);
			if (target < sm) hi = mid-1;
			else lo = mid;
		}
		return -1;
	}	
	
	public static void main(String[] args) {
		List abc = Arrays.asList("abc", 123, 6.78, false, "true", true, -234, 3.14, "5", "high", 100, 'm');
		int i = sequentialSearch(abc, 123); //1 is stored in i
		System.out.println(i);
		
		List<String> str= Arrays.asList("abc", "def", "efg", "false", "good", "rhinos", "true", "zebra", "zion");
		int j = binarySearch(str, "true");
		System.out.println(j);
		
		List<Integer> ints = Arrays.asList(-12, 12, 56, 567, 787, 1096, 5135, 43621, 643111, 888888);
		int k = binarySearch(ints, 43621);
		System.out.println(k);
		
		List<Double> dubs = Arrays.asList(-12.1, 12.1, 56.1, 567.1, 787.1, 1096.1, 5135.1, 43621.1, 643111.1, 888888.1);
		int l = binarySearch(dubs, -12.1);
		System.out.println(l);
	}

}
