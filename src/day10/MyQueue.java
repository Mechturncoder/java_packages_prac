package day10;

public class MyQueue {

	int value;
	boolean hasvalue;
	
	public MyQueue(int value, boolean hasvalue) {
		super();
		this.value = value;
		this.hasvalue = hasvalue;
	}
	
	public MyQueue() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void setValue(int value) {
		
		if(hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.value = value;
		System.out.println("Set value : " + value);
		hasvalue= true;
		notify();
		
	}
	
	public synchronized void getValue() {
		if(!hasvalue)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.value = value;
		System.out.println("Got value : " + value);
		hasvalue= false;
		notify();
	}
	
}
