package day09;

import java.util.TreeSet;

public class Car {
	
	private int regNo;
	private String make;
	private String model;
	private int man_year;
	private int price;
	TreeSet<String> colors;
	
	public int getRegNo() {
		return regNo;
	}
	
	public int getPrice() {
		return price;
	}


	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public int getMan_year() {
		return man_year;
	}


	public TreeSet<String> getColors() {
		return colors;
	}


	public Car(int regNo, int price, String make, String model, int man_year, TreeSet<String> colors) {
		super();
		this.regNo = regNo;
		this.make = make;
		this.model = model;
		this.man_year = man_year;
		this.colors = colors;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", make=" + make + ", model=" + model + ", man_year=" + man_year + ", price="
				+ price + ", colors=" + colors + "]";
	}


	

}
