package com.ocp.capitulo_8;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTeste {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 11, 32);
		
		Date d1 = cal.getTime();
		
		Locale locUs = new Locale("us");
		Locale locIt = new Locale("it");
		Locale locPt = new Locale("pt");
		Locale locPtBr = new Locale("pt", "BR");
		Locale locIn = new Locale("hi", "IN");
		Locale locJa = new Locale("ja");
		
		DateFormat dfIt = DateFormat.getDateInstance(DateFormat.FULL, locIt);
		System.out.println("Itália: "+dfIt.format(d1));
		
		DateFormat dfPt = DateFormat.getDateInstance(DateFormat.FULL, locPt);
		System.out.println("Portugal: "+dfPt.format(d1));
		
		DateFormat dfPtBr = DateFormat.getDateInstance(DateFormat.FULL, locPtBr);
		System.out.println("Brasil: "+dfPtBr.format(d1));
		
		DateFormat dfIn = DateFormat.getDateInstance(DateFormat.FULL, locIn);
		System.out.println("India: "+dfIn.format(d1));
		
		DateFormat dfJa = DateFormat.getDateInstance(DateFormat.FULL, locJa);
		System.out.println("Japão: "+dfJa.format(d1));
		
		DateFormat dfUs = DateFormat.getDateInstance(DateFormat.FULL, locUs);
		System.out.println("Estados Unidos: "+dfUs.format(d1));
		
	}
}
