package aula03;

public class Exercicio16 {
	public static void main(String[] args) {
		String palavra = "Transpobrrasil";
		int count = 0;
		while(count < palavra.length()) {
			int col = 0;
			while(col++ <= count) {
				System.out.printf("%s ", palavra);
			}
		System.out.println("");
		count ++;
		}
		
	}

}
