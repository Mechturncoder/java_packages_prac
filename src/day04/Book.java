package day04;

import java.util.ArrayList;
import java.util.Objects;

public class Book implements Cloneable {
	static int isbn;
	int srno;
	String title;
	ArrayList<String> author;
	
	public Book(int srno, int isbn, String title, ArrayList<String> author ) {
		this.isbn = isbn;
		this.srno = srno;
		this.title = title;
		this.author = author;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, srno, title);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && srno == other.srno && Objects.equals(title, other.title);
	}

	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
//	public static void main(String[] args) {
//		Book b = new Book(556, isbn, "Java8");
//		Book a = new Book(556, isbn, "Java8");
//		System.out.println(a.equals(b));
//		System.out.println(a.hashCode() == b.hashCode());
//		b.print();
//	}




	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", srno=" + srno + ", title=" + title + ", author=" + author + "]";
	}




	
	

}
