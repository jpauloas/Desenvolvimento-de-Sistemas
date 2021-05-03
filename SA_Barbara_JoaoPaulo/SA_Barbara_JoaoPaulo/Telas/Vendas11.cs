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
    
    public partial class Vendas11 : Form
    {
        Thread b0; // Para retornar

        public Vendas11()
        {
            InitializeComponent();
            box_pagamento.Items.Add("Crédito");
            box_pagamento.Items.Add("Débito");
            box_pagamento.Items.Add("Cheque");
            box_pagamento.Items.Add("Transferência Bancária");


            box_pagamento.SelectedIndex = 0;
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
            Application.Run(new Vendas01()); // Abre nova janela
        }

        private void button_cadastrar_Click(object sender, EventArgs e)
        {
            bool erro = false;
            txt_erro_cnpj.Text = " ";
            txt_erro_modelo.Text = " ";
            txt_erro_quantidade.Text = " ";
            txt_erro_preco.Text = "";
            txt_erro_valor.Text = "";
            txt_erro_pagamento.Text = "";
            txtsucesso.Text = " ";

            if (txt_cnpj.Text == "   ,   ,   -") // Verificação de vazio no campo CNPJ DO CLIENTE
            {
                txt_erro_cnpj.Text = "Insira um CNPJ válido!";
                erro = true;
                return;
            }

            if (txt_modelo.Text == " ") // Verificação de vazio no campo MODELO DO VEICULO
            {
                txt_erro_modelo.Text = "Insira um modelo válido!";
                erro = true;
                return;
            }

            if (txt_quantidade.Text == " ") // Verificação de vazio no campo QUANTIDADE ENCOMENDADA
            {
                txt_erro_quantidade.Text = "Insira uma quantidade válida!";
                erro = true;
                return;
            }

            if (txt_preco.Text == " ") // Verificação de vazio no campo PRECO UNITÁRIO
            {
                txt_erro_preco.Text = "Insira um preço válido!";
                erro = true;
                return;
            }

            if (txt_valor.Text == " ") // Verificação de vazio no campo VALOR TOTAL
            {
                txt_erro_valor.Text = "Insira um valor válido!";
                erro = true;
                return;
            }


            if (box_pagamento is null)
            {
                txt_erro_pagamento.Text = "Selecione uma forma de pagamento!";
                erro = true;
                return;
            }

            if (erro == false)
            {
                Classes.Vendas func = new Classes.Vendas(txt_cnpj.Text, txt_modelo.Text, txt_quantidade.Text, txt_preco.Text, txt_valor.Text, box_pagamento.SelectedItem.ToString());
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
