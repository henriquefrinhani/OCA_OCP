package com.ocp.capitulo_9;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste2 {
	
	public static void main(String[] args){
		Path path = Paths.get("com/java/One.java");
		matcher(path, "glob:*.java");
		matcher(path, "glob:**/*.java");
		matcher(path, "glob:*");
		matcher(path, "glob:**");
	}
	
	public static void matcher(Path path, String glob){
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(matcher.matches(path));
	}
}
