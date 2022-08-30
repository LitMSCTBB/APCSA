public class Animal {
     private int num100=100;  
     private String name;
     
     public Animal() {
    
    	 System.out.println("Animal default constructor");
     }
     public Animal(int x) {
    	 num100=x;
    	 System.out.println("Animal int constructor");
     }
     public Animal(String n) {
    	 name = n;
    	 System.out.println("Animal String constructor");
     }
     public int getNum1() {return num100;}
     
     public void makeNoise() {
    	 System.out.println("Animal noise!");
     }
     
}
