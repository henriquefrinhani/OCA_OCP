package com.ocp.capitulo_11;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ClassificarArrayList {
	public static void main(String[] args){
		List<String> lista = new ArrayList<>();
		lista.add("walter");
		lista.add("Ana");
		lista.add("Paulo");
		lista.add(".afsd");
		lista.add("Maria");
		lista.add("Amanda");
		lista.add("1tad");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}
}
