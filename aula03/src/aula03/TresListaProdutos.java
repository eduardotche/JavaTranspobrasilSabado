package aula03;

import java.util.Scanner;

public class TresListaProdutos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("( 1 ) - Cadastrar Produto");
		System.out.println("( 2 ) - Listar produto");
		System.out.println("( 3 )- pesquisar produto");
		System.out.println("( 4 )- Remover Produto");
		System.out.println("( 5 ) -Sair");
		System.out.println();
		System.out.println("Informe a op��o desejada: ");
		int opcao = Integer.parseInt(teclado.nextLine());
		
		switch (opcao) {
			case 1:
				System.out.println("Voc� escolheu a op��o: Cadastrar produto");
				break;
			
			case 2:
				System.out.println("Voc� escolheu a op��o: Listar produto");
				break;
				
			case 3:
				System.out.println("Voc� escolheu a op��o: Pesquisar produto");
				break;
				
			case 4:
				System.out.println("Voc� escolheu a op��o: Remover produto");
				break;
				
			case 5:
				System.out.println("Obrigado por usar nossos terminais");
				break;
			
				default:
					System.out.println("Numero Inv�lido");
					break;
				
		}
		
		teclado.close();
		
	}
}


