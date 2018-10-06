package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex10NomesInverso {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] nome = new String[5];
				
		for(int i = 0; i < 5;i++) {
			System.out.printf("insira o %s nome:\n", i+1);
			nome[4-i] = teclado.nextLine();
		}
		
		for(String listaNome : nome) {
			System.out.println(listaNome);
		}
		
	teclado.close();
	}

}
