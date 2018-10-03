package aula03;

import java.util.Scanner;

public class aula03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		String tipo = idade >=18 ? "maior" : "menor";
		System.out.printf("Você é %s de idade\n",tipo);
		teclado.close();
		
	}

}
