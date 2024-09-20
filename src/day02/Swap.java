package day02;

import day01_1.Date;

public class Swap {

	public static void swap(int [] i, int[] j) {
		int temp = 0;
		temp = i[0];
		i[0] = j[0];
		j[0] = temp;
	}
//	public static void swap(int a[], int index1, int index2) {
//		int x = 0;
//		x = a[index1];
//		a[index1] = a[index2];
//		a[index2] = x;
//		System.out.println("After swapping : ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//			
//		}
//		System.out.println();
//	}
//	
//	public static void swap(Book a[], int index1, int index2) {
//		Book x = new Book();
//		x = null;
//		x = a[index1];
//		a[index1] = a[index2];
//		a[index2] = x;
//		System.out.println("After swapping : ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//			
//		}
//		System.out.println();
//	}
	
	
}
