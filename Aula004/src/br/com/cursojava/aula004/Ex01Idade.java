package br.com.cursojava.aula004;

import java.util.Scanner;

public class Ex01Idade {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		
		do {
			System.out.println("informe a sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());					
			
			if (idade > 0) {
				System.out.printf("Sua idade é: %d", idade);
				break;
				
			} else {
				System.out.println("Idade inválida\n");
			}
			
		} while (idade < 0);
		
		teclado.close();
	}
}

