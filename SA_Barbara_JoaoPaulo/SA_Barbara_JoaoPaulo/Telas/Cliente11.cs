using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Threading;
using SA_Barbara_JoaoPaulo;

namespace SA_Barbara_JoaoPaulo.Telas
{
    public partial class Cliente11 : Form
    {
        Thread b0;
        public Cliente11()
        {
            InitializeComponent();
        }

        private void button_sair_Click(object sender, EventArgs e) //Retornando a tela anterior
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

        private void button_cadastrar_Click(object sender, EventArgs e)
        {
            bool erro = false;
            txt_erro_cnpj.Text = " ";
            txt_erro_nome.Text = " ";
            txt_erro_endereco.Text = " ";
            txt_erro_telefone.Text = "";
            txt_erro_nomeContato.Text = "";
            txt_erro_emailContato.Text = " ";
            txt_erro_emailEmpresa.Text = " ";
            txtsucesso.Text = " ";

            if (txt_cnpj.Text == "   ,   ,   -") // Verificação de vazio no campo CNPJ
            {
                txt_erro_cnpj.Text = "Insira um CNPJ válido!";
                erro = true;
                return;
            }

            if (txt_nome.Text == " ") // Verificação de vazio no campo NOME FANTASIA
            {
                txt_erro_nome.Text = "Insira um nome fantasia válido!";
                erro = true;
                return;
            }

            if (txt_endereco.Text == " ") // Verificação de vazio no campo ENDERECO
            {
                txt_erro_endereco.Text = "Insira um endereço válido!";
                erro = true;
                return;
            }

            if (txt_telefone.Text == " ") // Verificação de vazio no campo TELEFONE EMPRESA
            {
                txt_erro_telefone.Text = "Insira um telefone válido!";
                erro = true;
                return;
            }

            if (txt_nomeContato.Text == " ") // Verificação de vazio no campo NOME CONTATO DIRETO
            {
                txt_erro_nomeContato.Text = "Insira um nome de contato válido válida!";
                erro = true;
                return;
            }
            if (txt_emailContato.Text == " ") // Verificação de vazio no campo E-MAIL CONTATO DIRETO
            {
                txt_erro_emailContato.Text = "Insira um email válido!";
                erro = true;
                return;
            }
            if (txt_emailEmpresa.Text == " ") // Verificação de vazio no campo E-MAIL EMPRESA
            {
                txt_erro_emailEmpresa.Text = "Insira um email válido!";
                erro = true;
                return;
            }


            if (erro == false)
            {
                Classes.Cliente func = new Classes.Cliente(txt_cnpj.Text, txt_nome.Text, txt_endereco.Text, txt_telefone.Text, txt_nomeContato.Text, txt_emailContato.Text, txt_emailEmpresa.Text);
                txtsucesso.Text = "Cadastro realizado com sucesso!";

            }

            else
            {
                txtsucesso.Text = "Preencha corretamente os dados! ";
                return;
            }
        }
    }
}
