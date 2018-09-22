package br.com.cursoJava.aula002;

import java.util.Scanner;

public class IdadeMesesDias {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira a sua idade em dias: ");
		int idadedias = Integer.parseInt(teclado.nextLine());
		
		float anos = (idadedias / 360);
		float meses = (anos / 12);
		float dias = (meses / 30);
		System.out.printf("A sua idade é: %.0f anos, %.2f meses, %.2f dias", anos, meses, dias);
		
		teclado.close();
		
	}

}
