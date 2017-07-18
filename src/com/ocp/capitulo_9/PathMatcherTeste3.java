package com.ocp.capitulo_9;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste3 {
	
	public static void main(String[] args){
		Path path1 = Paths.get("0\\b/teste/1");
		//Path path2 = Paths.get("9\\*b/teste/1");
		//Path path3 = Paths.get("01b/teste/1");
		//Path path4 = Paths.get("0*b/1");
		
		String glob = "glob: [0-9]\\*{A*, b}/**/1";
		
		matcher(path1, glob);
		//matcher(path2, glob);
		//matcher(path3, glob);
		//matcher(path4, glob);
	}
	
	public static void matcher(Path path, String glob){
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(matcher.matches(path));
	}
}
