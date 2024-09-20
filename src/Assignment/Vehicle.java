package Assignment;

public abstract class Vehicle {
	
	protected int regNo;
	protected String name;
	protected String model;
	protected double price;
	
	
	public Vehicle(int regNo, String name, String model, double price) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public abstract double calculateInsurance();

	@Override
	public String toString() {
		return "Vehicle regNo=" + regNo + "\n\tname=" + name + "\n\tmodel=" + model + "\n \tprice=" + price + "\n \tInsurance Amount: " + calculateInsurance()+ "";
	}
	
	
}
