package aula03;

public class PrimeiraLetra {
	
	public static void main(String[] args) {
		String texto = "hoje é dia de curso!";
		int index = texto.trim().lastIndexOf(" ");
		System.out.println(texto.trim().substring(index+1));

	}
}
