package teste;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Teste extends SimpleFileVisitor<Path>{
	
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
		
		if(file.getFileName().toString().endsWith(".txt"))
			System.out.println(file);
		
		return FileVisitResult.CONTINUE;
	}
	
	public static void main(String[] args) throws IOException {
		Teste dirs = new Teste();
		
		Files.walkFileTree(Paths.get("d:/usuarios/t040819421"), dirs);
	}
}
