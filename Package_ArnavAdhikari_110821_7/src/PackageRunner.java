
public class PackageRunner {
	
	public static void main(String[] args) {
		
		Package p1 = new Package("red", 5.5, 2);
		Package p2 = new Package(true, 1);
		Package p3 = new Package("brown", 10.0, 3);
		
		System.out.println("Package 1 and 3 v0\n");
		System.out.println(p1.toString());
		System.out.println(p3.toString());
		
		p2.setColor("blue");
		p1.setWeight(6.5);
		
		System.out.println("Package 1, 2, and 3 v1\n");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		System.out.println("Package 3 weight");
		System.out.println(p3.getWeight()+"\n");
		
		System.out.println((p1.getIsHeavy() ? "Package 1 is heavy" : "Package 1 is not heavy")+"\n");
		
		if (p1.getNumLabel() > 0) p1.setNumLabel(0);
		if (p2.getNumLabel() > 0) p2.setNumLabel(0);
		if (p3.getNumLabel() > 0) p3.setNumLabel(0);
		
		System.out.println("Package 1, 2, and 3 v2\n");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}

}
