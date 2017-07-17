package com.ocp.capitulo_8;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste {
	public static void main(String[] args) {
		Date date = new Date(1_000_000_000_000l);
		System.out.println("date: "+date.toString());
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("Calendar: "+c.getTime());
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek())
			System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is: "+c.get(Calendar.DAY_OF_WEEK));
		
		c.add(Calendar.MONTH, 1);
		Date d2 = c.getTime();
		System.out.println("data 2: "+d2);
		
	}
}
