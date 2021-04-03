package SIM02;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	
	/* Menu principal  */
	int selecao = 1; 
	
	do {
		System.out.println("___________________________________________________");
		System.out.println(" ");
		System.out.println("       SISTEMA DE CADASTRO DE PROJETOS ");
		System.out.println("___________________________________________________");
		System.out.println("Selecione a opção desejada:  ");
		System.out.println("1 - Projetos");
		System.out.println("2 - Etapas");
		System.out.println("3 - Equipes");
		System.out.println("4 - Funcionários");
		System.out.println("0 - Sair");
		Scanner scan = new Scanner( System.in );  
		
		switch (selecao) { /* Seleção tela de projetos */
			
		case 1: 
				System.out.println("___________________________________________________");
				System.out.println(" ");
				System.out.println("                    PROJETOS ");
				System.out.println("___________________________________________________");
				System.out.println("Selecione a opção desejada:  ");
				System.out.println("1 - Cadastrar novo projeto");
				System.out.println("2 - Ver projetos cadastrados");
				System.out.println("0 - Retornar");
				System.out.println("Entre com o valor desejado:");
				int submenu = scan.nextInt();
				
				switch (submenu) {
				case 1: 
					
					System.out.println("___________________________________________________");
					System.out.println(" ");
					System.out.println("               Cadastro de projetos ");
					System.out.println("___________________________________________________");
					System.out.println("Selecione a opção desejada:  ");
					System.out.println("Numero de identificação: " + carro01.getidCarro());
					System.out.println("2 - Ver projetos cadastrados");
					System.out.println("0 - Retornar");
					System.out.println("Entre com o valor desejado:");
					break;
				case 2:
					
					break;
				}

		break;
				
			 
		case 2: 
			System.out.println(); 
				System.out.println("___________________________________________________");
				System.out.println(" ");
				System.out.println("                    ETAPAS ");
				System.out.println("___________________________________________________");
				System.out.println("Selecione a opção desejada:  ");
				System.out.println("1 - Cadastrar nova etapa");
				System.out.println("2 - Ver etapas cadastrados"); 
				System.out.println("0 - Retornar");
				System.out.println("Entre com o valor desejado:");
				int submenu2 = scan.nextInt(); 
			
		break;
				
			/*  Tela de Equipe */
		case 3: 
				System.out.println("___________________________________________________");
				System.out.println(" ");
				System.out.println("                    EQUIPE ");
				System.out.println("___________________________________________________");
				System.out.println("Selecione a opção desejada:  ");
				System.out.println("1 - Cadastrar nova equipe");
				System.out.println("2 - Ver equipes cadastradas");
				System.out.println("0 - Retornar");
				System.out.println("Entre com o valor desejado:");
				int submenu3 = scan.nextInt(); 
			
		break;
		
		case 4: 
				System.out.println ("___________________________________________________");
				System.out.println(" ");
				System.out.println("                    FUNCIONARIOS ");
				System.out.println("___________________________________________________");
				System.out.println("Selecione a opção desejada:  ");
				System.out.println("1 - Cadastrar novo funcionario");
				System.out.println("2 - Ver funcionarios cadastrados");
				System.out.println("0 - Retornar");
				System.out.println("Entre com o valor desejado:");
				int submenu4 = scan.nextInt(); 
		break;
		
		case 0: 
			
		break;
			


		} 

	}
	
}
	