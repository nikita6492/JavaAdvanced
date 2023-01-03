package com.cts.dateTimeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeP3 {

	public static void main(String[] args) {
		
		// Date time format processing
		LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
        
        System.out.println("*******************************");
        
        //Chrono examples
        LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);    
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
        
	}
}
