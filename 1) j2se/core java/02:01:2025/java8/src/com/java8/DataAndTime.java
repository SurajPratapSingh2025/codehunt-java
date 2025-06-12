package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataAndTime {
	public static void main(String[] args) {
		
		//------local date------
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
		
//		String date = now.toString();
//		System.out.println(date.concat(" Nice Day"));
		
//		boolean leapYear = now.isLeapYear();
//		System.out.println(leapYear);
		
//		System.out.println(now.getDayOfYear());
//		System.out.println(now.getDayOfMonth());
//		System.out.println(now.getDayOfWeek());
		
		
		
		//plusYear & minusYear
//		LocalDate plusYears = now.plusYears(5);
//		System.out.println(plusYears);
		
//		LocalDate plusWeeks = now.plusYears(5).plusWeeks(1);
//		System.out.println(plusWeeks);
		
//		LocalDate plusDays = now.plusMonths(2).plusDays(2);
//		System.out.println(plusDays);
		
//		LocalDate minusDays = now.minusYears(2).minusMonths(2).minusWeeks(1).minusDays(1);
//		System.out.println(minusDays);
		
		
		//change date format (default: YY-MM-DD, Change: DD-MM-YY)
//		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		String format = now.format(ofPattern);
//		System.out.println(format);
		
		
		
		//------local time------
//		LocalTime now = LocalTime.now();
//		System.out.println(now);
		
//		System.out.println(now.toString());
		
//		System.out.println(now.getHour());
//		System.out.println(now.getMinute());
//		System.out.println(now.getSecond());
//		System.out.println(now.getNano());
		
		//pulusHour & minusHour
//		LocalTime plusSeconds = now.plusHours(2).plusMinutes(5).plusSeconds(30).plusNanos(5);
//		System.out.println(plusSeconds);
		
//		LocalTime minusNanos = now.minusHours(2).minusMinutes(30).minusSeconds(30).minusNanos(5);
//		System.out.println(minusNanos);
		
		
		//change time format (defualt: hh:mm:ss:nnnnnnnnn, change: hh:mm)
//		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("hh:mm");
//		String format = now.format(ofPattern);
//		System.out.println(format);
		
		
//		LocalDate of = LocalDate.of(1996, 1, 2);
//		boolean leapYear = of.isLeapYear();
//		System.out.println(leapYear);
		
		
		
		//-------Date & Time--------
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime plusYears = now.plusYears(2).plusMonths(2).plusWeeks(7).plusHours(70).plusMinutes(300);
		System.out.println(plusYears);
		
		
		
		
		
		
	}
}
