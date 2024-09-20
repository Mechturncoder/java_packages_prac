package day01_1;

public class Addition {
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, float b) {
		System.out.println(a+b);
	}
	public static void add(float a, float b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void add(int ...num) {
		int res = 0;
				for(int i = 0 ; i<num.length ; i++) {
					res += num[i];
				}
				System.out.println(res);
	}
	
	public static void main(String[] args) {
		Addition.add(12.65f, 10);
		Addition.add(1,2,6,4,5,8,9,7,8,9,25);
		
	}


}
