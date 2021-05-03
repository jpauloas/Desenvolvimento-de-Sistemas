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
    public partial class Cliente12 : Form
    {
        Thread b0;
        public Cliente12()
        {
            InitializeComponent();
        }

        private void button_buscar_Click(object sender, EventArgs e)
        {
            try
            {
                MySqlConnection conexao = new MySqlConnection("server=localhost; port=3306; User Id= root; database=sa_final;");
                conexao.Open();

                MySqlCommand busca = new MySqlCommand("select cnpj, nomeFantasia, telefone, endereco, nomeFuncionario, emailFuncionario, emailEmpresa from cliente where cnpj = ?", conexao); ;
                busca.Parameters.Clear();
                busca.Parameters.Add("@cnpj", MySqlDbType.String).Value = txt_busca_cnpj.Text;

                // Recebe o conteudo que vem do banco
                busca.CommandType = CommandType.Text;
                MySqlDataReader dados;
                dados = busca.ExecuteReader();
                dados.Read();

                txt_cnpj.Text = dados.GetString(0);
                txt_nome.Text = dados.GetString(1);
                txt_telefoneEmpresa.Text = dados.GetString(2);
                txt_endereco.Text = dados.GetString(3);
                txt_nomecontato.Text = dados.GetString(4);
                txt_emailContato.Text = dados.GetString(5);
                txt_emailEmpresa.Text = dados.GetString(6);

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
            Application.Run(new Cliente01()); // Abre nova janela
        }
    }
}
