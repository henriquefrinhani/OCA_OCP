package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTeste extends SimpleFileVisitor<Path> {

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (file.getFileName().toString().endsWith(".bmp"))
			Files.delete(file);
		return FileVisitResult.CONTINUE;
	}

	public static void main(String[] args) throws IOException {
		SimpleFileVisitorTeste dirs = new SimpleFileVisitorTeste();
		Files.walkFileTree(Paths.get("c://temp"), dirs);
		System.out.println("Fim");

	}

}
