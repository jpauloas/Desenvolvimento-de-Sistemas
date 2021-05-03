using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;
using SA_Barbara_JoaoPaulo;
using MySql.Data.MySqlClient;


namespace SA_Barbara_JoaoPaulo.Classes
{
    class Cliente
    {
        Conexao conexao = new Conexao();
        MySqlCommand comando_consulta = new MySqlCommand();
        public string mensagem;

        public string CNPJ { get; set; }
        public string NOME { get; set; }
        public string ENDERECO { get; set; }
        public string TELEFONE { get; set; }
        public string NOMECONTATO { get; set; }
        public string EMAILCONTATO { get; set; }
        public string EMAILEMPRESA { get; set; }

        public Cliente (string cnpj, string nome, string endereco, string telefone, string nomecontato, string emailcontato, string emailempresa)
        {
            CNPJ = cnpj;
            NOME = nome;
            ENDERECO = endereco;
            TELEFONE = telefone;
            NOMECONTATO = nomecontato;
            EMAILCONTATO = emailcontato;
            EMAILEMPRESA = emailempresa;

            comando_consulta.CommandText = "insert into cliente (cnpj, nomeFantasia, telefone, endereco, nomeFuncionario, emailFuncionario, emailEmpresa) values (@cnpj, @nomeFantasia, @telefone, @endereco, @nomeFuncionario, @emailFuncionario, @emailEmpresa)";

            // Parametros
            comando_consulta.Parameters.AddWithValue("@cnpj", CNPJ);
            comando_consulta.Parameters.AddWithValue("@nomeFantasia", NOME);
            comando_consulta.Parameters.AddWithValue("@endereco", ENDERECO);
            comando_consulta.Parameters.AddWithValue("@telefone", TELEFONE);
            comando_consulta.Parameters.AddWithValue("@nomeFuncionario", NOMECONTATO);
            comando_consulta.Parameters.AddWithValue("@emailFuncionario", EMAILCONTATO);
            comando_consulta.Parameters.AddWithValue("@emailEmpresa", EMAILEMPRESA);

            // Conexao com o banco 
            try
            {
                //Conecta com o banco
                comando_consulta.Connection = conexao.conectar();

                //Execução do comando
                comando_consulta.ExecuteNonQuery();

                // Desconecta o banco
                conexao.desligar();

                // Mensagem de sucesso no cadastro
                this.mensagem = ("Cadastrado com Sucesso!");
            }

            catch (MySqlException)
            {
                this.mensagem = ("Erro ao se conectar com o Banco de dados!");
            }
        }
    }
}
