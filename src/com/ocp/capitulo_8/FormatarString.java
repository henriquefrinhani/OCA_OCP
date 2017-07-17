package com.ocp.capitulo_8;

public class FormatarString {
	static public void main(String... strings){
		System.out.printf(">%2$+0(20f<", 14.123456789, -235454.987654321);
	}
}
