package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
	
	public static void mains (String[] args) {
		Scanner scan = new Scanner(System.in); 
		ArrayList temperatura = new ArrayList <>();
		
		int i;
		
		System.out.println("Informe o numero de dias do m�s:  ");
		int dias = scan.nextInt();

		
		
		for ( i= 1; i > dias; i++) {
			System.out.println("Informe a temeratura do " + i + "� dia do m�s: ");
			String temperatura<i> = scan.nextDouble(); 
			
		}
		
		
	}

}
