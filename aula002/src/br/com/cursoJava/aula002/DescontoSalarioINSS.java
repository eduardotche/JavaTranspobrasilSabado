package br.com.cursoJava.aula002;

import java.util.Scanner;

public class DescontoSalarioINSS {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("infome o valor do Sal�rio: ");
		double sal = Double.parseDouble(teclado.nextLine());
		
		double Desc = (sal * 11) / 100;
		double SalInss = (Desc + sal);
		System.out.printf("%f \n %f", SalInss, Desc);
		
		if (SalInss >= 1800 && sal <= 2399) {
			double valorDescIr = (SalInss * 7.5) / 100;
			double SalLiq = (valorDescIr + SalInss);
			
			System.out.printf("O valor do sal�rio inicial �: %.2f \n O valor do desconto do Inss �: %.2f \n O valor do Desconto IR �: %.2f \n O valor do Sal�rio l�quido �: %.2f ", sal, Desc, valorDescIr, SalLiq );
		} 
		
	}

}
