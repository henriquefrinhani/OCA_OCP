package com.ocp.capitulo_9;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste {
	public static void main(String [] args){
		Path path1 = Paths.get("C:/temp/Aquivos/one.java");
		Path path2 = Paths.get("one.txt");
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob: **/*.java");
		
		System.out.println(matcher.matches(path1));
		System.out.println(matcher.matches(path2));
	}
}
