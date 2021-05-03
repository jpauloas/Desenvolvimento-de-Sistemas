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
    public class Funcionarios
    {
        Conexao conexao = new Conexao();
        MySqlCommand comando_consulta = new MySqlCommand();
        public string mensagem;

        public string CPF { get; set; }
        public string NOME { get; set; }
        public string DATANASCIMENTO { get; set; }
        public string DATACONTRATO { get; set; }
        public string GENERO { get; set; }
        public string SETOR { get; set; }
        public string FUNCAO { get; set; }
        public string  SALARIO { get; set; }
        public string UNIDADE { get; set; }

      
        public Funcionarios(string cpf, 
                            string nome,
                            string datanascimento,
                            string datacontrato,
                            string genero, 
                            string setor,
                            string funcao,
                            string salario,
                            string unidade)

        {

            NOME = nome;
            CPF = cpf;
            DATANASCIMENTO = datanascimento;
            DATACONTRATO = datacontrato;
            GENERO = genero;
            SETOR = setor;
            FUNCAO = funcao;
            SALARIO = salario;
            UNIDADE = unidade;

            // Comando MySQL
            comando_consulta.CommandText = "insert into Funcionario (cpf, nome, dataNascimento, dataContrato, genero, setor, funcao, salario, unidadeTrabalho) values (@cpf, @nome, @dataNascimento, @dataContrato, @genero, @setor, @funcao, @salario, @unidadeTrabalho)";

            // Parametros
            comando_consulta.Parameters.AddWithValue("@nome", NOME);
            comando_consulta.Parameters.AddWithValue("@cpf", CPF);
            comando_consulta.Parameters.AddWithValue("@dataNascimento", DATANASCIMENTO);
            comando_consulta.Parameters.AddWithValue("@dataContrato", DATACONTRATO);
            comando_consulta.Parameters.AddWithValue("@genero", GENERO);
            comando_consulta.Parameters.AddWithValue("@setor", SETOR);
            comando_consulta.Parameters.AddWithValue("@funcao", FUNCAO);
            comando_consulta.Parameters.AddWithValue("@salario", SALARIO);
            comando_consulta.Parameters.AddWithValue("@unidadeTrabalho", UNIDADE);

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
