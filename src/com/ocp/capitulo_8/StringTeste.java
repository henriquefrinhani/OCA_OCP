package com.ocp.capitulo_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTeste {
	
	public static void main(String[] args){
		String txt = "ab4 56 _7ab88  7k 49";
		Pattern padrao = Pattern.compile("\\w\\d");
		Matcher mat = padrao.matcher(txt);
		
		String s = "";
		while(mat.find()){
			int inicio = mat.start();
			int fim = mat.end();
			// s += txt.substring(inicio, fim);
			 System.out.print("inicio: "+inicio+" | ");
			 System.out.println("Group: "+mat.group());
		}
		
		//System.out.println("\n|"+s+"|");
	}
}
