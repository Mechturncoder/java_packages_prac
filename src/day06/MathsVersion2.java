package day06;

public class MathsVersion2 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
		
			int res = i/j;
			System.out.println(res);
		}
		catch (ArithmeticException e){
			System.out.println("Divisor cannot be zero");
		}
		catch(NumberFormatException e) {
			System.out.println("Enter Integers only");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enters both dividend and divisor");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("After exception");
	}

}
