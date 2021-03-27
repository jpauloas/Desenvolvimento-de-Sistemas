package ativ_fix_heranca_02_joaopauloaraujosouto;

import java.util.Scanner;
import java.util.ArrayList;

public class Fabrica {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		int voltar = 0;
		
		while(voltar == 1) {
			System.out.println("Qual veículo você deseja registrar: \n");  //Quadro de texto
			System.out.println("Digite 1 -  para carro \n");
			System.out.println("Digite 2 -  para moto \n\n");
			int opcao = scan.nextInt();
			
			switch(opcao) { // escolha
			
			case 1: // Preenchimento das informações de cadastro de uma nova moto
				Moto moto = new Moto();
				System.out.println("ID: ");
				int idveiculo = scan.nextInt();
				moto.setidveiculo(idveiculo);
				
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				moto.setnome(nome);
				
				System.out.println("Modelo: ");
				String modelo = scan.nextLine();
				moto.setmodelo(modelo);
				
				System.out.println("Marca: ");
				String marca = scan.nextLine();
				moto.setmarca(marca);
				
				System.out.println("Ano: ");
				String ano = scan.nextLine();
				moto.setano(ano);
				
				System.out.println("Cor: ");
				String cor = scan.nextLine();
				moto.setcor(cor);
				
				veiculos.add(moto);
				break;
				
			case 2: // Preenchimento das informações de cadastro de um novo carro
				Carro carro = new Carro();
				System.out.println("ID: ");
				idveiculo = scan.nextInt();
				carro.setidveiculo(idveiculo);
				
				System.out.println("Nome: ");
				nome = scan.nextLine();
				carro.setnome(nome);
				
				System.out.println("Modelo: ");
				modelo = scan.nextLine();
				carro.setmodelo(modelo);
				
				System.out.println("Marca: ");
				marca = scan.nextLine();
				carro.setmarca(marca);
				
				System.out.println("Ano: ");
				ano = scan.nextLine();
				carro.setano(ano);
				
				System.out.println("Cor: ");
				cor = scan.nextLine();
				carro.setcor(cor);
				
				veiculos.add(carro);
				break;
			}
			
			System.out.println("Deseja registrar outro veículo? \n"); // Quadro de texto
			System.out.println("Digite 1 -  para sim \n");
			System.out.println("Digite 2 -  para não \n\n");
			voltar = scan.nextInt();
		}
	}

}