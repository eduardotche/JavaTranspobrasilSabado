package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex14MediaNotas {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double mediaNotas = 0;

		for (int i = 0; i < 10; i++) {

			System.out.printf("Insira a %d� nota:\n", i + 1);
			notas[i] = Double.parseDouble(teclado.nextLine());
			mediaNotas += notas[i] / 10;

		}

		System.out.printf("Rela��o de notas e se est�o abaixo da m�dia (%.2f):\n", mediaNotas);

		for (double listarNotas : notas) {
			if (listarNotas <= mediaNotas) {
				System.out.println(listarNotas + " <- Abaixo da m�dia!");
			} else {
				System.out.println(listarNotas);
			}
		}

		teclado.close();

	}

}
