package Assignment;

public class FourWheeler extends Vehicle {

	public FourWheeler(int regNo, String name, String model, double price) {
		super(regNo, name, model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateInsurance() {
		return price*0.1;
		// TODO Auto-generated method stub
		
	}

}
