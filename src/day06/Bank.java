package day06;


public class Bank {
	
	public void depositException(Account a, double amount) {
		try {
			a.deposit(amount);
			
		}
		catch (MultiplesException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public void withDrawExeption(Account a, double amount)  {
		
		try {
			a.withdraw(amount);
			
		}
		catch (InsufficientBalanceException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)  {
		Bank b = new Bank();
		Account a = new Account(1000);
		Account d = new Account(1000);
		b.depositException(d, 600);
		b.withDrawExeption(a, 100);
	}

}
