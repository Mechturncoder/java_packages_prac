package day10;

public class ArrayConcurrency {
	// 
	public static void main(String[] args) {
		ArrayThread a1 = new ArrayThread();
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		
		t1.setName("user1");
		t2.setName("user2");
		t1.start();
		t2.start();

	}
}
