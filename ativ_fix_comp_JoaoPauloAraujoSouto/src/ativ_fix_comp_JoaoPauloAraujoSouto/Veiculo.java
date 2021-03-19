package ativ_fix_comp_JoaoPauloAraujoSouto;

import java.util.ArrayList;

public class Veiculo {
	
	private String NOME; // atributo para nome 
	private String MODELO; // atributo para modelo
	private String MARCA; // atributo para marca
	private String ANO; // atributo para ano 
	private String COR; // atributo para cor do carro
	
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