
public class Package {

	private String color;
	private double weight;
	private boolean isHeavy;
	private int numOfLabels;
	
	public Package() {}
	
	public Package(String color, double weight, int numOfLabels) {
		this.color = color; this.weight = weight; this.numOfLabels = numOfLabels;
	}
	
	public Package(boolean isHeavy, int numOfLabels) {
		this.isHeavy = isHeavy; this.numOfLabels = numOfLabels;
	}
	
	public String toString() {
		return "Color: "+this.color+"\nWeight: "+this.weight+"\nIs Heavy: "+this.isHeavy+"\nNumber of Labels: "+this.numOfLabels+"\n";
	}
	
	public String getColor() { return this.color; }
	public double getWeight() { return this.weight; }
	public boolean getIsHeavy() { return this.isHeavy; }
	public int getNumLabel() { return this.numOfLabels; }
	
	public void setColor(String color) { this.color = color; }
	public void setWeight(double weight) { this.weight = weight; }
	public void setIsHeavy(boolean isHeavy) { this.isHeavy = isHeavy; }
	public void setNumLabel(int numOfLabels) { this.numOfLabels = numOfLabels; }
	
	
}
