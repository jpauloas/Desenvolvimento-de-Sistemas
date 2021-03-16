package Classes;

public class Fabrica {
	
	public static void main(String[] args) {
		Carro carro01; 
		carro01 = new Carro(); // instanciando classe Carro
		
		carro01.setcor("Azul"); // inserindo valor
		carro01.setano("2011"); // inserindo valor
				
		// Leitura de dados
		
		System.out.println("Dados do carro: "); // titulo
		
		System.out.println("Numero de identificação: " + carro01.getidCarro()); // preenchimento de valor
		System.out.println("Nome: " + carro01.getnome()); // preenchimento de valor NOME
		System.out.println("Modelo: " + carro01.getmodelo()); // preenchimento de valor MODELO
		System.out.println("Marca: " + carro01.getmarca()); // preenchimento de valor MARCA
		System.out.println("Cor: " + carro01.getcor()); // preenchimento de valor COR
		System.out.println("Ano: " + carro01.getano()); // preenchimento de valor ANO
	}
}
