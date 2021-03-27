package Atv011;

import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		Carro carro01;
		carro01 = new Carro();
		
		Scanner scan = new Scanner(System.in); // Objeto que ira ler a informação inserida pelo usuario

		System.out.println("Digite o id do carro: ");
		int idCarro = scan.nextInt();	// lê a informação inserida e a armazena
		System.out.println("Digite o nome do carro: ");
		String nome = scan.nextLine();
		System.out.println("Digite o modelo do carro: ");
		String modelo = scan.nextLine();
		System.out.println("Digite a marca do carro: ");
		String marca = scan.nextLine();
		System.out.println("Digite a cor do carro: ");
		String cor = scan.nextLine();
		System.out.println("Digite o ano do carro: ");
		String ano = scan.nextLine();
		
		//Envio das informações para a classe
		carro01.setidCarro(idCarro);
		carro01.setnome(nome);
		carro01.setmodelo(modelo);
		carro01.setmarca(marca);
		carro01.setcor(cor);
		carro01.setano(ano);
		
		// Visualização das informações armazenagem
		System.out.println("Dados do carro: ");
		System.out.println("IdCarro: " + carro01.getidCarro());
		System.out.println("Nome: " + carro01.getnome());
		System.out.println("Modelo: " + carro01.getmodelo());
		System.out.println("Marca: " + carro01.getmarca());
		System.out.println("Cor: " + carro01.getcor());
		System.out.println("Ano: " + carro01.getano());
		
	}
}