package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {
	
	public static void main(String... args) {
		
		//LocalDate 
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalDate  date1 = LocalDate.of(2022, 10, 27);
		System.out.println(date1);
		
		LocalDate parsedate = LocalDate.parse("2000-11-18");
		System.out.println(parsedate);
		
		System.out.println(parsedate.getMonth());
		System.out.println(parsedate.getYear());
		System.out.println(parsedate.getDayOfMonth());
		System.out.println(parsedate.getDayOfYear());
		System.out.println(parsedate.getDayOfWeek());
		System.out.println(parsedate.getMonthValue());
		
		System.out.println(parsedate.isLeapYear());
		System.out.println(parsedate.lengthOfMonth());
		System.out.println(parsedate.lengthOfYear());
		
		System.out.println(date.plusDays(2));
		System.out.println(date.minusDays(2));
		System.out.println(date.plusMonths(2));
		System.out.println(date.minusMonths(2));
		System.out.println(date.plusWeeks(2));
		System.out.println(date.minusWeeks(2));
		System.out.println(date.plusYears(2));
		System.out.println(date.minusYears(2));
		
		System.out.println(date.withDayOfYear(38));
		
		LocalDate d = LocalDate.of(2023,1,1);
		System.out.println(d.withDayOfYear(40));
		
		LocalDate isValid = LocalDate.of(2028,6,1);
		System.out.println(LocalDate.now().isBefore(isValid));
		System.out.println(LocalDate.now().isAfter(isValid));
		System.out.println(LocalDate.now().isEqual(isValid));
		
		//LocalDateTime
		
		LocalDateTime localDatetime = LocalDateTime.now();
		System.out.println(localDatetime);
		
		//same Applicable mehods here and extra methods like hour,minute,second,minussecond,plusSeconds
		
		//DateFormatters
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(localDatetime.format(ofPattern));
		
		DateTimeFormatter ofPattern1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println(localDatetime.format(ofPattern1));
		
		DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
		System.out.println(localDatetime.format(ofPattern2));
		
		DateTimeFormatter ofPattern3 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
		System.out.println(localDatetime.format(ofPattern3));
		
		DateTimeFormatter ofPattern4 = DateTimeFormatter.ofPattern("MMM-dd-yy");
		System.out.println(localDatetime.format(ofPattern4));
		
		DateTimeFormatter ofPattern5 = DateTimeFormatter.ofPattern("MMM-d-yy");
		System.out.println(localDatetime.format(ofPattern5));
		
		DateTimeFormatter ofPattern6 = DateTimeFormatter.ofPattern("M-d-yyyy");
		System.out.println(localDatetime.format(ofPattern6));
		
		

		
		
		
		 
		
		
	}

}
