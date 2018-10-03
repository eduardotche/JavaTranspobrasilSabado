package aula03;

import java.util.Scanner;

public class ExemploString {
	
	public static void main(String[] args) {
		
		String curso = "Curso Java transpoBrasil s�bado";
		
		//Quantidade de caracteres
		System.out.printf("O texo %s possui %d caracteres\n", curso, curso.length());
		
		//Quantidade de caracteres sem espa�os
		String semEspaco = curso.replace(" ", "");
		System.out.println(semEspaco);
		System.out.println(curso);
		System.out.println(curso.replace(" ", "").length());
		
		//caractere ou parte de um texto
		
		System.out.println(curso.contains("transpoBrasil"));
		System.out.println(curso.startsWith("Curso"));
		System.out.println(curso.endsWith("Domingo"));
		
		System.out.println(curso.indexOf("transpoBrasil"));
		System.out.println(curso.indexOf("a"));
		System.out.println(curso.indexOf("a", 10));
		System.out.println(curso.lastIndexOf("a"));
		
		
		// Manipula��o de caixa alta ou baixa
		System.out.println(curso.toUpperCase());
		System.out.println(curso.toLowerCase());
		
		//Parte do texto
		System.out.println(curso.substring(11));
		System.out.println(curso.substring(11, 17));
		
		String palavra = "s�bado";
		int indice = curso.toLowerCase().indexOf(palavra.toLowerCase());
		System.out.println(indice);
		
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		
		System.out.println("=============");
		String user1 = "Jo�o";
		String user2 = "Jo�o";
		String user3 = new String("Jo�o");
		System.out.println(user1 == user2);
		System.out.println(user1 == user3);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equalsIgnoreCase(user3));
		
		//Faz a compara��o ignorando a caixa alta ou baixa
		System.out.println(user1.equalsIgnoreCase("JO�O"));
		System.out.println("jo�o".equalsIgnoreCase("JO�O"));
		
		String texto = "   OI PESSOAL   ";
		String registro = "contato;contato@teste.com;33221100";
		
		System.out.printf(">%s< , length = %d\n", texto, texto.length());
		System.out.printf(">%s< , length = %d\n", texto.trim(), texto.trim().length());
		String[] valores = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
		
	}

}
