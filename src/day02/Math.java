package day02;

import day01_1.Date;

public class Math {
	public static void swap(int i, int j) {
		int temp = 0;
		temp = i;
		i=j;
		j= temp;
		System.out.println("After Swapping i : " + i + "	 j: " +j);
}
	public static void swap(Date d1 , Date d2) {
		Date temp = null;
		temp = d1;
		d1 = d2;
		d2 = temp;
		System.out.println("After swapping d1 : " + d1 + "	 d2 : " + d2);
	}
}
