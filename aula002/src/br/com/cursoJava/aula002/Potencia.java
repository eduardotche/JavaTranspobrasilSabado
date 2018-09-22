package br.com.cursoJava.aula002;

import java.util.Scanner;

public class Potencia {
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("insira um número: ");
		double numero = Double.parseDouble(teclado.nextLine());
			
		double potencia = Math.pow(numero, 2);
		System.out.println(potencia);
		
		teclado.close();
	}

}
