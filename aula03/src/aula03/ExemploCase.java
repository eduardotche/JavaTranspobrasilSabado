package aula03;

import java.util.Scanner;

public class ExemploCase {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Innforme o dia da semana: ");
		int dia = Integer.parseInt(teclado.nextLine());

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda");
			break;

		case 3:
			System.out.println("Terça");
			break;

		case 4:
			System.out.println("Quarta");
			break;

		case 5:
			System.out.println("Quinta");
			break;

		case 6:
			System.out.println("Sexta");
			break;

		case 7:
			System.out.println("Quinta");
			break;
		default:
			System.out.println("Numero Inválido");
			break;
		}
		teclado.close();

	}

}
