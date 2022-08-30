import java.util.Arrays;

public class Vector101 {
	public static void main(String[] args) {
		
		// assume all vectors are 3d
		int[] a = {0, 0, 14};
		double[] b = {4, 10, 2};
		double[] c = {3, 2, -1};
		System.out.println(Arrays.toString(unitVector3D(b)));
		System.out.println(Arrays.toString(unitVector3D(a)));
		System.out.println(Arrays.toString(crossProduct3D(b, c)));
		System.out.println(Arrays.toString(crossProduct3D(c, b)));
		System.out.println(dotProduct3D(c, b));
		
	}
	
	public static double[] unitVector3D(int[] v) {
		double[] ret = new double[v.length];
		double sum = 0;
		for (int i=0; i<v.length; i++) sum += Math.pow(v[i], 2);
		for (int i=0; i<v.length; i++) ret[i] = (double)v[i]/Math.sqrt(sum);
		return ret;
	}
	
	public static double[] unitVector3D(double[] v) {
		double[] ret = new double[v.length];
		double sum = 0;
		for (int i=0; i<v.length; i++) sum += Math.pow(v[i], 2);
		for (int i=0; i<v.length; i++) ret[i] = (double)v[i]/Math.sqrt(sum);
		return ret;
	}
	
	public static double[] crossProduct3D(int[] v1, int[] v2) {
		return new double[] { v1[1]*v2[2]-v1[2]*v2[1], -v1[0]*v2[2]+v1[2]*v2[0], v1[0]*v2[1]+v1[1]*v2[0] };
	}
	
	public static double[] crossProduct3D(double[] v1, int[] v2) {
		return new double[] { v1[1]*v2[2]-v1[2]*v2[1], -v1[0]*v2[2]+v1[2]*v2[0], v1[0]*v2[1]+v1[1]*v2[0] };
	}
	
	public static double[] crossProduct3D(int[] v1, double[] v2) {
		return new double[] { v1[1]*v2[2]-v1[2]*v2[1], -v1[0]*v2[2]+v1[2]*v2[0], v1[0]*v2[1]+v1[1]*v2[0] };
	}
	
	public static double[] crossProduct3D(double[] v1, double[] v2) {
		return new double[] { v1[1]*v2[2]-v1[2]*v2[1], -v1[0]*v2[2]+v1[2]*v2[0], v1[0]*v2[1]+v1[1]*v2[0] };
	}
	
	public static double dotProduct3D(int[] v1, int[] v2) {
		return v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
	}
	
	public static double dotProduct3D(double[] v1, int[] v2) {
		return v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
	}
	
	public static double dotProduct3D(int[] v1, double[] v2) {
		return v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
	}
	
	public static double dotProduct3D(double[] v1, double[] v2) {
		return v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
	}
	
}
