package day06;

import java.util.Scanner;

public class StringConversion {
//	public static void main(String[] args) throws EmptyStringException{
//		String s ="to convert this string";
//		
//		if(s.isEmpty()) {
//			throw new EmptyStringException("entered empty string");
//		}
//		else {
//			System.out.println(s.toUpperCase());
//		}
//	}
//
	public static void convertToUpperCase(String s) throws EmptyStringException{
		if(s.equals("")) {
			throw new EmptyStringException("String is empty");
		}
		else
		{
			System.out.println(s.toUpperCase());
		}
	}
	
	public static void main(String[] args) {
		try {
			StringConversion.convertToUpperCase("");
		}
		catch(EmptyStringException e){
			System.out.println(e);
		}
	}
}

