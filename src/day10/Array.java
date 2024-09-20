package day10;

public class Array {
	int [] arr = {1,2,3,4,5,6,7,8,9};

	public int[] getArr() {
		return arr;
	}

	public Array(int[] arr) {
		super();
		this.arr = arr;
	}

	public Array() {
		// TODO Auto-generated constructor stub
	}

	public void printArray() {
		for (int i: arr) System.out.print(i + " ");
		System.out.println();
	}
	
}
