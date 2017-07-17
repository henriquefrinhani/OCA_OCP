package com.ocp.capitulo_9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteFile2 {
	public static void main(String[] args) {

		try {
			String[] lista = new String[100];
			String diretorio = "";
			File fileDir = new File("Teste\\dir");

			lista = fileDir.list();

			for (String s : lista) {
				if (s.equals("Cadastro.txt")) {
					leitura(diretorio, fileDir);
					
				}
			}

		} catch (Exception ex) {
			System.out.println("Exceção: " + ex);
		}

	}

	static void leitura(String diretorio, File dir) {
		try {
			File fileDir = new File("Teste\\dir");
			fileDir.mkdirs();
			File file = new File(fileDir, diretorio);

			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String s = "";
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
