package ativ_fix_hashmap_02_JoaoPauloAraujoSouto;

import java.util.HashMap;

public class principal {
	public static void main (String[] args) {
		HashMap<Integer, String> nomes = new HashMap <Integer, String>();
		
		// Inserindo registros
		nomes.put(1, "Alice"); 
		nomes.put(2, "Felipe");
		nomes.put(3, "Lana");
		
		
		System.out.print(nomes.get(2)); // imprimindo valor onde a chave é 2
		
		nomes.remove(3); //Removendo um registro
		
		nomes.clear(); // Limpando todos os registros
		
		// Inserindo novos registros
		nomes.put(1, "Alice Souza");  
		nomes.put(2, "Felipe dos Santos");
		nomes.put(3, "Lana del Rey");
		
		System.out.print(nomes.size()); // Imprimindo o tamanho o HashMap
		
		// Imprimindo valores das chaves
		for (int i : nomes.keySet()) {
			 System.out.println("Chave: " + i);
		}
		// Imprimindo valor dos nomes
		for (String i : nomes.values()) {
			 System.out.println("Nomes: " + i);
		}
		// Imprimindo ambos
		for (int i : nomes.keySet()) {
			 System.out.println("Nomes: " + nomes.get(i) + "; Chave: " + i);
		}
		
	}

}
