package day02;

import day01_1.Date;

public class DemoContainment {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1);
		Employee e2 = new Employee (200, "ssss" , new Date(15, "Dec", 2018));
		System.out.println(e2);
	}
	

}
