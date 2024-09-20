package day03;

public class SalariedEmployee extends Employee implements TaxPayer{
	
	protected double basic;

	public SalariedEmployee(int empid, String name,double basic ) {
		super(empid, name);
		this.basic = basic;
		
	}

	@Override
	public double calculateGross() {
		return basic + basic*0.4 + basic*0.12;
	}
	
	public double calculateNet() {
		double gross = calculateGross();
		return gross*0.9;
	}

	@Override
	public double calculateTax() {
		double gross = calculateGross();
		return gross*0.1;
	}
	

}
