package aula03;

public class RetirarVogais {
	
	public static void main(String[] args) {
		String texto = "hoje � dia de curso!";
		String teste = texto.replaceAll("[aA��eE��iI��oO����uU]", "");
		System.out.println(teste);
		String consoantes = texto.replaceAll("a", "");
		consoantes = consoantes.replaceAll("A", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("e", "");
		consoantes = consoantes.replaceAll("E", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("i", "");
		consoantes = consoantes.replaceAll("I", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("o", "");
		consoantes = consoantes.replaceAll("O", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("u", "");
		consoantes = consoantes.replaceAll("U", "");
		consoantes = consoantes.replaceAll("�", "");
		consoantes = consoantes.replaceAll("�", "");
		System.out.println(consoantes);
	}

}
