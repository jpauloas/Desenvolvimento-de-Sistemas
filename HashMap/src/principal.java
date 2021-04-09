import java.util.HashMap;

public class principal {
	
	public static void main (String[] args) {
		HashMap<String, Integer>  pessoas = new HashMap<String,Integer>();
		
		pessoas.put("Alice", 4); 
		pessoas.put("Felipe", 8);
		pessoas.put("Lana", 16);
	
	
		for (String i : pessoas.keySet()) {
			System.out.println("Chave: " + i + "; Valor: " + pessoas.get(i));
		}
  
	}

}
