package br.com.cursoJava.aula002;

import java.util.Scanner;

public class MaiorMenorValor {
	static public void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a primeira nota: ");
		int nota1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Insira a segunda nota: ");
		int nota2 = Integer.parseInt(teclado.nextLine());
		System.out.println("insira a terceira nota: ");
		int nota3 = Integer.parseInt(teclado.nextLine());
		
		double soma = (nota1 + nota2 + nota3);
		System.out.printf("\nA soma das notas é: %.0f", soma);
		
		double maio = Math.max(nota1, nota2);
		double maior = Math.max(maio, nota3);
		System.out.printf("\nA maior nota digitada é: %.0f", maior);
		
		double meno = Math.min(nota1, nota2);
		double menor = Math.min(meno,  nota3);
		System.out.printf("\nA menor nota digitada é: %.0f", menor);
		
		teclado.close();
		
	}

}
