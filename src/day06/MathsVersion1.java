package day06;

public class MathsVersion1 {
	
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		
		try {
			int res = i/j;
			System.out.println(res);
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		}
		System.out.println("After exception");
	}
}
