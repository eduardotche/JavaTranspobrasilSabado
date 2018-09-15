package br.com.cursojava.aula001;

public class Menornumero {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		int num3 = 20;
		int num4 = 30;
		int soma1 = Math.min(num1, num2);
		int soma2 = Math.min(num3, num4);
		int soma3 = Math.min(soma1, soma2);
		
		System.out.println("O menor número é: " + soma3);
		
		int min = Math.min(Math.min(Math.min(num1, num2),num3),num4);
		System.out.println(min);
	}

}
