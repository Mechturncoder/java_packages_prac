package day10;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public void add(int amount) {
		balance += amount;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}
