package day03;

public class SavingAccount extends Account{
	private int transactionCount;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
		this.transactionCount = 0;
		
	}

	public SavingAccount(double balance, int transactionCount) {
		super(balance);
		this.transactionCount = transactionCount;
	}
	
	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}
	
	public int getTransactionCount() {
		return transactionCount;
	}

	@Override
	public String toString() {
		return "SavingAccount Number of transaction in this month =" + transactionCount + ", balance=" + balance
				+ ", Balance =" + getBalance() + "," + super.toString() + "]";
	}
	
	
	
}
