package day12;

public class Students {

	private int rollno;
	private String name;
	
	public Students() {
		rollno = 1;
		name = "aaaaa";
	}
	public Students(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public void simpleMethod() {				
		System.out.println("ths is a simple method");
	}
	
	public void staticMethod() {
		System.out.println("ths is a static method");
	}
	
	public void privateMethod() {
		System.out.println("ths is a private method");
	}
	@CreatedBy(name = "ankit" , priority = 2)
	public void methodWithParams(int rollno , String name) {
		System.out.println("Set roll no : " + rollno + "name : " + name);
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
