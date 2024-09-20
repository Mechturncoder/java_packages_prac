package day10;

public class ArrayThread implements Runnable{
	
	Array a = new Array();

	@Override
	public void run() {
		
		printArray();
		
	}
	
	public synchronized void printArray() {
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.printArray();
		
	}
	
	

}
