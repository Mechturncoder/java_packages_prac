package day03;

public class DemoInterface {
	
	public static void main(String[] args) {
		TaxPayer payer1 = new SalariedEmployee(5555, "aaaaaaa", 80000);
		TaxPayer payer2 = new Manager(1234, "ppp", 45000,10000);
		TaxPayer payer3 = new Consultant(50, 1500);
		Payroll payroll = new Payroll();
		payroll.displayTax(payer1);
		payroll.displayTax(payer2);
		payroll.displayTax(payer3);
	}

}
