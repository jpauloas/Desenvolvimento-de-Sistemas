CREATE DATABASE sa_final;

USE sa_final;

CREATE TABLE Funcionario(id INT AUTO_INCREMENT PRIMARY KEY, 
cpf VARCHAR(15), 
nome VARCHAR(60),
dataNascimento VARCHAR(30),
 dataContrato VARCHAR(30),
 genero VARCHAR(10),
 setor VARCHAR(30),
 funcao VARCHAR(30),
 salario DOUBLE,
 unidadeTrabalho VARCHAR(60));
 
 CREATE TABLE cliente(id INT AUTO_INCREMENT PRIMARY KEY, 
 cnpj VARCHAR(30),
 nomeFantasia VARCHAR(45),
 telefone VARCHAR(15),
 endereco VARCHAR(60),
 nomeFuncionario VARCHAR(60),
 emailFuncionario VARCHAR(60),
 emailEmpresa VARCHAR(60));
 
 CREATE TABLE veiculo(id INT AUTO_INCREMENT PRIMARY KEY,
 placa VARCHAR(10),
 fabricaOrigem VARCHAR(60),
 montadora VARCHAR(60),
 paisOrigem VARCHAR(30),
 precoVenda DOUBLE,
 nome VARCHAR(60),
 modelo VARCHAR(60),
 numeroIdentificados INT);
 
 CREATE TABLE vendas(id INT AUTO_INCREMENT PRIMARY KEY,
 cnpjCliente VARCHAR(30),
 modeloVeiculo VARCHAR(60),
 quantidadeComprada INT,
 preco DOUBLE,
 valorTotal DOUBLE,
 formaPagamento VARCHAR(60));
 
 CREATE TABLE modeloVeiculo(id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(60),
 modelo VARCHAR(60),
 porte VARCHAR(30),
 marca VARCHAR(60),
 cor VARCHAR(30),
 tipoCombustivel VARCHAR(60));
 
 CREATE TABLE compraPecas(id INT AUTO_INCREMENT PRIMARY KEY,
 nomeKit VARCHAR(60),
 nomePeca VARCHAR(60),
 quantidadeComprada INT,
 precoUnitario DOUBLE,
 totalCompra DOUBLE,
 nomeVendedor VARCHAR(60),
 cnpjVendedor VARCHAR(30),
 nomeFabricante VARCHAR(60),
 dataCompra VARCHAR(60),
 unidadeEstoque VARCHAR(60));
 
 CREATE TABLE kitPecas(id INT AUTO_INCREMENT PRIMARY KEY,
 nomePeca VARCHAR(60),
 descricaoPeca VARCHAR(60),
 fabricante VARCHAR(60),
 quantidade INT,
 preco DOUBLE);
 
 CREATE TABLE producaoVeiculos(id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(60),
 quantidade INT,
 kitPeca VARCHAR(60),
 dataInicioProducao VARCHAR(60),
 unidadeProducao VARCHAR(60));
 
 
 INSERT INTO funcionario(cpf, nome, dataNascimento, dataContrato, genero, setor, funcao, salario, unidadeTrabalho) 
 VALUES(12345678910, "Bruno Almeida Rocha", "23/11/1998", "01/02/2018", "Masculino", "Rh", "Analista de RH", 3.290, "Belo Horizonte"),
 (23456789101, "Amanda Silva Rocha", "21/04/1996", "01/05/2018", "Feminino", "Engenharia", "Engenheira de Produção", 7900.00, "Belo Horizonte"),
 (34567891012, "Fenando Oliveira Santos", "05/09/1994", "01/02/2015", "Masculino", "Manutenção da fábrica","Técnico de Manutenção", 2000.00, "Belo Horizonte");
 
INSERT INTO cliente(cnpj, nomeFantasia, telefone, endereco, nomeFuncionario, emailFuncionario, emailEmpresa) VALUES(
"11.111.111/0001-11", "NewCarros", "(31)1111-1111", "Rua das Flores, n° 230", "Robson Freitas", "robson@newcarros.com", "newcarros@gmail.com"),
("22.222.222/001-22", "Honda", "(31)2222-2222", "Rua Flor Do Campo, n° 27", "Fernanda Arantes", "fernanda@honda.com", "hondaautomoveis@gmail.com"),
("33.333.333/001-33", "Nissan", "(31)3333-3333", "Rua Frei Jovem, n° 515", "Augusto Souza", "augustosouza@gmail.com", "nissaautomoveis@gmail.com");
 
 INSERT INTO veiculo(placa, fabricaOrigem, montadora, paisOrigem, precoVenda, nome, modelo, numeroIdentificados)VALUES(
 "ABC1D23", "Advanced Progress", "AdvancedProgress", "Brasil", 33000, "Asur", "G327", 500), 
 ("EFG4H56", "Advanced Progress", "AdvancedProgress", "Brasil", 44500, "Venus", "G328", 1200),
 ( "IJK7L89", "Advanced Progress", "AdvancedProgress", "Brasil", 37800, "Satur28", "G329", 1300);
 
INSERT INTO vendas(cnpjCliente, modeloVeiculo, quantidadeComprada, preco, valorTotal, formaPagamento)VALUES
("11.111.111/0001-11", "G327", 230, 33000, 7590000, "Débito"),
("22.222.222/001-22", "G328", 1000, 44500, 44500000, "Débito"),
("33.333.333/001-33", "G329", 650, 37800, 2.570000, "Débito");

INSERT INTO modeloVeiculo(nome, modelo, porte, marca, cor, tipoCombustivel)VALUES(
"Asur","G327", "Grande", "Advanced Progress", "Vermelho", "Gasolina"),
("Venus","G328", "Grande", "Advanced Progress", "Amarelo", "Gasolina"),
("Satur28","G329", "Médio", "Advanced Progress", "Azul", "Gasolina");

INSERT INTO comprapecas(nomeKit, nomePeca, quantidadeComprada, precoUnitario, totalCompra, nomeVendedor, cnpjVendedor, nomeFabricante,
dataCompra, unidadeEstoque)VALUES(
"Kit1", "Motor", "100", 11000, 110000, "Adenilson", "44.444.444/001-44", "Adenilson Motors","27/03/2021", "100"),
("Kit2", "Pneu", "120", 72900, 87480 , "Jorge", "55.555.555/001-55", "Mecânica Jorge","28/02/2021", "100"),
("Kit3", "Parabrisa", "130", 1000, 130000, "Luana", "66.666.666/001-66", "Luana Cars","07/08/2020", "150");


INSERT INTO kitPecas(nomePeca, descricaoPeca, fabricante, quantidade, preco)VALUES(
"Motor", "Motor para carro", "Adenilson Motors", "100", 11000),
("Pneu", "Pneu para carro", "Mecânica Jorge", "100", 72900),
("Parabrisa", "Parabrisa para carro", "Luana Cars", "100", 1000);

INSERT INTO producaoVeiculos(nome, quantidade, kitPeca, dataInicioProducao, unidadeProducao) VALUES(
"Asur", 300, "Kit1", "12/02/2021", 300),
("Venus", 250, "Kit2", "11/01/2021", 350),
("Satur28", 250, "Kit3", "07/02/2021", 130);

select * from Funcionario;
select * from cliente;
select * from vendas;



