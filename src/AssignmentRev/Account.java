package AssignmentRev;

public abstract class Account {
	
	protected int accid;
	protected String name;
	protected double balance;
	
	
	public Account(int accid, String name, double balance) {
		super();
		this.accid = accid;
		this.name = name;
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("Balance in account : " + balance);
	}

	public abstract void withdraw(double amount);
	
	
	
	@Override
	public String toString() {
		return "Account [Account ID =" + accid + ", Name=" + name + ", Balance=" + balance + "]";
	}
	

}
