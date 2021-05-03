using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
using System.Threading;
using SA_Barbara_JoaoPaulo;

namespace SA_Barbara_JoaoPaulo.Telas
{
    public partial class RH12 : Form
    {
        Thread b0; // para retornar
        public RH12()
        {
            InitializeComponent();
        }

        private void button_buscar_Click(object sender, EventArgs e)
        {
            try
            {
                MySqlConnection conexao = new MySqlConnection("server=localhost; port=3306; User Id= root; database=sa_final;");
                conexao.Open();

                MySqlCommand busca = new MySqlCommand("select cpf, nome, dataNascimento, dataContrato, genero, setor, funcao, salario, unidadeTrabalho from Funcionario where cpf = ?", conexao); ;
                busca.Parameters.Clear();
                busca.Parameters.Add("@cpf", MySqlDbType.String).Value = txt_busca.Text;

                // Recebe o conteudo que vem do banco
                busca.CommandType = CommandType.Text;
                MySqlDataReader dados;
                dados = busca.ExecuteReader();
                dados.Read();

                txt_cpf.Text = dados.GetString(0);
                txt_nome.Text = dados.GetString(1);
                txt_nascimento.Text = dados.GetString(2);
                txt_contrato.Text = dados.GetString(3);
                txt_genero.Text = dados.GetString(4);
                txt_setor.Text = dados.GetString(5);
                txt_funcao.Text = dados.GetString(6);
                txt_salario.Text = dados.GetString(7);
                txt_unidade.Text = dados.GetString(8);

                conexao.Close();
            }

            catch
            {

            }
        }

        private void button_sair_Click(object sender, EventArgs e)
        {
            this.Close();
            b0 = new Thread(retornar); // fechar janela atual
            b0.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b0.Start();
        }

        private void retornar(object obj)
        {
            Application.Run(new RH01()); // Abre nova janela
        }
    }
}
