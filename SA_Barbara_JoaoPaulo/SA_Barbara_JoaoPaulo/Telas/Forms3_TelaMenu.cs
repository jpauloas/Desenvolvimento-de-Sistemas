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
    public partial class Forms3_TelaMenu : Form
    {
        Thread b0; // para retornar para o login
        Thread b1; // para ir ate Cliente
        Thread b2; // para ir ate Vendas
        Thread b3; // para ir ate Estoque
        Thread b4; // para ir ate Produção
        Thread b5; // para ir ate Recursos Humanos

        public Forms3_TelaMenu()
        {
            InitializeComponent();
        }

        private void button_Sair_Click(object sender, EventArgs e) // Seleção SAIR
        {
            this.Close();
            b0 = new Thread(abrirlogin); // fechar janela atual
            b0.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b0.Start();
        }

        private void abrirlogin(object obj)
        {
            Application.Run(new Form1_Tela_Login()); // Abre nova janela
        }

        private void button_Cliente_Click(object sender, EventArgs e)
        {
            this.Close();
            b1 = new Thread(abrir_cliente); // fechar janela atual
            b1.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b1.Start();
        }

        private void abrir_cliente(object obj)
        {
            Application.Run(new Cliente01()); // Abre nova janela
        }      

        private void button_Vendas_Click_1(object sender, EventArgs e)
        {
            this.Close();
            b2 = new Thread(abrir_vendas); // fechar janela atual
            b2.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b2.Start();
        }
        private void abrir_vendas(object obj)
        {
            Application.Run(new Vendas01()); // Abre nova janela
        }

        private void button_Estoque_Click(object sender, EventArgs e)
        {
            this.Close();
            b3 = new Thread(abrir_estoque); // fechar janela atual
            b3.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b3.Start();
        }
        private void abrir_estoque(object obj)
        {
            Application.Run(new Estoque01()); // Abre nova janela
        }

        private void button_Producao_Click(object sender, EventArgs e)
        {
            this.Close();
            b4 = new Thread(abrir_producao); // fechar janela atual
            b4.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b4.Start();
        }
        private void abrir_producao(object obj)
        {
            Application.Run(new Producao01()); // Abre nova janela
        }

        private void button_RH_Click(object sender, EventArgs e)
        {
            this.Close();
            b5 = new Thread(abrir_RH); // fechar janela atual
            b5.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b5.Start();
        }
        private void abrir_RH(object obj)
        {
            Application.Run(new RH01()); // Abre nova janela
        }
    }
}
