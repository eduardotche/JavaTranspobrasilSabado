package aula03;

public class RetirarVogais {
	
	public static void main(String[] args) {
		String texto = "hoje é dia de curso!";
		String teste = texto.replaceAll("[aAáÁeEéÉiIíÍoOóÓúÚuU]", "");
		System.out.println(teste);
		String consoantes = texto.replaceAll("a", "");
		consoantes = consoantes.replaceAll("A", "");
		consoantes = consoantes.replaceAll("á", "");
		consoantes = consoantes.replaceAll("ã", "");
		consoantes = consoantes.replaceAll("Á", "");
		consoantes = consoantes.replaceAll("Ã", "");
		consoantes = consoantes.replaceAll("e", "");
		consoantes = consoantes.replaceAll("E", "");
		consoantes = consoantes.replaceAll("é", "");
		consoantes = consoantes.replaceAll("É", "");
		consoantes = consoantes.replaceAll("i", "");
		consoantes = consoantes.replaceAll("I", "");
		consoantes = consoantes.replaceAll("í", "");
		consoantes = consoantes.replaceAll("Í", "");
		consoantes = consoantes.replaceAll("o", "");
		consoantes = consoantes.replaceAll("O", "");
		consoantes = consoantes.replaceAll("ó", "");
		consoantes = consoantes.replaceAll("Ó", "");
		consoantes = consoantes.replaceAll("u", "");
		consoantes = consoantes.replaceAll("U", "");
		consoantes = consoantes.replaceAll("ú", "");
		consoantes = consoantes.replaceAll("Ú", "");
		System.out.println(consoantes);
	}

}
