package day07;

public class Stat <T extends Number>{
	T [] arr;

	public Stat(T[] arr) {
		this.arr = arr;
	}
	public double calculateAverage() {
		double sum = 0.0;
		for(int i = 0; i<arr.length ; i++) {
			sum += arr[i].doubleValue();
			
		}
		return sum/arr.length;
	}
	public void setArray(Double[] sal) {
		// TODO Auto-generated method stub
		
	}

}
