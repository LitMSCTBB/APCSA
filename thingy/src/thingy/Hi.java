package thingy;

public class Hi {
	
	public static void main(String[] args) {
		System.out.println(pascal(2,1));
		System.out.println(pascal(4,6));
		System.out.println(pascal(4,3));
		System.out.println(pascal(-3,10));
		System.out.println(pascal(3,3));
		System.out.println(pascal(200,200));
		System.out.println(pascal(3,0));
		System.out.println(pascal(87,0));
		System.out.println(pascal(3,85));
		System.out.println(pascal(10,5));
	}
	
	public static int pascal(int row, int col) {
		if (row < 0 || col < 0 || row < col) return 0;
		if (col==0) return 1;
		return pascal(row-1, col-1)+pascal(row-1, col);
	}

}
