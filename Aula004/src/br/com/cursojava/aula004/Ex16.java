package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		String[] nomes = new String[10];
		double mediaNotas = 0;
		String[] nomeENota;

		for (int i = 0; i < 10; i++) {

			System.out.printf("Insira o nome e a nota do %d� aluno, respectivamente, separados por espa�o:\n", i + 1);
			nomeENota = teclado.nextLine().split(" ");
			nomes[i] = nomeENota[0];
			notas[i] = Double.parseDouble(nomeENota[1]);
			mediaNotas += notas[i] / 10;

		}

		System.out.printf("Rela��o de alunos com notas maiores que a m�dia (%.2f):\n", mediaNotas);

		for (int i = 0; i < 10; i++) {

			if (notas[i] > mediaNotas) {

				System.out.printf("%s Nota: %.2f\n", nomes[i], notas[i]);

			}

		}
		teclado.close();

	}

}
