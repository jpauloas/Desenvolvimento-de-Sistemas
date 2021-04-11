package ativ_fix_arrays_01_JoaoPauloAraujoSouto;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double[] temperatura = new double[31];
		
		Scanner scan = new Scanner (System.in);
		double soma = 0;
		
		System.out.println("Informe o numero de dias do m�s: ");
		System.out.println("M�ximo de 31 dias! ");
		int max = scan.nextInt(); // inser��o de valor
		
		if (max < 0 || max>31) { // validando valor
			do {
				System.out.println("Quantidade inv�lida, digite novamente: ");
				max = scan.nextInt();
			} while (max < 0 || max>31);
		}
		
		
		for(int i = 1; i <= max; i++) { // inser��o de dados no array
			System.out.println("Informe a temperatura do " + i + "� dia: ");
			temperatura[i] = scan.nextInt();
			soma = soma + temperatura[i];
		}
		
		double media = soma / max; // Calculo da m�dia de temperatura do array
		
		System.out.println("A m�dia da temperatura do m�s � igual a: " + media);
		
		
	}

}
