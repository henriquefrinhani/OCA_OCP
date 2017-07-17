package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTeste extends SimpleFileVisitor<Path> {
	
	public FileVisitResult visitorFile(Path file, BasicFileAttributes atts) throws IOException{
		if(file.getFileName().endsWith(".txt"))
			Files.delete(file);
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args)throws IOException{
		SimpleFileVisitorTeste dirs = new SimpleFileVisitorTeste();
		
		Files.walkFileTree(Paths.get("c:\\temp"), dirs);
	}

}
