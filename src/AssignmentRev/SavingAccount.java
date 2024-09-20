package AssignmentRev;

public class SavingAccount extends Account{
	
	private int transactionCount = 1;

	public SavingAccount(int accid, String name, double balance) {
		super(accid, name, balance);
		
	}

	@Override
	public void withdraw(double amount) {
		if(transactionCount <=3)
		{
			if(amount > balance)
				System.out.println("You don't have enough balance");
			else {
				balance = balance- amount;
				transactionCount++;
				System.out.println("Withdrawn amount : " + amount);
				
			}
		}
		else 
		{
			System.out.println("Transation limit reached!!");
		}
		
	}

}
