package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCopy {
	public static void main(String[] args){
		try{
			//teste
			Path path = Paths.get("myDir\\path.txt"); 
			Path path2 = Paths.get("myDir2");
			System.out.println(Files.exists(path));
			Files.copy(path, path2);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
