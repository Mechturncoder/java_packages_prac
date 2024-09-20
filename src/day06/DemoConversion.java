package day06;

public class DemoConversion {
	public static void main(String[] args) {
		
		// prior to java 5 explicit conversions from primitive to wrapper was needed
		int i = 10;
		
		Integer j = Integer.valueOf(i); // primitive to wrapper
		
		int k = j.intValue(); // wrapper to primitive
		
		// In to Java 5 Auto boxing and un-boxing was introduced so conversions take place implicitly
		int x = 20;
		Integer y = x;
		int z = y;
		System.out.println(z);
		
		// String Conversions
		
		int a = Integer.parseInt("10"); // string to primitive
		Integer b = Integer.valueOf("20"); // String to wrapper
		System.out.println(a +","+ b);
	}
}
