package br.com.cursoJava.aula002;

import java.util.Scanner;

public class DescontoSalarioINSS {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("infome o valor do Salário: ");
		double sal = Double.parseDouble(teclado.nextLine());
		
		double Desc = (sal * 11) / 100;
		double SalInss = (Desc + sal);
		System.out.printf("%f \n %f", SalInss, Desc);
		
		if (SalInss >= 1800 && sal <= 2399) {
			double valorDescIr = (SalInss * 7.5) / 100;
			double SalLiq = (valorDescIr + SalInss);
			
			System.out.printf("O valor do salário inicial é: %.2f \n O valor do desconto do Inss é: %.2f \n O valor do Desconto IR é: %.2f \n O valor do Salário líquido é: %.2f ", sal, Desc, valorDescIr, SalLiq );
		} 
		
	}

}
