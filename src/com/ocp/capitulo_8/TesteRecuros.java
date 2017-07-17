package com.ocp.capitulo_8;

import java.util.Locale;
import java.util.ResourceBundle;

public class TesteRecuros {
	public static void main(String[] args){
		Locale en = new Locale("en");
		Locale enCan = new Locale("en", "CA");
		Locale frCan = new Locale("fr", "CA");
		Locale ptBr = new Locale("pt", "BR");
		Locale def =  Locale.getDefault();
		
	    def.setDefault(Locale.ENGLISH);
		
		ResourceBundle rb =  ResourceBundle.getBundle("com.ocp.capitulo_8.recursos.Labels", def);
		System.out.println(rb.getString("hello"));
		
	}
}
