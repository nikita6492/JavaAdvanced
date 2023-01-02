package com.cts.dateTimeApi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTimeP2 {

	public static void main(String[] args) {
		
		//Basic time processing
		LocalTime lt=LocalTime.now();
		LocalTime lt1 = lt.minusHours(2);
		LocalTime lt2 =lt.minusMinutes(30);
		LocalTime lt3 =lt.plusHours(2);
		LocalTime lt4 =lt.plusMinutes(30);
		System.out.println("Current time::"+lt);
		System.out.println("Two hours back time::"+lt1);
		System.out.println("30 minustes back time::"+lt2);
		System.out.println("Two hours after time::"+lt3);
		System.out.println("30 minustes after time::"+lt4);

		System.out.println("***********************************");
		
		//Zone related processing
		 ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
		 ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
		 LocalTime time1 = LocalTime.now(zone1);  
		 System.out.println("India Time Zone: "+time1);  
		 LocalTime time2 = LocalTime.now(zone2);  
		 System.out.println("Japan Time Zone: "+time2);  
		 long hours = ChronoUnit.HOURS.between(time1, time2);  
		 System.out.println("Hours between two Time Zone: "+hours);  
		 long minutes = ChronoUnit.MINUTES.between(time1, time2);  
		 System.out.println("Minutes between two time zone: "+minutes);  
	}

}
