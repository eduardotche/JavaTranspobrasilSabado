package aula03;

import java.util.Scanner;

public class CincoQuantidadeCaracteres {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva seu nome:");
		String nome = (teclado.nextLine());
		System.out.printf("O nome %s possui %s caracteres\n", nome, nome.length());
		
		
	teclado.close();	
	}
	

}
