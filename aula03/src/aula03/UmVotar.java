package aula03;

import java.util.Scanner;

public class UmVotar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe a idade do usuário: ");
		int idade = Integer.parseInt(teclado.nextLine());
		String tipo = idade >=16 ? "Pode" : "Não pode";
		System.out.printf("Você %s votar!", tipo);
		
		teclado.close();
		
	}
		
	}
	


