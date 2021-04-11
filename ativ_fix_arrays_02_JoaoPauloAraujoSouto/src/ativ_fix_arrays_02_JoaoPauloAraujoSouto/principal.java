package ativ_fix_arrays_02_JoaoPauloAraujoSouto;
import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		double[] elemento = new double[10]; // Vetor com os 10 elementos inteiros
		 
		 // Lendo os 10 valores 
		
		for(int i = 0; i < elemento.length; i++) {
				System.out.println("Informe o " + i + "° elemento: ");
				elemento[i] = scan.nextInt();
		}
		
		for(int i = 0; i < elemento.length; i++) { //Relações das divisões
			if (elemento[i] % 2 == 0) {
				System.out.println(" O valor  " + elemento[i] + " é um numero par!");
			}
			
			else { System.out.println(" O valor  " + elemento[i] + " é um numero impar!"); }
			
			if (elemento[i] % 3 == 0) {
				System.out.println(" O valor  " + elemento[i] + " é um numero multiplo de 3!");
			}
			
			if (elemento[i] % 5 == 0) {
				System.out.println(" O valor  " + elemento[i] + " é um numero multiplo de 5!");
			}
			
			if (elemento[i] % 5 == 0) {
				System.out.println(" O valor  " + elemento[i] + " é um numero multiplo de 7!");
			}
			
		}
		
	}

}
