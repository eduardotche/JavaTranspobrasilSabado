package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex07DoisNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("informe o primeiro número: \n");
		int numero1 = Integer.parseInt(teclado.nextLine());
		int numero2;
		do {

			System.out.println("Informe o segundo número: \n");
			numero2 = Integer.parseInt(teclado.nextLine());
			System.out.println("");
			if (numero2 <= numero1) {
				System.out.println("Número inválido\n");

			}
		} while (numero2 <= numero1);

		System.out.printf("Números entre %d e %d\n", numero1, numero2);
		for (int i = numero1 + 1; i < numero2; i++) {
			System.out.println(i + "");
		}

		teclado.close();
	}

}
