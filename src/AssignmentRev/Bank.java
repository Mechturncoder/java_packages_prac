package AssignmentRev;

public class Bank {
	
	public void displayBalance(Account a) {
		a.showBalance();
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		
		SavingAccount s = new SavingAccount(123, "ankit", 50000);
		CurrentAccount c = new CurrentAccount(456, "qwert", 56000);
		
		Bank b = new Bank();
		
		b.displayBalance(s);
		s.withdraw(6000);
		b.displayBalance(s);
		
		b.displayBalance(c);
		c.withdraw(6000);
		b.displayBalance(c);
	}

}
