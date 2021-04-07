import java.util.Random; 

public class Principal {
	
	public static void main (String[] args) {
		// Gerar numeros aleatorios
		int [] notas = new int [5];
		Random random = new Random();
		
		
		for (int i = 0; i<notas.length; i++) {
			notas[i] = random.nextInt(5);
		}
		for(int i = 0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println("USANDO FOR EACH");
		for (int nota : notas) {
			System.out.println(nota);
		}
	}

	
	
}
