package day05;

public abstract class Shape {
	

	protected String name;
	protected double area;
	
	
	
	public Shape(String name) {
		this.name = name;
	}
	
	public Shape(String name, double area) {
		super();
		this.name = name;
		this.area = area;
	}
	public void displayName() {
		System.out.println("Shape name is : " + name);
	}
	
	public abstract void calculateArea();
	
	
	

}
