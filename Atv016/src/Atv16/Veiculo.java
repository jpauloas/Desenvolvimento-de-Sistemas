package Atv16;

import java.util.ArrayList;

public class Veiculo {
	
	private String nome; // atributo para nome 
	private String modelo; // atributo para modelo
	private String marca; // atributo para marca
	private String ano; // atributo para ano 
	private String cor; // atributo para cor do carro
	
	public class Moto extends Veiculo{ // Criando relacionamento de herança entre Moto e Veiculo
		
	}
	
	public class Carro extends Veiculo{  // Criando relacionamento de herança entre Carro e Veiculo
		
	}
	
	public void venderVeiculo(Veiculo veiculo) {
		ArrayList<Veiculo> listVeiculo = new ArrayList(); // Instanciando uma nova matriz 
		
		listVeiculo.remove(veiculo); // deletando o registro em uma matriz
	}
	
	public void fabricarVeiculo(Veiculo veiculo) { 
		
		ArrayList<Veiculo> listVeiculo = new ArrayList(); // Instanciando uma nova matriz
		
		listVeiculo.add(veiculo); // Adicionando  valores
	}
	
	
}