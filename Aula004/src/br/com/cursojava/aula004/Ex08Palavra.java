package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex08Palavra {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe uma palavra: ");
		String palavra = teclado.nextLine().toUpperCase();
		String print = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			print += palavra.charAt(i);
			System.out.println(print);
		}
		
		teclado.close();
	}

}
