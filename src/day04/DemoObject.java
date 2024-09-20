package day04;

import java.util.ArrayList;

public class DemoObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		
		Book b1 = new Book(113,1111,"Java", a);
		System.out.println(b1.hashCode());
		
		System.out.println("Shallow copy vs deep copy");
		
		ArrayList<String> copy = new ArrayList<>();
		for(String author : a) {
			copy.add(author);
		}
		
		Book b3 = b1; //shallow copy
		Book b4 = new Book(b1.srno, b1.isbn, b1.title, copy); // authors
		Book b5 = (Book) b1.clone();
		
		System.out.println("Original :" + b1);
		b1.isbn = 1234;
		b1.author.add("ccc");
		System.out.println("Shallow Copy: " + b3);
		System.out.println("Deep Copy: " + b4);
		System.out.println("By cloning Copy: " + b5);
		
		
//		Book b1 = new Book(111, 12, "java8", a);
//		Book b2 = new Book(111, 12, "java8", b);
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.hashCode());
//		System.out.println(b2.hashCode());
//
//		Book b3 = b1; //Shallow copy
//		b1.isbn = 1234;
//		System.out.println("Shallow copy : " + b3);
//		
	}
}
