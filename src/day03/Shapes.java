package day03;

public abstract class Shapes {
	protected String name;
	
	public void Shape(String name) {
		this.name = name;
	}
	
	public abstract float calculateArea();
	
	public String toString() {
		return "Shape name : " + name;
	}

}
