package day10;

public class AccountConcurrency {
	
	public static void main(String[] args) {
		

		WithdrawJob queue = new WithdrawJob();
		Thread debitor = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10;i++)
				{
					queue.withdraw(2000);
					try {
						Thread.sleep(2000);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		Thread creditor = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<10;i++)
				{
					queue.addBalance(5000);
					try {
						Thread.sleep(2000);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		creditor.setName("user2");
		debitor.setName("user1");
		debitor.start();
		creditor.start();
	}

}
