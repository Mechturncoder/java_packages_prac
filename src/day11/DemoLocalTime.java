package day11;

import java.time.LocalDateTime;

public class DemoLocalTime {
	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime yesterday = today.minusDays(14);
		System.out.println(yesterday);
		
		System.out.println(yesterday);
	}

}
