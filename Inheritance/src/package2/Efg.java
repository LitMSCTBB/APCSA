package package2;

import package1.Abc;

public class Efg extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Efg m = new Efg();
		System.out.println(m.w);    //private in Abc
	 	System.out.println(m.x);    //default in Abc
	 	System.out.println(m.y);    //protected in Abc
	 	System.out.println(m.z);    //public in Abc
	         

	}

}
