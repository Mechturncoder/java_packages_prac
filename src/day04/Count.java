package day04;

public class Count {
	public static void main(String[] args) {
		String s = "AvrXdV@;";
		int countUpper = 0;
		int countLower = 0;
		int countSpecial = 0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <90) {
				countUpper++;
			}
			if (s.charAt(i) >= 97 && s.charAt(i) <=122) {
				countLower++;
			}
			if ((s.charAt(i) >= 33 && s.charAt(i) <=47) || (s.charAt(i) >= 58 && s.charAt(i) <=64)) {
				countSpecial++;
			}
		}
		
		System.out.println("countUpper: " + countUpper);
		System.out.println("countLower: " + countLower);
		System.out.println("countSpecial: " + countSpecial);
		
		if(countUpper == s.length()) {
			System.out.println("The String is upper case");
		}
		else {
			System.out.println("The String is not upper case");
		}
		
		for (int i=0;i<s.length();i++) {
			System.out.println(s.substring(i, s.length()) + s.substring(0, i));
		}
	}
}
