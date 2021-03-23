package atv17;

public class Sistema implements Runnable {
	private String Nome;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void run() {
		int i = 0;
		while (i<10) {
			System.out.println("Sistema executado por " + Nome +"!");
			i++;
		}
	}
}
