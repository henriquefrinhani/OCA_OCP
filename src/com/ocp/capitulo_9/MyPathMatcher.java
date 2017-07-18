package com.ocp.capitulo_9;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyPathMatcher extends SimpleFileVisitor<Path>{
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob: **\\senha\\**.txt");
	
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
		if(matcher.matches(file))
			System.out.println("------------------> "+file);
		System.out.println(matcher.matches(file)+" - "+file);
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args) throws Exception{
		MyPathMatcher dirs = new MyPathMatcher();
		Files.walkFileTree(Paths.get("c:/temp"), dirs);
	}
}
