package com.ocp.capitulo_9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRecupInfo {
	public static void main(String[] args){
		Path path = Paths.get("d:\\usuarios\\t040819421\\workspaceEE\\OCA_ACP");
		System.out.println("getFileName: "+path.getFileName());
		System.out.println("getName: "+path.getName(0));
		System.out.println("getParent: "+path.getParent());
		System.out.println("SubPath: "+path.subpath(1, 3));
		System.out.println("getRoot: "+path.getRoot());
		System.out.println("getNameCount: "+path.getNameCount());
		System.out.println("ToString: "+path.toString());
		System.out.println("------------------------------------------------");
		//System.out.print(path.getRoot());
		
		int space = 1;
		for(Path subPath : path){
			System.out.format("%" + space + "s%s%n",  "",subPath );
			space +=4;
		}
	}
}
