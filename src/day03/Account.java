package day03;

public class Account {
	protected double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The balance in your account: " + balance;
	}
}
