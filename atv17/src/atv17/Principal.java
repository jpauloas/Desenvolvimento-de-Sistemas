package atv17;

public class Principal { 
	public static void main(String[] args) {
		Sistema sis = new Sistema(); // Instancia��o da classe sistema
		sis.setNome("Maria"); //Preenchimento do nome
		new Thread(sis).start(); 
		
		Sistema sis2 = new Sistema(); // Instancia��o da classe sistema
		sis2.setNome("Jo�o");//Preenchimento do nome
		new Thread(sis2).start();
		
		Sistema sis3 = new Sistema();  // Instancia��o da classe sistema
		sis3.setNome("Pedro"); //Preenchimento do nome
		new Thread(sis3).start();
		
		Sistema sis4 = new Sistema(); // Instancia��o da classe sistema
		sis4.setNome("Julia"); //Preenchimento do nome
		new Thread(sis4).start();
	}
}
