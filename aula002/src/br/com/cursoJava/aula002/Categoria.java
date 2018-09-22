package br.com.cursoJava.aula002;

import java.util.Scanner;

public class Categoria {
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua Idade: ");
		int idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18) {
			System.out.println("Categoria Adulto");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Categoria Jvenil");
		} else if (idade >=12 && idade <=13) {
			System.out.println("Categoria Infanto Juvenil");
		} else if (idade >= 9 && idade <= 11) {
			
			System.out.println("Categoria infantil");
		} else {
			System.out.println("Categoria Mirim");
		}
		
		teclado.close();
	}

}
