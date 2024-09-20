package day05;

public class Circle extends Shape {
	
	double pi = 3.14;
	int radius;

	public Circle(String name, int radius) {
		super(name);
		this.area = pi*radius*radius;
		
	}

	@Override
	public void calculateArea() {
		
		System.out.println("Area : " + area);
			
	}

	

}
