package com.cts.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeP1 {

	public static void main(String[] args) {
		
		// Get Today's , yesterday and tomorrow date
		LocalDate date =LocalDate.now();
		LocalDate yesterday =date.minusDays(1);
		LocalDate tomorow = date.plusDays(1);
		
		System.out.println("Today::"+date);
		System.out.println("Yesterday::"+yesterday);
		System.out.println("Tomorrow::"+tomorow);
		System.out.println("*********************************");
		
		// Check Leap Year
		
		LocalDate leap =LocalDate.of(2019, 10, 14);
		System.out.println("Is "+ leap+" a leap year? ::"+leap.isLeapYear());
		
		LocalDate leap1 =LocalDate.of(2020, 10, 14);
		System.out.println("Is "+ leap1+" a leap year? ::"+leap1.isLeapYear());
		
		System.out.println("*********************************");
		
		//to represent date and time
		
		LocalDateTime time =LocalDateTime.now();
		System.out.println("Today's Date and time:: "+time);
		
		System.out.println("*********************************");
		
		//Converting local date to string
		
		LocalDate strDate =LocalDate.now();
		String sDate = strDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date converted to string format::"+sDate);
		
		System.out.println("*********************************");
		//String to local date
		
		String sDate2 ="2020-10-27";
		LocalDate strDate2 =LocalDate.parse(sDate2);
		System.out.println("String converted to date format::"+strDate2);
	}

}
