package day03;

public class ContractEmployee extends Employee {
	
	protected double remun;
	protected int hrs;

	public ContractEmployee(int empid, String name, double remun, int hrs) {
		super(empid, name);
		this.remun = remun;
		this.hrs = hrs;
	}

	@Override
	public double calculateGross() {
		return remun*hrs;
	}
	public double calculateNet() {
		double net = calculateGross();
		return net;
	}
}
