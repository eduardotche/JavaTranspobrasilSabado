package br.com.cursoJava.aula002;

import java.util.Scanner;

public class CalculoRetangulo {
	public static void main (String[] args){
	Scanner teclado = new Scanner(System.in);
	System.out.println("Insira o valor da Base do Ret�ngulo: ");
	float base = Float.parseFloat(teclado.nextLine());
	System.out.println("Insira o valor da Altura do Ret�ngulo: ");
	float altura = Float.parseFloat(teclado.nextLine());
	
	float ret = (base * altura);
	System.out.printf("A �rea de um Ret�ngulo �: %f", ret);
	float per = 2 * (base + altura);
	System.out.printf("O Per�metro de um Ret�ngulo �: %f", per);
	
	teclado.close();
	
	}
}
