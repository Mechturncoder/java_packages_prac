package AssignmentRev;

public class CurrentAccount extends Account{
	
	
	private int transactionCount = 0;

	public CurrentAccount(int accid, String name, double balance) {
		super(accid, name, balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount > balance)
			System.out.println("You don't have enough balance");
		if(amount > 20000 || transactionCount >1)
			System.out.println("Transaction limit reached.");
		else {
			balance = balance- amount;
			transactionCount++;
		}
	}

}
