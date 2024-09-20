package day10;

public class AnnoThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Starting a new thread");	
			}
		});
		t1.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Starting yet another thread");
				
			}
		}).start();
		
		// =======================================using lambda=================================
		Runnable r = () -> System.out.println("lambda method thread");
		new Thread(r).start();
	     
		new Thread(() -> {
			for(int i = 0 ; i <5 ; i++)
			{
				
				System.out.println("main thread : " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}
