package br.com.cursoJava.aula002;

import java.util.Scanner;

public class IMC {
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o seu peso: ");
		float peso = Float.parseFloat(teclado.nextLine());
		System.out.println("Informe a sua altura(usar ponto, ex: 1.73): ");
		float altura = Float.parseFloat(teclado.nextLine());
		
		float imc = (peso / (altura * altura));
		System.out.printf("o seu IMC é: %f", imc);
		
		teclado.close();
		
	}

}
