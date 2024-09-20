package day07;

public class DemoStat {
	public static void main(String[] args) {
		
		Double [] sal = {50000.0, 65000.0 , 60000.0, 45127.0, 69478.0};
		Stat<Double> sta = new Stat<Double>(sal);
		
		sta.setArray(sal);
		System.out.println("Average salary : " + sta.calculateAverage());
		
		Integer [] age = {45,23,36,14,25,45};
		Stat<Integer> sal1 = new Stat<Integer>(age);
		System.out.println("Average Age : " + sal1.calculateAverage()); 
	} 
}
