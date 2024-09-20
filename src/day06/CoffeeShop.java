package day06;

import java.util.Scanner;

public class CoffeeShop {
	public static void main(String[] args) {
		Coffee []cof = Coffee.values();
		for(int i=0 ; i<cof.length ; i++) {
			System.out.println(i+1 + ". " + cof[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice");
		
		String choice = sc.next();
		
		Coffee coff = Coffee.valueOf(choice.toUpperCase());
		System.out.println(coff.getPrice());
		System.out.print("Enter quantity in ml : ");
		int quantity = sc.nextInt();
		
		switch (choice.toUpperCase()) {
		case "SMALL": {
			System.out.println("Total Price to pay: Rs. " + coff.getPrice()*quantity*0.1);
			break;
		}
		case "MEDIUM": {
			System.out.println("Total Price to pay: Rs. " + coff.getPrice()*quantity*0.1);
			break;
		}
		case "LARGE": {
			System.out.println("Total Price to pay: Rs. " + coff.getPrice()*quantity*0.1);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
