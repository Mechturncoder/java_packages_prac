package day06;

public class Account {
	
	protected double balance;
	protected double amount;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount > this.balance) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		else 
		{
			this.balance -=amount;
			System.out.println(balance);
		}
	}
	
	public void deposit(double amount) throws MultiplesException {
		if(amount%100 == 0 || amount%500 ==0) {
			this.balance += amount;
			System.out.println(balance);
		}
		else
		{
			throw new MultiplesException("the amount should be in multiples of 100 and 500");
		}
	}
}
