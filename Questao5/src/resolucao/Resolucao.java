package resolucao;
import java.util.Scanner;

public class Resolucao {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		        
		System.out.print("Digite uma palavra: ");
		String string = scanner.nextLine();
		        
		String stringInvertida = "";
		        
		for (int i = string.length() - 1; i >= 0; i--) {
			stringInvertida += string.charAt(i);
		}
		        
		System.out.println("A string invertida é: " + stringInvertida);
		        
		scanner.close();
	}
}
