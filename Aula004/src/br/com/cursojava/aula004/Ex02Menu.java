package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex02Menu {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe a sua opção: ");
		String opcao;
		
		do {
		System.out.println(" A - Abrir arquivo");
		System.out.println(" B - Procurar arquivo");
		System.out.println(" C - Download do arquivo");
		System.out.println(" D - Upload de arquivo");
		System.out.println(" S - Sair");
		opcao = teclado.nextLine().toUpperCase();
		switch (opcao) { 
		case "A":
			System.out.println("Abrir arquivo\n");
			break;
		case "B":
			System.out.println("Procurar arquivo\n");
			break;
		case "C":
			System.out.println("Upload de arquivo\n");
			break;
		default:
			System.out.println("Sair\n");
			}
		} while (!opcao.equals("S"));
			System.out.println("Fim da aplicação");
		
		teclado.close();
	}

}

