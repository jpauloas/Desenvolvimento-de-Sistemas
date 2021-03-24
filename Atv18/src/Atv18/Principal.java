package Atv18;

public class Principal {
	public static void main(String[] args) {

	// Java Básico
		
		
	// 1. Desenvolva um programa que exiba as seguintes mensagens:
	//    ▪ Aplicando Orientação a objetos no Java
	//    ▪ Meu nome é
		 
		System.out.println("Aplicando Orientação a objetos no Java");  // Exibição de texto
		System.out.println("Meu nome é João Paulo"); // Exibição de texto

	// 2. Desenvolva um programa que imprima, no console, todos os números de 150 a 250.

		    int i = 150; // variavel contadora
			while (i<250) {  // Estrutura de repetição da operação
				System.out.println("Numero: " + i); // Exibição dos valores
				i++; // Progressão de i
			}
	

	// 3. Desenvolva um programa que imprima, no console, a soma de 1 até 1000 (inclusive).
				
			int s = 1; // Variavel contadora
			int soma = 0; // Variavel que armazena a soma
			while (i<1000) {
				soma = soma + s; // Adição dos valores de s na soma
				s++;	// Progressão de s
			}
			System.out.println("Soma de 1 a 1000: " + soma); // Exibição dos valores

	// 4. Desenvolva um programa que imprima, no console, todos os múltiplos de 3, entre 1 e 100 (inclusive).
			
			float q4 = 1; // Variavel contadora
			while (q4 < 100) { 					// Repetição da operação
				if (q4 % 3 == 0 ) { 			// Condicional, se a divisão por 3 der restp 0, imprime
					System.out.println("Numero multiplo de 03: " + q4);  	// Exibição dos valores

					q4++; //adiciona mais um a contadora e passa adiante 
				}
				else { 							// Se não, adiciona mais um a contadora e passa adiante
					q4++; //adiciona mais um a contadora e passa adiante 
				}
			}

	// 5. Desenvolva um programa que imprima, no console, todos os núme�ros entre 1 e 100 (inclusive), dizendo se ele é ou não múltiplo de 3. (Dica: use o operador de resto: %)
			
			float q5 = 1; // Variavel contadora
			while (q5 < 100) { 					// Repetição da operação
				if (q5 % 3 == 0 ) { 			// Condicional, se a divisão por 3 der restp 0, imprime
					System.out.println("Numero: " + q4 + " é multiplo de 3");  	// Exibição dos valores
					q5++; //adiciona mais um a contadora e passa adiante 
				}
				else { 							// Se não, imprime uma mensagem negando
					System.out.println("Numero: " + q4 + " não é multiplo de 3"); // Exibição dos valores
					q4++; //adiciona mais um a contadora e passa adiante
				}
			}
	// 6. Desenvolva um programa que imprima, no console, todos os múl�tiplos de 3 e de 5, entre 1 e 100 (inclusive)
			
			float q6 = 1; //Variavel contadora
			while (q6 < 100) { 					//Repetição da operação
				if (q6 % 3 == 0 || q6 % 5 == 0 ) { 			// Condicional, se a divisão por 3 ou por 5 der restp 0, imprime uma mensagem de confirmação
					System.out.println("Numero: " + q4 + " é multiplo de 3");  	// Exibição dos valores
					q5++; //adiciona mais um a contadora e passa adiante 
				}
				else { 							// Se não, apenas acrescenta mais um a contadora
					q4++; //adiciona mais um a contadora e passa adiante
				}
			}
	}
	

}
