package day09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStringStream {
	
	public static void main(String[] args) {
		
		String [] arr = {"Red" , "orange" , "Yellow" , "green" , "blue" , "indigo" , "Voilet"};
		List<String> colorString = Arrays.asList(arr);

		
		System.out.println("colors before m");
		Stream<String> stream = Arrays.asList(arr).stream();
		List<String> lessthanm = stream.filter((str) -> str.compareToIgnoreCase("m")<0).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
		System.out.println(lessthanm);
		
		System.out.println("color less than length 6");
		stream = Arrays.asList(arr).stream();
		List<String> lessthan5 = stream.filter((str) -> str.length()<=5).collect(Collectors.toList());
		System.out.println(lessthan5);
		
		stream = Arrays.asList(arr).stream();
		List<String> upper = stream.filter((str) -> str.codePointAt(0)<97).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
		
		
		
//		Stream<String> stream = colorString.parallelStream();
//		stream.map((s) -> s.toUpperCase()).forEach(System.out::println);
//		
//		System.out.println("===================================");
//		stream = colorString.parallelStream();
//		String filterLetter = "m";
//		String[] filteredWords = Arrays.stream(arr).filter(s -> s.compareToIgnoreCase(filterLetter)<0).toArray(String[]::new);
//		for(String i: filteredWords) System.out.println(i);
//		
//		System.out.println("===================================");
//		stream = colorString.parallelStream();
//		String[] filteredAlphabets = stream.filter(s -> s.length() <= 5).toArray(String[]::new);
//		for(String i: filteredAlphabets) System.out.println(i);
//		
//		System.out.println("===================================");
////		
	}
}
