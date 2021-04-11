package ativ_fix_arrays_03_JoaoPauloAraujoSouto;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		/* 	Uma empresa esta necessitando de um sistema para melhorar gestão de seus clientes e você foi
			contratado para desenvolver uma parte do programa. Crie um programa em Java, que faça o
			cadastro de clientes de três tipos(classes): cliente, cliente Especial e Cliente devedor, onde possa
			ser cadastrados os dados como nome, cpf(cnpj), endereço, telefone , e-mail e faça validação do
			limite, conforme o tipo de cliente e possa tirar uma lista de clientes */
		
		Scanner scan = new Scanner(System.in);
		
		Cliente[] cliente = new Cliente[150]; // Array para condição de cliente comum
		ClienteDevedor[] clienteDevedor = new ClienteDevedor[10];// Array para condição de cliente devedor
		ClienteEspecial[] clienteEspecial = new ClienteEspecial[10]; // Array para condição de cliente especial
		int opcao = 0;
		
		
		while (opcao != 5) {
			System.out.println("__________________________________________________");
			System.out.println(" ");
			System.out.println("        Programa de cadastro de Clientes          ");
			System.out.println("__________________________________________________");
			System.out.println(" ");
			System.out.println("	1 - Cadastrar Cliente");
			System.out.println("	2 - Cadastrar Cliente Devedor");
			System.out.println("	3 - Cadastrar Cliente Especial");
			System.out.println("	4 - Banco de registro");
			System.out.println("	5 - SAIR");
			System.out.println("__________________________________________________");
			System.out.println(" ");
			System.out.println("Informe a opção de cadastro: ");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: // Escolha de cadastro do cliente commum
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("            CADASTRO DE CLIENTE                    ");
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("Informe a quantidade de cadastros que deseja fazer: ");
				int num = scan.nextInt();
				
				for (int i = 1; i < num; i++) {
					cliente[i]  = new Cliente();
					System.out.println( i + "º Cadastro");
					System.out.println("");
					System.out.println("Informe corretamente as informações que se pede: ");
					System.out.println("");
					System.out.println("");
					
					System.out.println("Nome: ");
					String nome = scan.next();
					cliente[i].setNome(nome);
					
					System.out.println("CPF: ");
					String cpf= scan.next();
					cliente[i].setCpf(cpf);
					
					System.out.println("Telefone: ");
					int telefone = scan.nextInt();
					cliente[i].setTelefone(telefone);
					
					System.out.println("E-mail: ");
					String email = scan.next();
					cliente[i].setEmail(email);
					
					System.out.println("Rua: ");
					String rua = scan.next();
					cliente[i].setRua(rua);
					
					System.out.println("Número da casa: ");
					String numeroCasa = scan.next();
					cliente[i].setNumeroCasa(numeroCasa);
					
					System.out.println("Bairro: ");
					String bairro = scan.next();
					cliente[i].setBairro(bairro);
					
					System.out.println("Cidade: ");
					String cidade = scan.next();
					cliente[i].setCidade(cidade);
					
					System.out.println("__________________________________________________");
					System.out.println("");
					System.out.println("         CADASTRO REALIZADO COM SUCESSO           ");
					System.out.println("__________________________________________________");
					System.out.println("");
				}
				
				break; // Quebra do cadastro de cliente comum
				
			case 2: // Escolha de cadastro do cliente devedor
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("          CADASTRO DE CLIENTE DEVEDOR             ");
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("Informe a quantidade de cadastros que deseja fazer: ");
				num = scan.nextInt();
				
				for (int i = 1; i < num; i++) {
					clienteDevedor[i]  = new ClienteDevedor();			

					System.out.println("Nome: ");
					String nome = scan.next();
					clienteDevedor[i].setNome(nome);
					
					System.out.println("CPF: ");
					String cpf= scan.next();
					clienteDevedor[i].setCpf(cpf);
					
					System.out.println("Telefone: ");
					int telefone = scan.nextInt();
					clienteDevedor[i].setTelefone(telefone);
					
					System.out.println("Email: ");
					String email = scan.next();
					clienteDevedor[i].setEmail(email);
					
					System.out.println("Rua: ");
					String rua = scan.next();
					clienteDevedor[i].setRua(rua);
					
					System.out.println("Número da casa: ");
					String numeroCasa = scan.next();
					clienteDevedor[i].setNumeroCasa(numeroCasa);
					
					System.out.println("Bairro: ");
					String bairro = scan.next();
					clienteDevedor[i].setBairro(bairro);
					
					System.out.println("Cidade: ");
					String cidade = scan.next();
					clienteDevedor[i].setCidade(cidade);
					
					System.out.println("__________________________________________________");
					System.out.println("");
					System.out.println("         CADASTRO REALIZADO COM SUCESSO           ");
					System.out.println("__________________________________________________");
					System.out.println("");
				}
				
				break; // Quebra do cadastro de cliente devedor
				
			case 3: // Escolha de cadastro do cliente especial
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("          CADASTRO DE CLIENTE ESPECIAL             ");
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("Informe a quantidade de cadastros que deseja fazer: ");
				num = scan.nextInt();
				
				
				for (int i = 1; i < num; i++) {
					clienteEspecial[i]  = new ClienteEspecial();

					System.out.println("Nome: ");
					String nome = scan.next();
					clienteEspecial[i].setNome(nome);
					
					System.out.println("CPF: ");
					String cpf= scan.next();
					clienteEspecial[i].setCpf(cpf);
					
					System.out.println("Telefone: ");
					int telefone = scan.nextInt();
					clienteEspecial[i].setTelefone(telefone);
					
					System.out.println("E-mail: ");
					String email = scan.next();
					clienteEspecial[i].setEmail(email);
					
					System.out.println("Rua: ");
					String rua = scan.next();
					clienteEspecial[i].setRua(rua);
					
					System.out.println("Número da casa: ");
					String numeroCasa = scan.next();
					clienteEspecial[i].setNumeroCasa(numeroCasa);
					
					System.out.println("Bairro: ");
					String bairro = scan.next();
					clienteEspecial[i].setBairro(bairro);
					
					System.out.println("Cidade: ");
					String cidade = scan.next();
					clienteEspecial[i].setCidade(cidade);
					
					System.out.println("__________________________________________________");
					System.out.println("");
					System.out.println("         CADASTRO REALIZADO COM SUCESSO           ");
					System.out.println("__________________________________________________");
					System.out.println("");
					
				}		
				
				break; // Quebra do cadastro de cliente especial
				
			case 4: 
				// Para exibir a lista de clientes
				System.out.println("__________________________________________________");
				System.out.println("");
				System.out.println("               BANCO DE REGISTROS           ");
				System.out.println("__________________________________________________");
				System.out.println("");
				
				for(int i = 0; i < cliente.length; i++) {
					System.out.println("__________________________________________________");
					System.out.println("");
					System.out.println("Dados do cliente " + i);
					System.out.println("Nome: " + cliente[i].getNome());
					System.out.println("Cpf: " + cliente[i].getCpf());
					System.out.println("Telefone: " + cliente[i].getTelefone());
					System.out.println("E-mail: " + cliente[i].getEmail());
					System.out.println("Rua: " + cliente[i].getRua());
					System.out.println("NumeroCasa: " + cliente[i].getNumeroCasa());
					System.out.println("Bairro: " + cliente[i].getBairro());
					System.out.println("Cidade: " + cliente[i].getCidade());
				}
				break;		
			}
			
		}

	}

}