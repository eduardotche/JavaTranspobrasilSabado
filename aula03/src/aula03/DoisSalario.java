package aula03;

import java.util.Scanner;

public class DoisSalario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do sal�rio");
		double sal = Double.parseDouble(teclado.nextLine());
		String imposto = sal <= 1800 ? "isento" : "n�o � isento";
		System.out.printf("Voc� � %s do imposto de renda", imposto);
		teclado.close();
		
		
	}

}


	