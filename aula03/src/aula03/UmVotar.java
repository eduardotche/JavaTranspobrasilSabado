package aula03;

import java.util.Scanner;

public class UmVotar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe a idade do usu�rio: ");
		int idade = Integer.parseInt(teclado.nextLine());
		String tipo = idade >=16 ? "Pode" : "N�o pode";
		System.out.printf("Voc� %s votar!", tipo);
		
		teclado.close();
		
	}
		
	}
	


