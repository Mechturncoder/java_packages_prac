package day07;

public class MyObject <T>{
	T obj;

	public MyObject(T obj) {
		
		this.obj = obj;
	}
	public String getName() {
		return obj.getClass().getName();
		
	}
	
	public static void main(String[] args) {
		MyObject<Integer> iobj = new MyObject<Integer>(7);
		System.out.println(iobj.getName());
		
		MyObject<String> sobj = new MyObject<String>("chao!");
		System.out.println(sobj.getName());
		
	}

}
