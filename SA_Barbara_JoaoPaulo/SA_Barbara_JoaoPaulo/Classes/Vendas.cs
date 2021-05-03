using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;
using System.Threading;
using SA_Barbara_JoaoPaulo;

namespace SA_Barbara_JoaoPaulo.Classes
{
    class Vendas
    {
        Conexao conexao = new Conexao();
        MySqlCommand comando_consulta = new MySqlCommand();
        public string mensagem;

        public string CNPJ { get; set; }
        public string MODELO { get; set; }
        public string QUANTIDADE { get; set; }
        public string PRECO { get; set; }
        public string PAGAMENTO { get; set; }
        public string VALOR { get; set; }

        public Vendas (string cnpj, string modelo, string quantidade, string preco, string valor, string pagamento)
        {
            CNPJ = cnpj;
            MODELO = modelo;
            QUANTIDADE = quantidade;
            PRECO = preco;
            VALOR = valor;
            PAGAMENTO = pagamento;

            comando_consulta.CommandText = "insert into vendas (cnpjCliente, modeloVeiculo, quantidadeComprada, preco, valorTotal, formaPagamento) values (@cnpjCliente, @modeloVeiculo, @quantidadeComprada, @preco, @valorTotal, @formaPagamento)";

            // Parametros
            comando_consulta.Parameters.AddWithValue("@cnpjCliente", CNPJ);
            comando_consulta.Parameters.AddWithValue("@modeloVeiculo", MODELO);
            comando_consulta.Parameters.AddWithValue("@quantidadeComprada", QUANTIDADE);
            comando_consulta.Parameters.AddWithValue("@preco", PRECO);
            comando_consulta.Parameters.AddWithValue("@valorTotal", VALOR);
            comando_consulta.Parameters.AddWithValue("@formaPagamento", PAGAMENTO);

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
