package br.com.cursoJava.aula002;

import java.util.Scanner;

public class CalculoRetangulo {
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Insira o valor da Base do Retângulo: ");
	float base = Float.parseFloat(teclado.nextLine());
	System.out.println("Insira o valor da Altura do Retângulo: ");
	float altura = Float.parseFloat(teclado.nextLine());
	
	float ret = (base * altura);
	System.out.printf("A Área de um Retângulo é: %f", ret);
	float per = 2 * (base + altura);
	System.out.printf("O Perímetro de um Retângulo é: %f", per);
	
	teclado.close();
	
	}
}
