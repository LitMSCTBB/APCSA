public class Mammal extends Animal {
     private int num200;
     
     public Mammal() {
    	 super(123);
    	 num200=200;
    	 System.out.println("Mammal constructor");
     }
     public int getNum2() {return num200;}
     
}
