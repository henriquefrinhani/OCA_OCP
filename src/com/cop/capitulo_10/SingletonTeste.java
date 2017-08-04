package com.cop.capitulo_10;

import java.util.ArrayList;
import java.util.List;

public class SingletonTeste {
	// Teatro
	
	List<String> poltronas;

	public SingletonTeste(){
		poltronas = new ArrayList<>();
		poltronas.add("1A"); poltronas.add("2A"); poltronas.add("3A");
		poltronas.add("1B"); poltronas.add("2B"); poltronas.add("3B");
		poltronas.add("1C"); poltronas.add("2C"); poltronas.add("3C");
	}
	
	
	public boolean bookSeat(String acento){
		return poltronas.remove(acento);
	}
	
	private static void ticketAgentBooks(String acento){
		SingletonTeste teatro = new SingletonTeste();
		System.out.println(teatro.bookSeat(acento));
		System.out.println(teatro);
		for(String s : teatro.poltronas){
			System.out.print("["+s+"] ");
		}
		System.out.println();
		System.out.println("------------------------------------");
	}
	
	public static void main(String[] args){
		ticketAgentBooks("1A");
		ticketAgentBooks("3B");
		ticketAgentBooks("1A");
		
		
	}
}
