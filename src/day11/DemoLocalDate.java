package day11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoLocalDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate christmas = LocalDate.of(2024, 12, 25);
		Period timeToChristmas = today.until(christmas);
		System.out.println("Time to christmas :" + timeToChristmas.getYears() + " years " + timeToChristmas.getMonths() + " Months " +  timeToChristmas.getDays() + " days");
		
		LocalDate nextweek = today.plusWeeks(1);
		System.out.println(nextweek);
		
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println(nextMonth);
		
		if(today.isBefore(christmas))
			System.out.println("Still have time");
			
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		
		Stream<LocalDate> thisyear =  LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2024, 1, 1));
		Predicate<LocalDate> fridays = (dt) -> dt.getDayOfWeek().equals(DayOfWeek.FRIDAY);
		Predicate<LocalDate> the13th = (dt) -> dt.getDayOfMonth()==13;
		List<LocalDate> blackFriday = thisyear.filter(fridays).filter(the13th).collect(Collectors.toList());
		System.out.println(blackFriday);

		
	}

}
