package AssignmentRev;

public class Students implements Print, Write {
	
	protected String name;
	protected int rollno;
	protected int marks;
	


	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}

	public Students(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public void printToFile() {
		System.out.println("Printing to file");
	}

	@Override
	public void printToDB() {
		System.out.println("Printing to DataBase");
		
	}

	@Override
	public void print() {
		System.out.println("Printing the student data");
		
	}
	

}
