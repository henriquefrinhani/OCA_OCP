package com.ocp.capitulo_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatTeste {

	public static void main(String[] args){
		Date d1 = new Date();
		
		
		DateFormat[] format = new DateFormat[6];
		format[0] = DateFormat.getInstance();
		format[1] = DateFormat.getDateInstance();
		format[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		format[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		format[4] = DateFormat.getDateInstance(DateFormat.LONG);
		format[5] = DateFormat.getDateInstance(DateFormat.FULL);
				
		for(DateFormat df : format)
			System.out.println(df.format(d1));
		
		
		Date d2 = new Date();
		DateFormat df = DateFormat.getInstance();
		
		System.out.println(" \n"+df.format(d2));
		
		Date d3 = new Date();
		String s = df.format(d3);
		System.out.println("\ns: "+s);
		
		try{
			Date d4 = df.parse(s);
			System.out.println("d3: "+d4);
		}catch(ParseException e){
			System.out.println(e);
		}
		
		
	}
}
