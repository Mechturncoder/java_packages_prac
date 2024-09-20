package day10;

public class WithdrawJob {
	Account acc = new Account(10000);

	

	public synchronized void withdraw(int amount) {
		
		if(acc.getBalance() >= amount)
		{
			System.out.println(Thread.currentThread().getName() + " is ready to withdraw");

			try {
				wait(); 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

			acc.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + "withdrew successfully");
			System.out.println("Balance : " + acc.getBalance() );
			
		}
		notify();
		
	}
	
	public synchronized void addBalance(int amount) {
		
		if(acc.getBalance() < 2000)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				wait();
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			acc.add(amount);
			System.out.println("Balance : " + acc.getBalance());
			
		}
		notify();
		
	}
	
	

}
