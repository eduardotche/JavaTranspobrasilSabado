package br.com.cursoJava.aula002;

import java.util.Scanner;

public class MediaAprovacao {
	
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a primeira Nota: ");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a Segunda Nota: ");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a Terceira Nota: ");
		double nota3 = Double.parseDouble(teclado.nextLine());
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
			
		}
		
		teclado.close();
	}

}
