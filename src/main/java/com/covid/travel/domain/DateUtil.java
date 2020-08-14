package com.covid.travel.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateUtil {
	public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		public static LocalDateTime parseDateFormat(String date) {
			
			if (date.isEmpty()) {
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			   	LocalDateTime now = LocalDateTime.now();
			   	String dateTimeString = now.format(formatter);    
			   date= dateTimeString.replace("-", "/");
			   return LocalDateTime.parse(date, dateTimeFormatter); 	    
			    	
			    	}
			else if(date.length()==10){
				
				StringBuilder br=new StringBuilder(date);
				 br.append(" 00:00:00");
				 date=String.valueOf(br);
				 return LocalDateTime.parse(date, dateTimeFormatter);
			}
			
           else if(date.length()==16){
				
				StringBuilder br=new StringBuilder(date);
				 br.append(":00");
				 date=String.valueOf(br);
				 return LocalDateTime.parse(date, dateTimeFormatter);
			}
			return LocalDateTime.parse(date, dateTimeFormatter);
			}
			
    private DateUtil() {}

	}


