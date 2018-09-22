package br.com.cursoJava.aula002;

import java.util.Scanner;

public class IdadeCNH {
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Imforme sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18) {
			System.out.println("Pode retirar CNH!");
		} else {
			System.out.println("Muito novo, não pode retirar CNH!");
		}
		teclado.close();
		
	}
	

}
