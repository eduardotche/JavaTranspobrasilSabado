package br.com.cursoJava.aula002;

import java.util.Scanner;

public class ConceitoNotas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a primeira Nota: ");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a segunda Nota: ");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a teceira Nota: ");
		double nota3 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a quarta Nota: ");
		double nota4 = Double.parseDouble(teclado.nextLine());
		
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if (media >= 9) {
			
			System.out.printf("o valor da Média é: %.2f Conceito A", media);
		} else if (media >= 8 && media < 9) {
			System.out.printf("O valor da média é: %.2f Conceito B", media);
		} else if (media >= 6 && media <= 8) {
			System.out.printf("O valor da média é: %.2f Conceito C", media);
		} else if (media >=5 && media < 6) {
			System.out.printf("O valor da média é: %.2f Conceito D", media);
		} else {
			System.out.printf("O valor da média é: %.2f Insuficiente", media);
		}
		
		teclado.close();
		
		
	}

}
