package Assignment;

import java.util.ArrayList;

public class Student {
	
	protected int rollno;
	protected String name;
	protected int[] marks ;
	
	public Student(int rollno, String name, int i) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void calculateAvg() {
		int sum = 0;
		for (int i: marks) {
			sum+=i;
		}
		System.out.println("Average marks : " + sum/(marks.length));
	}
	
	public void calculatePercent() {
		int sum = 0;
		for (Integer i: marks) {
			sum+=i;
		}
		System.out.println("Average marks : " + sum/(marks.length) + "%");
	}
	
	public static void main(String[] args) {
		Student s = new Student(12, "ankit", 25);
		s.calculatePercent();
	}
}
