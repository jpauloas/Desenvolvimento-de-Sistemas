package SIM02;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		int selecao = 1;

		do {
			System.out.println("___________________________________________________");
			System.out.println(" ");
			System.out.println("       SISTEMA DE CADASTRO DE PROJETOS ");
			System.out.println("___________________________________________________");
			System.out.println("Selecione a opção desejada:  ");
			System.out.println("1 - Cadastrar Projetos");
			System.out.println("2 - Cadastrar Etapas");
			System.out.println("3 - Cadastrar Equipes");
			System.out.println("4 - Cadastrar Funcionários");
			System.out.println("5 - Cadastrar Cliente");
			System.out.println("6 - Consultar registros");
			System.out.println("0 - Sair");
			selecao = scan.nextInt();

			switch (selecao) { 
			/* Seleção tela de projetos */
				case 1: 
					System.out.println("___________________________________________________");
					System.out.println(" ");
					System.out.println("                    PROJETOS ");
					System.out.println("___________________________________________________");
					System.out.println("Selecione a opção desejada:  ");
					System.out.println("1 - Cadastrar novo projeto de abastecimento de agua");
					System.out.println("2 - Cadastrar novo projeto de esgotamento sanitário");
					System.out.println("3 - Cadastrar novo projeto de drenagem urbana");
					System.out.println("4 - Ver projetos cadastrados");
					System.out.println("0 - Retornar");
					System.out.println("Entre com o valor desejado:");
					int submenu = scan.nextInt();
					switch (submenu) {
					
						case 1: 
							int resposta = 1;
							while (resposta == 1)
							{
								Projeto projeto01 = new ProjetoAbastecimento(); 
								System.out.println("___________________________________________________");
								System.out.println(" ");
								System.out.println("     Cadastro de projeto de abastecimento de  ");
								System.out.println("___________________________________________________");
								System.out.println("Preencha corretamente cada campo:  ");					
							
								System.out.print("Nome do projeto: "); /*Preenchimento de nome do cadastro */
								String Nome = scan.next();
								projeto01.setNome(Nome);
						
								System.out.print("Numero de identificação do projeto: "); /*Preenchimento de Id do cadastro */
								int Id = scan.nextInt();
								projeto01.setId(Id);
						
								System.out.println("___________________________________________________");
								System.out.println(" ");	
								System.out.print("Nome do Cliente: "); /*Preenchimento de Nome do client do cadastro */
								String NomeCliente  = scan.next();
								projeto01.setNomeCliente(NomeCliente);
					
								System.out.print("Id do Cliente: "); /*Preenchimento de Id do cliente do cadastro */
								int IdCliente  = scan.nextInt();
								projeto01.setIdCliente(IdCliente);
						
								System.out.println("___________________________________________________");
								System.out.println(" ");
							
								System.out.print("Descrição breve do projeto: "); /*Preenchimento de Descrição do cadastro */
								String Descricao  = scan.next();
								projeto01.setDescricao(Descricao);
								
								System.out.print("Nivel de complexidade: "); /*Preenchimento de Descrição do cadastro */
								System.out.println("1 - Grande escala (bairro, regional");
								System.out.println("2 - Média escala (condominio, rua");
								System.out.println("3 - Pequena Escala (Casa");
								int Complexidade  = scan.nextInt();
								if (Complexidade == 1) {
									projeto01.setComplexidade("Grande escala");
								}
								if (Complexidade == 2 ) {
									projeto01.setComplexidade("Média escala");
								}
								if (Complexidade == 3 ) {
									projeto01.setComplexidade("Pequena escala");
								}
						
								System.out.print("Data de inicialização do projeto: "); /*Preenchimento de data de inicio do cadastro */
								String DataInicio  = scan.next();
								projeto01.setDataInicio(DataInicio);
						
								System.out.print("Data de finalização do projeto: "); /*Preenchimento de data de entrega do cadastro */
								String DataFinalizacao  = scan.next();
								projeto01.setDataFinalizacao(DataFinalizacao);
								System.out.println("___________________________________________________");
								System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
								System.out.println("Deseja cadastrar um novo projeto?: "); /*Encerra ou continua o looping */
								System.out.println("1 - Sim");
								System.out.println("2 - Não");
								resposta  = scan.nextInt();
							}
						break; /* Quebra a tela de cadastro de abastecimento */
						
						case 2:
							resposta = 1;
							while (resposta == 1)
							{
								Projeto projeto01 = new ProjetoEsgotamento(); 
								System.out.println("___________________________________________________");
								System.out.println(" ");
								System.out.println("     Cadastro de projeto de abastecimento de  ");
								System.out.println("___________________________________________________");
								System.out.println("Preencha corretamente cada campo:  ");					
							
								System.out.println("Nome do projeto: "); /*Preenchimento de nome do cadastro */
								String Nome = scan.next();
								projeto01.setNome(Nome);
						
								System.out.println("Numero de identificação do projeto: "); /*Preenchimento de Id do cadastro */
								int Id = scan.nextInt();
								projeto01.setId(Id);
						
								System.out.println("___________________________________________________");
								System.out.println(" ");	
								System.out.println("Nome do Cliente: "); /*Preenchimento de Nome do client do cadastro */
								String NomeCliente  = scan.next();
								projeto01.setNomeCliente(NomeCliente);
					
								System.out.println("Id do Cliente: "); /*Preenchimento de Id do cliente do cadastro */
								int IdCliente  = scan.nextInt();
								projeto01.setIdCliente(IdCliente);
						
								System.out.println("___________________________________________________");
								System.out.println(" ");
							
								System.out.println("Descrição breve do projeto: "); /*Preenchimento de Descrição do cadastro */
								String Descricao  = scan.next();
								projeto01.setDescricao(Descricao);
								
								System.out.println("Nivel de complexidade: "); /*Preenchimento de Descrição do cadastro */
								System.out.println("1 - Grande escala (bairro, regional");
								System.out.println("2 - Média escala (condominio, rua");
								System.out.println("3 - Pequena Escala (Casa");
								int Complexidade  = scan.nextInt();
								if (Complexidade == 1) {
									projeto01.setComplexidade("Grande escala");
								}
								if (Complexidade == 2 ) {
									projeto01.setComplexidade("Média escala");
								}
								if (Complexidade == 3 ) {
									projeto01.setComplexidade("Pequena escala");
								}
						
								System.out.println("Data de inicialização do projeto: "); /*Preenchimento de data de inicio do cadastro */
								String DataInicio  = scan.next();
								projeto01.setDataInicio(DataInicio);
						
								System.out.println("Data de finalização do projeto: "); /*Preenchimento de data de entrega do cadastro */
								String DataFinalizacao  = scan.next();
								projeto01.setDataFinalizacao(DataFinalizacao);
								System.out.println("___________________________________________________");
								System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
								System.out.println("Deseja cadastrar um novo projeto?: "); /* Encerra ou continua o looping */
								System.out.println("1 - Sim");
								System.out.println("2 - Não");
								resposta  = scan.nextInt();
							}
							break; /* Quebra a tela de cadastro de esgotamento */
							
						case 3:
							resposta = 1;
							while (resposta == 1)
							{
								Projeto projeto01 = new ProjetoDrenagem(); 
								System.out.println("___________________________________________________");
								System.out.println(" ");
								System.out.println("     Cadastro de projeto de abastecimento de  ");
								System.out.println("___________________________________________________");
								System.out.println("Preencha corretamente cada campo:  ");					
							
								System.out.println("Nome do projeto: "); /*Preenchimento de nome do projeto cadastro */
								String Nome = scan.next();
								projeto01.setNome(Nome);
						
								System.out.println("Numero de identificação do projeto: "); /*Preenchimento de Id do cadastro */
								int Id = scan.nextInt();
								projeto01.setId(Id);
						
								System.out.println("___________________________________________________");
								System.out.println(" ");	
								System.out.println("Nome do Cliente: "); /*Preenchimento de Nome do cliente do cadastro */
								String NomeCliente  = scan.next();
								projeto01.setNomeCliente(NomeCliente);
					
								System.out.println("Id do Cliente: "); /*Preenchimento de Id do cliente do cadastro */
								int IdCliente  = scan.nextInt();
								projeto01.setIdCliente(IdCliente);
						
								System.out.println("___________________________________________________");
								System.out.println(" ");
							
								System.out.println("Descrição breve do projeto: "); /*Preenchimento de Descrição do cadastro */
								String Descricao  = scan.next();
								projeto01.setDescricao(Descricao);
								
								System.out.println("Nivel de complexidade: "); /*Preenchimento do nivel de complexidade do projeto */
								System.out.println("1 - Grande escala (bairro, regional");
								System.out.println("2 - Média escala (condominio, rua");
								System.out.println("3 - Pequena Escala (Casa");
								int Complexidade  = scan.nextInt();
								if (Complexidade == 1) {
									projeto01.setComplexidade("Grande escala");
								}
								if (Complexidade == 2 ) {
									projeto01.setComplexidade("Média escala");
								}
								if (Complexidade == 3 ) {
									projeto01.setComplexidade("Pequena escala");
								}
						
								System.out.println("Data de inicialização do projeto: "); /*Preenchimento de data de inicio */
								String DataInicio  = scan.next();
								projeto01.setDataInicio(DataInicio);
						
								System.out.println("Data de finalização do projeto: "); /*Preenchimento de data de entrega*/
								String DataFinalizacao  = scan.next();
								projeto01.setDataFinalizacao(DataFinalizacao);
								System.out.println("___________________________________________________");
								System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
								System.out.println("Deseja cadastrar um novo projeto?: "); /*Encerra ou continua o looping */
								System.out.println("1 - Sim");
								System.out.println("2 - Não");
								resposta  = scan.nextInt();
								
							}
							break;  /* Quebra a tela de cadastro de drenagem */
								
					
					} /*Fecha o switch de projetos */
					
				break; /* quebra a tela de projeto */
				
				case 2: /* Tela de cadastro de etapas */
					int resposta = 1;
					while (resposta == 1)
					{
						Etapas etapa01 = new Etapas(); 
						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println("     Cadastro de Etapas  ");
						System.out.println("___________________________________________________");
						System.out.println("Preencha corretamente cada campo:  ");					
					
						System.out.println("Numero identificador da Etapa: "); /*Preenchimento do campo do numero identificador da equipe */
						int IdEtapa = scan.nextInt();
						etapa01.setIdEtapa(IdEtapa);
						
						System.out.println("Nome da Equipe responsavel: "); /*Preenchimento do campo do nome da equipe  */
						String Equipe = scan.next();
						etapa01.setEquipe(Equipe);
						
						System.out.println("Numero identificador da Equipe responsavel: "); /*Preenchimento identificador da Equipe */
						int IdEquipe = scan.nextInt();
						etapa01.setIdEquipe(IdEquipe);
						
						System.out.println("Descrição da Etapa: "); /*Preenchimento do campo de descrição */
						String Descricao = scan.next();
						etapa01.setDescricao(Descricao);
						
						System.out.println("Data de inicio da etapa: "); /*Preenchimento do campo de data de inicio da etapa */
						String DataInicio = scan.next();
						etapa01.setDataInicio(DataInicio);
						
						System.out.println("Data prevista de finalização da etapa: "); /*Preenchimento do campo da data final da etapa */
						String DataFinalizacao = scan.next();
						etapa01.setDataFinalizacao(DataFinalizacao);
						
						System.out.println("Entrega final: "); /*Preenchimento do conteudo final da entrega */
						String EntregaFinal = scan.next();
						etapa01.setEntregaFinal(EntregaFinal);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
						System.out.println("Deseja cadastrar um novo projeto?: "); /* Encerra ou continua o looping */
						System.out.println("1 - Sim");
						System.out.println("2 - Não");
						resposta  = scan.nextInt();
					}
					break;
				case 3:
					resposta = 1;
					while (resposta == 1)
					{
								
						Equipe equipe01 = new Equipe(); 
						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println("     		Cadastro de Equipe  ");
						System.out.println("___________________________________________________");
						System.out.println("Preencha corretamente cada campo:  ");					
					
						System.out.println("Numero identificador da Equipe: "); /*Preenchimento do campo do numero identificado  */
						int IdEquipe = scan.nextInt();
						equipe01.setIdEquipe(IdEquipe);
						
						System.out.println("Nome da Equipe: "); /*Preenchimento do campo do nome da equipe */
						String NomeEquipe = scan.next();
						equipe01.setNomeEquipe(NomeEquipe);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						
						System.out.println("Funções da Equipe: "); /*Preenchimento do campo da funcao da equipe*/
						String Funcao = scan.next();
						equipe01.setFuncao(Funcao);
						
						System.out.println("Descreva a atuação da equipe: "); /*Preenchimento do campo de descricao do trabalho da equipe */
						String Descricao = scan.next();
						equipe01.setDescricao(Descricao);
						
						System.out.println("Numero de membros da equipe: "); /*Preenchimento do numero de membros da equipe */
						int NumEquipe = scan.nextInt();
						equipe01.setNumEquipe(NumEquipe);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						
						System.out.println("Engenheiro Chefe: "); /*Preenchimento do nome do engenheiro chefe da equipe */
						String NomeChefe = scan.next();
						equipe01.setNomeChefe(NomeChefe);
						
						System.out.println("Engenheiro principal: "); /*Preenchimento do nome do engenheiro principal  da equipe */
						String NomeEng = scan.next();
						equipe01.setNomeEng(NomeEng);
						
						System.out.println("Engenheiro auxiliar: "); /*Preenchimento do nome do engenheiro auxiliar  da equipe */
						String NomeEngAux = scan.next();
						equipe01.setNomeEng(NomeEngAux);
						
						System.out.println("Arquiteto: "); /*Preenchimento de nome do arquiteto da equipe */
						String NomeArq = scan.next();
						equipe01.setNomeArq(NomeArq);
						
						System.out.println("Estágiario: "); /*Preenchimento de nome do estagiario da equipe */
						String NomeEstagiario = scan.next();
						equipe01.setNomeEstagiario(NomeEstagiario);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
						System.out.println("Deseja cadastrar um novo projeto?: "); /* Encerra ou continua o looping */
						System.out.println("1 - Sim");
						System.out.println("2 - Não");
						resposta = scan.nextInt();
					}
					break;
				case 4:
					resposta  = 1;
					while (resposta  == 1)
					{	
						Funcionario funcionario01 = new Funcionario(); 
						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println("              Cadastro de Funcionários  ");
						System.out.println("___________________________________________________");
						System.out.println("Preencha corretamente cada campo:  ");					
					
						System.out.println("Numero identificador do funcionário: "); /*Preenchimento do numero identificador do funcionario */
						int Id = scan.nextInt();
						funcionario01.setId(Id);
						
						System.out.println("Nome completo: "); /*Preenchimento de nome do novo funcionário */
						String Equipe = scan.next();
						funcionario01.setEquipe(Equipe);
						
						System.out.println("Codigo do CREA do funcionário: "); /*Preenchimento do numeor do CREA */
						int Crea = scan.nextInt();
						funcionario01.setCrea(Crea);
						
						System.out.println("CPF: "); /*Preenchimento do numero do CPF */
						int Cpf = scan.nextInt();
						funcionario01.setCpf(Cpf);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						
						System.out.println("Funções que desempenha na Equipe: "); /*Preenchimento da função do funcionario na equipe */
						String nomedaEquipe = scan.next();
						funcionario01.setEquipe(nomedaEquipe);
						
						System.out.println("Nome da Equipe: "); /*Preenchimento de nome da equipe que o funcionario trabalhara */
						String Funcao = scan.next();
						funcionario01.setFuncao(Funcao);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");			
						
						System.out.println("Formação superior: "); /*Preenchimento da graduação do funcionario */
						String Graduacao = scan.next();
						funcionario01.setGraduacao(Graduacao);
						
						System.out.println("Especialidade: "); /*Preenchimento da especialidade de trabalho do funcionário */
						String Especialidade = scan.next();
						funcionario01.setEspecialidade(Especialidade);

						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
						System.out.println("Deseja cadastrar um novo projeto?: "); /*Encerra ou continua o looping*/
						System.out.println("1 - Sim");
						System.out.println("2 - Não");
						resposta = scan.nextInt();
					}
					break;
					
				case 5:
					resposta = 1;
					while (resposta == 1)
					{
						Cliente Cliente01 = new Cliente(); 
						System.out.println("___________________________________________________");
						System.out.println(" ");
						System.out.println("              Cadastro de Cliente  ");
						System.out.println("___________________________________________________");
						System.out.println("Preencha corretamente cada campo:  ");					
					
						System.out.println("Numero identificador do cliente: "); /*Preenchimento do numero identificador do cliente */
						int Id = scan.nextInt();
						Cliente01.setId(Id);
						
						System.out.println("CNPJ: "); /*Preenchimento do numero do CNPJ da empresa */
						int Cnpj = scan.nextInt();
						Cliente01.setCnpj(Cnpj);
						
						System.out.println("Nome fantasia: "); /*Preenchimento do nome fantasia do cliente */
						String NomeFantasia = scan.next();
						Cliente01.setNomeFantasia(NomeFantasia);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						
						System.out.println("Endereco da empresa: "); /*Preenchimento do endereço da empresa*/
						String Endereco = scan.next();
						Cliente01.setEndereco(Endereco);
						
						System.out.println("Telefone: "); /*Preenchimento do numero de telefone do cliente */
						int Telefone = scan.nextInt();
						Cliente01.setTelefone(Telefone);
						
						System.out.println("Email  da empresa: "); /*Preenchimento do email da empresa cliente */
						String EmailEmpresa = scan.next();
						Cliente01.setEmailEmpresa(EmailEmpresa);
						
						System.out.println("___________________________________________________");
						System.out.println(" ");
						
						System.out.println("Email  do demandante: "); /*Preenchimento do email do funcionario da empresa que solicitou o projeto*/
						String EmailDemandante = scan.next();
						Cliente01.setEmailEmpresa(EmailDemandante);
						
						System.out.println("Nome  do demandante: "); /*Preenchimento do nome do funcionario responsavel pela empresa que solicitou o projeto*/
						String Demandante = scan.next();
						Cliente01.setDemandante(Demandante);
						
						System.out.println(" ");
						System.out.println(" CADASTRO REALIZADO COM SUCESSO ");
						System.out.println("Deseja cadastrar um novo projeto?: "); /* Encerra ou continua o looping*/
						System.out.println("1 - Sim");
						System.out.println("2 - Não");
						resposta = scan.nextInt();
					}	
					
			} /* Fecha o Switch de selecao */
			
		} while (selecao == 0);
		
	} /*Fecha a condição de probrama principal */
		

} /*Fecha a classe */
