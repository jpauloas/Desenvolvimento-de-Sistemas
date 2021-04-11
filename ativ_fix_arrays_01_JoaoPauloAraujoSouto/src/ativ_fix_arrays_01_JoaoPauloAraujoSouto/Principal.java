package ativ_fix_arrays_01_JoaoPauloAraujoSouto;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double[] temperatura = new double[31];
		
		Scanner scan = new Scanner (System.in);
		double soma = 0;
		
		System.out.println("Informe o numero de dias do mês: ");
		System.out.println("Máximo de 31 dias! ");
		int max = scan.nextInt(); // inserção de valor
		
		if (max < 0 || max>31) { // validando valor
			do {
				System.out.println("Quantidade inválida, digite novamente: ");
				max = scan.nextInt();
			} while (max < 0 || max>31);
		}
		
		
		for(int i = 1; i <= max; i++) { // inserção de dados no array
			System.out.println("Informe a temperatura do " + i + "° dia: ");
			temperatura[i] = scan.nextInt();
			soma = soma + temperatura[i];
		}
		
		double media = soma / max; // Calculo da média de temperatura do array
		
		System.out.println("A média da temperatura do mês é igual a: " + media);
		
		
	}

}
