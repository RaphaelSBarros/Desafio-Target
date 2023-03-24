package resolucao;

import java.util.Scanner;

public class Resolucao {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		     
		while (c < numero) {
			c = a + b;
		    a = b;
		    b = c;
		    }

		if (c == numero) {
			System.out.println(numero + " pertence à sequência de Fibonacci.");
			} else{
				System.out.println(numero + " não pertence à sequência de Fibonacci.");
				}
		 scanner.close();
	}
}
