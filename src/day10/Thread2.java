package day10;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		for( int i = 0; i<10 ; i++) {
			if(i==5)
			{
				// causes currently executing thread to pause and allow other thread to execute
				Thread.yield();
			}else
			{
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
		
}

}
