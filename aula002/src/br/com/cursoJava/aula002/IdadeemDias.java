package br.com.cursoJava.aula002;

import java.util.Scanner;

public class IdadeemDias {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		
		float dias = (idade * 365);
		System.out.printf("A sua idade em dias é: %.0f", dias);
		
		teclado.close();
		
	}

}
