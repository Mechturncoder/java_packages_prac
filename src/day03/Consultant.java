package day03;

public class Consultant implements TaxPayer, Printable {
	
	private int hrs;
	private int rate;
	
	public Consultant( int hrs, int rate) {
		this.hrs = hrs;
		this.rate = rate;
	}
	public int calculateInvoice() {
		return hrs*rate;
	}
	
	

	@Override
	public double calculateTax() {

		return calculateInvoice()*0.1;
	}

	@Override
	public void print() {
		System.out.println("Printing Consultant data");
		System.out.println("Worked for " + hrs + "hours Per hour renumeration : " + rate);
	}

}
