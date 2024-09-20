package day01_1;

public class Date {
	private int day;
	private String month;
	private int year;
	
	public Date(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date(int day, String month) {
		this.day = day;
		this.month = month;
		this.year = 2024;
	}
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
}

