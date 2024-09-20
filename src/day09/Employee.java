package day09;

import java.util.TreeSet;

public class Employee {
	
	private int empid;
	private String name;
	private String department;
	private double salary;
	TreeSet<String> skills;
	
	
	public int getEmpid() {
		return empid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public TreeSet<String> getSkills() {
		return skills;
	}

	public Employee(int empid, String name, String department, double salary, TreeSet<String> skills) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", skills=" + skills + "]";
	}
	
}
