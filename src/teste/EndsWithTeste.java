package teste;

public class EndsWithTeste {
	public static void main(String[] argas) {
		String[] diretorios = { "text1.txt", "text1.txt", "text1.txt", "text1.txt", "documento.doc", "img.jpg" };

		for (String dir : diretorios)
			if (dir.endsWith(".jpg")) {
				System.out.println("diretório: "+dir);
			}
	}
}
