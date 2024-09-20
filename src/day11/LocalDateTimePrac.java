package day11;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocalDateTimePrac {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		//calaculating age
		LocalDate dob = LocalDate.of(1998, 1, 19);
		Period bday = today.until(dob);
		System.out.println(bday);
		
		//q2
		
		LocalDate startDay = LocalDate.of(2024, 1, 1);
		
		LocalDate programmersDay = startDay.withDayOfYear(256);
		System.out.println(programmersDay);
		
		
		// Months starting on sundays
		Stream<LocalDate> thisyear =  LocalDate.of(2024, 1, 1).datesUntil(LocalDate.of(2025, 1, 1));
		Predicate<LocalDate> sundays = (dt) -> dt.getDayOfWeek().equals(DayOfWeek.SUNDAY);
		Predicate<LocalDate> the1st = (dt) -> dt.getDayOfMonth()==1;
		List<LocalDate> sundayMonth = thisyear.filter(sundays).filter(the1st).collect(Collectors.toList());
		System.out.println(sundayMonth);
		
		//q4
		
		LocalDateTime dtindia = LocalDateTime.of(2024,9,14,12,0);
		LocalDateTime dtlon = LocalDateTime.of(2024,9,14,16,40);
		ZonedDateTime india = ZonedDateTime.of(dtindia, ZoneId.of("Asia/Calcutta"));
		ZonedDateTime lon = ZonedDateTime.of(dtlon, ZoneId.of("Europe/London"));
		//Europe/London
		
		Duration interval = Duration.between(india, lon);
		System.out.println(interval);
		
		
	}

}
