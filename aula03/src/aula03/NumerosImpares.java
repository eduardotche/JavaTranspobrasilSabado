package aula03;

import java.util.Scanner;

public class NumerosImpares {
	
	static public void main(String[] args) {
		int numero = 1;
		int par = numero ++;
		int impar = (numero % 2);
				
		while (numero <=100) {
			System.out.println(impar);
			numero ++;
		}
		
	}

}
