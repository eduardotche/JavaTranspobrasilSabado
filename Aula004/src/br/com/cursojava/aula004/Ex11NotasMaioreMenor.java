package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex11NotasMaioreMenor {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double maiorNota = -1;
		double menorNota = 11;
				
		for(int i = 0; i < 10; i++) {
			System.out.printf("informe a %d nota:\n",i+1);
			notas[i] = Double.parseDouble(teclado.nextLine());
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
			if(notas[i] < menorNota) {
				menorNota = notas[i];
			}
		}
		
		for(Double listaNotas : notas) {
			System.out.println(listaNotas);
		}
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
		
		teclado.close();
		
	}

}

//Escreva um programa que solicite 10 notas e em seguida 
//apresente as notas informadas juntamente com a maior e menor nota