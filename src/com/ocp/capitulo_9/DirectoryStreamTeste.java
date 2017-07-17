package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;

public class DirectoryStreamTeste {
	public static void main(String[] args){
		Path dir = Paths.get("c:temp");
		
		try(DirectoryStream<Path> strem = Files.newDirectoryStream(dir, "[fla]*")){
			for(Path path : strem)
				System.out.println(path.getFileName());
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
