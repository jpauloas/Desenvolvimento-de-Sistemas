package atv;
import java.util.LinkedList;

public class principal {
	
	public static void main (String[] args) {
		LinkedList<String>carros = new LinkedList<String>();
		
		// Inserindo valores
		carros.add("Volkwagem");
		carros.add("Fiat");
		carros.add("Ford");
		carros.addFirst("Ferrari");
		
		System.out.println(carros); // Imprimindo carros
		
		carros.addFirst("Toyota"); // Inserindo um novo valor na primeira posição
		
		carros.addLast("Honda"); // Inserindo um novo valor na ultima posição
		
		carros.removeFirst(); // Removendo o primeiro registro da linkedlist
		
		carros.removeLast(); // Removendo o ultimo registro da linkedlist
		
		System.out.println(carros.getFirst()); //Imprimindo o primeiro valor
		
		System.out.println(carros.getLast()); //Imprimindo o ultimo valor

	}
}
