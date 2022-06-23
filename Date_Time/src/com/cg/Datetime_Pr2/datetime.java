package com.cg.Datetime_Pr2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime {
	public static void main(String[] args) {
		LocalDateTime myDateObj=LocalDateTime.now();
		System.out.println("Before formatting :"+myDateObj);
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss" );
		String formattedDate=myDateObj.format(myFormatObj);
		System.out.println("After formatting :"+formattedDate);
	}
}
