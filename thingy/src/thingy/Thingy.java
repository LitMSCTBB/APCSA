package thingy;

public class Thingy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String c = "The AP Exam is on the day of May 2022";
		
		//1
		String ex = c.substring(7, 11);
		System.out.println(ex);
		
		//2
		String ct = c.substring(0, 3);
		String lt = c.substring(18, 21);
		System.out.println(ct.compareTo(lt));
		
		System.out.println("The".compareTo("These are"));

	}

}
