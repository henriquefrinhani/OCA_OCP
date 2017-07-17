package com.ocp.capitulo_8;

import java.util.Date;

public class DateTeste {
	public static void main(String[] args) {
		Date data = new Date();
		
		System.out.println(data.toString());
		
		data.setHours(data.getHours() + 2);
		data.setYear(data.getYear() - 2);
		
		System.out.println(data.toString());
		
	}
}