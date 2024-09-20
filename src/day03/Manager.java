package day03;

public class Manager extends SalariedEmployee implements TaxPayer {
	
	protected double allowance;
	
	public Manager(int empid, String name, double basic, double allowance) {
		super(empid, name, basic);
		this.allowance = allowance;
	}
	
	@Override
	public double calculateGross() {
		return super.calculateGross() + allowance;
		
	}
	
	@Override
	public double calculateTax() {
		double gross = calculateGross();
		return gross*0.2;
	}
	

}
