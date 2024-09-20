package Assignment;

public class TwoWheeler extends Vehicle{

	public TwoWheeler(int regNo, String name, String model, double price) {
		super(regNo, name, model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateInsurance() {
		return price*0.05;
		// TODO Auto-generated method stub
		
	}

}
