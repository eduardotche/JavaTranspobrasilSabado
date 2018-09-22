package br.com.cursoJava.aula002;

import java.util.Scanner;

public class ParImpar {
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe um número inteiro: ");
		int num = Integer.parseInt(teclado.nextLine());
		
		num = (num % 2);
		if (num == 0) {
			System.out.println("O número é Par");
		} else {
			System.out.println("O número é Ímpar");
		}
		teclado.close();
	}

}
