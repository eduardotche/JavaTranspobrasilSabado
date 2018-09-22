package br.com.cursoJava.aula002;

import java.util.Scanner;

public class NotasMedia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a primeira nota: ");
		float nota1 = Float.parseFloat(teclado.nextLine());
		System.out.println("Insira a segunda nota: ");
		float nota2 = Float.parseFloat(teclado.nextLine());
		System.out.println("Insira a terceira nota: ");
		float nota3 = Float.parseFloat(teclado.nextLine());
		
		float total = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A média das notas %.2f, %.2f e %.2f é: %.2f", nota1, nota2, nota3, total);
		
		teclado.close();
		
	}
	

}
