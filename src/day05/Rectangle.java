package day05;

public class Rectangle extends Shape{
	
	 int length;
	 int breadth;

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
		this.area = length*breadth;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area : " + area);
		// TODO Auto-generated method stub
		
	}

	

}
