package aula03;

import java.util.Scanner;

public class NomeCaracteres {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva seu nome completo");
		String nome = (teclado.nextLine());
			
		
		if (nome.replace(" ", "").length() <= 3 ) {
			System.out.println("Nome inválido");			
		} else {
			System.out.println("Bem vindo");
		}
		
		
		teclado.close();
	}

}

