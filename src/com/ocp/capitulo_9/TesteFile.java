package com.ocp.capitulo_9;

import java.io.File;
import java.io.IOException;

public class TesteFile {
	public static void main(String[] args) {

		try {
			File file = new File("file.txt");
			System.out.println("file: " + file.exists());
			file.createNewFile();
			System.out.println("file: " + file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
