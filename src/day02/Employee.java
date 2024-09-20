package day02;

import day01_1.Date;

public class Employee {
	private int emid;
	private String name;
	private Date joiningdate;
	
	public Employee() {
		emid = 100;
		name="aaa";
		joiningdate = new Date(1, "Jan", 2024);
	}

	public Employee(int emid, String name, Date joiningdate) {
		this.emid = emid;
		this.name = name;
		this.joiningdate = joiningdate;
	}
//
//	public int getEmid() {
//		return emid;
//	}
//
//	public void setEmid(int emid) {
//		this.emid = emid;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Date getJoiningdate() {
//		return joiningdate;
//	}
//
//	public void setJoiningdate(Date joiningdate) {
//		this.joiningdate = joiningdate;
//	}
//	
	public String toString() {
		return "Employee id: " + emid + ", " + "Name: " + name + ", " + "Joining date: " + joiningdate;
	}
	
	
	
}
