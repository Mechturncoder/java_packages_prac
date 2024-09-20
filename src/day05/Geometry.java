package day05;

public class Geometry {
	
	public void displayArea(Shape s) {
		s.calculateArea();
	}
	public void dislayName(Shape s) {
		s.displayName();
	}

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle("rectangle", 45, 20);
		Circle c = new Circle("circle",10);
		
		Geometry g = new Geometry();
		g.dislayName(r);
		g.displayArea(r);
		
		g.dislayName(c);
		g.displayArea(c);
	}

}
