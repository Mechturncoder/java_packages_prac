package day02;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		c.add(a, b);
		
//		Swap sw  = new Swap();
//		int a[] = {56};
//		int b[] = {45};
//		System.out.println("Before swap " + a[0] +  ", " + b[0]);
//		sw.swap(a, b);
//		System.out.println("After swap  " + a[0] +  ", " + b[0]);
//		
		
		
		// TODO Auto-generated method stub
//		int arr[] = {56,45};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			
//		}
//		System.out.println();
//		
//		Swap sw = new Swap();
//		sw.swap(arr, 0, 1);
//		
//		Book[] books = new Book[2];
//		books[0] = new Book();
//		books[0].setIsbn(12000);
//		books[0].setTitle("Head First Java");
//		books[1] = new Book();
//		books[1].setIsbn(13000);
//		books[1].setTitle("Head Second  Java");
//		sw.swap(books, 0, 1);
////		for (int i = 0; i < books.length; i++) {
////			System.out.println(books[i]);
////			
////		}
//		
//		Scanner sc = new Scanner(System.in);
//		Book[] bk = new Book[2];
//		for (int i=0; i<2; i++) {
//			Book b = new Book();
//			int isbn = sc.nextInt();
//			String title  = sc.next();
//			b.setIsbn(isbn);
//			b.setTitle(title);
//			bk[i] = b;
//		}
//		sc.close();
//		
////		for(Book i : bk) {
////			System.out.println(i);
////		}
//		for(int i = 0 ; i< bk.length ; i++) {
//			System.out.println(bk[i]);
//		}
	}

}
