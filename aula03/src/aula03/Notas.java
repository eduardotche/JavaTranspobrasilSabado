package aula03;

import java.util.Scanner;

public class Notas {
	
	static public void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a nota: ");
		double nota = Double.parseDouble(teclado.nextLine());
		//double media = 
			while(nota <=20) {
				System.out.println("Informe a nota: ");
				nota ++;
			}
		
		teclado.close();	
	}

}
