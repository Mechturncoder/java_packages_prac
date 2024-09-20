package day01_1;

public class Account {
	private int accid;
	private String name;
	private double balance;
	private static int intrate = 7;
	
	static {
		intrate = 7;
	}
	
	public Account(int accid, String name, double balance) {
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	
	public static void showInterestRate() {
		System.out.println("Curent Interest Rate : " + intrate);
	}
	public static void displayAccountDetails() {
//		System.out.println("account id " + accid);
	}
	public String toString() {
		// Instance method can access static data
		return "Account: " + accid + ", name = " + name + ", balance = " + balance;
	}
	public static void main(String[] args) {		
		// Instance method can access static data
		Account acc1 = new Account(43345, "ankit", 85650);
		Account.showInterestRate();
		System.out.println(acc1);

	}
}
