package com.ocp.capitulo_11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTeste {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("7");
		set.add("2");
		set.add("1");
		set.add("3");
		set.add("4");
		set.add("b"); 
		set.add("b"); 
		set.add("tr"); 
		set.add("sdf"); 
		
		for(Object o : set)
			System.out.println(o);
	}

}
