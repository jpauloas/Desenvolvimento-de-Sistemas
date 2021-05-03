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
    public partial class RH11 : Form
    {
        Thread b0;
        public RH11()
        {
            InitializeComponent();
            // Cadastro de Consultas 
            box_setor.Items.Add("RH");
            box_setor.Items.Add("Linha de montagem");
            box_setor.Items.Add("Estoque de peças e insumos");
            box_setor.Items.Add("TI");
            box_setor.Items.Add("Pátio (veículos prontos)");
            box_setor.Items.Add("Engenharia");
            box_setor.Items.Add("Manutenção da fábrica");
            box_setor.Items.Add("Segurança Patrimonial");
            box_setor.Items.Add("Importação e Exportação");
            box_setor.Items.Add("Compras e Vendas");
            box_setor.Items.Add("Administração Geral");

            box_setor.SelectedIndex = 0;

            box_genero.Items.Add("Feminino");
            box_genero.Items.Add("Masculino");
            box_genero.Items.Add("Outros");
            box_genero.SelectedIndex = 0;

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

        private void button_cadastrar_Click(object sender, EventArgs e)
        {
            bool erro = false;
            txt_erro_cpf.Text = " ";
            txt_erro_nome.Text = " ";
            txt_erro_nascimento.Text = " ";
            txt_erro_contrato.Text = "";
            txt_erro_genero.Text = "";
            txt_erro_funcao.Text = "";
            txt_erro_setor.Text = " ";
            txt_erro_salario.Text = " ";
            txt_erro_unidade.Text = " ";
            txtsucesso.Text = " ";

            if (txt_cpf.Text == "   ,   ,   -") // Verificação de vazio no campo CPF
            {
                txt_erro_cpf.Text = "Insira um CPF válido!";
                erro = true;
                return;
            }

            if (txt_nome.Text == " ") // Verificação de vazio no campo NOME 
            {
                txt_erro_nome.Text = "Insira um nome válido!";
                erro = true;
                return;
            }

            if (txt_nascimento.Text == " ") // Verificação de vazio no campo DATA DE NASCIMENTO
            {
                txt_erro_nascimento.Text = "Insira uma data de nascimento válida!";
                erro = true;
                return;
            }

            if (txt_contrato.Text == " ") // Verificação de vazio no campo DATA DE CONTRATO
            {
                txt_erro_contrato.Text = "Insira uma data de contrato válida!";
                erro = true;
                return;
            }

            if (txt_funcao.Text == " ") // Verificação de vazio no campo FUNCAO
            {
                txt_erro_funcao.Text = "Insira uma função válida!";
                erro = true;
                return;
            }
            if (txt_salario.Text == " ") // Verificação de vazio no campo SALARIO
            {
                txt_erro_salario.Text = "Insira um valor de salário válido!";
                erro = true;
                return;
            }
            if (txt_unidade.Text == " ") // Verificação de vazio no campo UNIDADE
            {
                txt_erro_unidade.Text = "Insira um nome de unidade válido!";
                erro = true;
                return;
            }

            if (box_genero is null)
            {
                txt_erro_genero.Text = "Selecione um genero!";
                erro = true;
                return;
            }

            if (box_setor is null)
            {
                txt_erro_setor.Text = "Selecione um setor!";
                erro = true;
                return;
            }

            if (erro == false)
            {
                Classes.Funcionarios func = new Classes.Funcionarios (txt_cpf.Text.ToString(), txt_nome.Text.ToString(), txt_nascimento.Text.ToString(), txt_contrato.Text.ToString(),  box_genero.SelectedItem.ToString(), box_setor.SelectedItem.ToString(), txt_funcao.Text.ToString(), txt_salario.Text.ToString(), txt_unidade.Text.ToString());
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
