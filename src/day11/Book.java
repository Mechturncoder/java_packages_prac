package day11;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Book implements Serializable {

		private int isbn;
		private String title;
		private int price;
		private LocalDateTime issueDate ;
		private LocalDateTime returnDate ;
		
		
		public int getIsbn() {
			return isbn;
		}
		
		public String getTitle() {
			return title;
		}
		
		public int getPrice() {
			return price;
		}
		
		public LocalDateTime getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(LocalDateTime issueDate) {
			this.issueDate = issueDate;
		}
		public LocalDateTime getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(LocalDateTime returnDate) {
			this.returnDate = returnDate;
		}

		public Book(int isbn, String title, int price, LocalDateTime issueDate, LocalDateTime returnDate) {
			super();
			this.isbn = isbn;
			this.title = title;
			this.price = price;
			this.issueDate = issueDate;
			this.returnDate = returnDate;
		}

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", issueDate=" + issueDate
					+ ", returnDate=" + returnDate + "]";
		}
		
		
		
}
