package day06;

public class MathsVersion3 {
	public static void divide(String a, String b) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException{
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int res = i/j;
		System.out.println(res);

	}
	public static void main(String[] args) {
		try {
			divide(args[0], args[1]);
		}
		catch( ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}

}
