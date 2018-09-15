package br.com.cursojava.aula001;

public class Maiornumero {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 7;
		int num3 = 25;
		int num4 = 10;
		int soma1 = (Math.max(num1, num2));
		int soma2 = (Math.max(num3, num4));
		int soma3 = (Math.max(soma1, soma2));
		
		System.out.println(soma3);
	}

}
