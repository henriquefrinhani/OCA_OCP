package com.ocp.capitulo_8;

import java.util.Scanner;

public class ScannerTeste {
	public static void main(String[] args){
		//System.out.print("input: ");
		//System.out.flush();
		
		String padrao = " ";
		String entrada = "ab, cd5b, 6x, z4";
		
		try{
			Scanner scanner = new Scanner(entrada);
			String token;
			do{
				token = scanner.findInLine(padrao);
				System.out.println("Token: "+token);
			}while(token != null);
			
		}catch(Exception e){
			System.err.println("Exception!!!");
		}
	}
}
