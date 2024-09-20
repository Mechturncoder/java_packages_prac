package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;




public class Library {
	
	public void calculateFine(Book a, LocalDateTime returnDate)
	{
		int timeToChristmas = a.getIssueDate().getDayOfYear() - returnDate.getDayOfYear();
		System.out.println(timeToChristmas);
		a.setReturnDate(returnDate);
		
		File f = new File("./IssueBook.txt");
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f)))
		{
			out.writeObject(a);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fin = new FileInputStream(f); ObjectInputStream in = new ObjectInputStream(fin))
		{
			while(fin.available()!=0)
			{
				Book e = (Book)in.readObject();
				System.out.println(e);
			}
		}catch (IOException e) {
				System.out.println(e);
			}catch(ClassNotFoundException e) {
				System.out.println(e);
			}
	
	}
	
	
	public void issueBook (Book a, LocalDateTime date)
	{
		a.setIssueDate(date);
		File f = new File("./IssueBook.txt");
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f)))
		{
			out.writeObject(a);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fin = new FileInputStream(f); ObjectInputStream in = new ObjectInputStream(fin))
		{
			while(fin.available()!=0)
			{
				Book e = (Book)in.readObject();
				System.out.println(e);
			}
		}catch (IOException e) {
				System.out.println(e);
			}catch(ClassNotFoundException e) {
				System.out.println(e);
			}
	
	}
	
	
	public static void main(String[] args) {
		Library lib = new Library();
		
		LocalDateTime issuedate = LocalDateTime.now();
		Book a = new Book(101, "java", 10000, null, null);
		lib.issueBook(a, issuedate);
		
		lib.calculateFine(a,  LocalDateTime.of(2024, 9, 21, 0, 0));
		
	}

}
