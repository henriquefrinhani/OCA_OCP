package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste {
	public static void main(String[] args) {
		try {
			//teste
			Path path = Paths.get("path.txt");
			System.out.println("path: " + Files.exists(path));
			Files.createFile(path);
			System.out.println("Path: " + Files.exists(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
