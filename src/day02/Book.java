package day02;

public class Book {

	private int isbn;
	private String title;
	public Book() {
	
	}
	public Book(int isbn , String title) {
		this.isbn = isbn;
		this.title = title;
	}
	public int getIsbn() {
		return isbn; 
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return "Book isbn: " + this.isbn + ", " + "title: " + this.title;
	}
		
}
