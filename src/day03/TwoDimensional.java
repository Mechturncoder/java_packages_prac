package day03;

public class TwoDimensional extends Shapes {
	
	protected int sides;
	public TwoDimensional(String name, int sides) {
		super();
		this.sides = sides;
	}
	
	
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
	
		return sides*sides;
	}
	

}
