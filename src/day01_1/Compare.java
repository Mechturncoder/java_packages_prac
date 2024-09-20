package day01_1;
import java.util.Scanner;

import day02.Math;
public class Compare {
	public void greatestOf(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println(a + " is the greatest number");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is the greatest number");
		}
		else if(c>a && c>b){
			System.out.println(c + " is the greatest number");
		}
	}
	public static void main(String[] args) {
//		Compare c = new Compare();
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner(System.in);	
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt(); 
//		c.greatestOf(num1, num2, num3);
		
		Math m = new Math();
		m.swap(2,3);
		
		Date d1 = new Date(12, "Aug");
		Date d2 = new Date(10, "Sep");
		m.swap(d1, d2);
		
	}
}
