package br.com.cursoJava.aula002;

import java.util.Scanner;

public class DescontoProduto {
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("insira o valor do produto: ");
		float valor = Float.parseFloat(teclado.nextLine());
		System.out.println("Insira o valor do desconto: ");
		float desc = Float.parseFloat(teclado.nextLine());
		
		float valordesc = (valor * desc) / 100;
		float valorprod = (valor - valordesc);
		System.out.printf("O valor do produto com o desconto é: %f", valorprod);
		System.out.printf("O valor do desconto é: %f", valordesc);
		
		teclado.close();
		
	}

}
