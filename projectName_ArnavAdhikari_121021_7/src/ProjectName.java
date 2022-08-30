

public class ProjectName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] xBox = {{11,12,13,14,15,16},{17,18,19,20,21,22},{23,24,25,26,27,28},{29,30,31,32,33,34}};

		for (int i=0; i<xBox.length; i++) {
			for (int j=0; j<xBox[0].length; j++) {
				System.out.print(xBox[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("sum5 = " + sum5(xBox));
		System.out.println("xBox[0][0]=" + xBox[0][0]);
		System.out.println("xBox[3][5]=" + xBox[3][5]);
		System.out.println("xBox[0][1]=" + xBox[0][1]);
		
	}
	
	public static double sum5(int[][] b) {
		b[0][0]+=5; b[3][5]+=5; return b[0][0]+b[3][5];
	}

}
