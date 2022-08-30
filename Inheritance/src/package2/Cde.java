package package2;

import package1.*;

public class Cde{ // "HAS A" relationship 
    //instance
	private Abc m;
	
	Cde(){
		m= new Abc();
	}
	
	public static void main(String[] xt) {
	    Cde a= new Cde();
		System.out.println(a.m.w);    //private in Abc
	 	System.out.println(a.m.x);    //default in Abc
	 	System.out.println(a.m.y);    //protected in Abc
	 	System.out.println(a.m.z);    //public in Abc
	}
}
