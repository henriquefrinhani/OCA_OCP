package teste;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Teste {
	public static void main(String[] args) {
		try {
			Files.deleteIfExists(Paths.get("c:/temp/documento.doc"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
