package day07;

import java.io.Serializable;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>, Serializable{

	private int empid;
	private String name;
	private double salary;
	TreeSet<String> skills;
	
	
	public int getEmpid() {
		return empid;
	}


	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public TreeSet<String> getSkills() {
		return skills;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
	}

	public Employee(int empid, String name, double salary, TreeSet<String> skills) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.skills = skills;
	}


	@Override
	public int compareTo(Employee o) {
//		if(this.empid < o.empid)
//			return -1;
//		else if(this.empid > o.empid)
//			return 1;
//		else 
//			return 0;
		return this.empid - o.empid;
	}
}
