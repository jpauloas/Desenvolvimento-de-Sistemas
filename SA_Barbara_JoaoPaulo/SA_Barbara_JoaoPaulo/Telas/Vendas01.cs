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
    public partial class Vendas01 : Form
    {
        Thread b0; // para retornar para o login
        Thread b1; // para ir ate Cadastro
        Thread b2; // para ir ate Visualização

        public Vendas01()
        {
            InitializeComponent();
        }

        private void button_Nova_Click(object sender, EventArgs e)
        {
            this.Close();
            b1 = new Thread(abrir_cadastro); // fechar janela atual
            b1.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b1.Start();
        }

        private void abrir_cadastro(object obj)
        {
            Application.Run(new Vendas11()); // Abre nova janela
        }

        private void button_Ver_Click(object sender, EventArgs e)
        {
            b2 = new Thread(abrir_ver); // fechar janela atual
            b2.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b2.Start();
        }
        private void abrir_ver(object obj)
        {
            Application.Run(new Vendas12()); // Abre nova janela
        }

        private void button_Sair_Click(object sender, EventArgs e)
        {
            this.Close();
            b0 = new Thread(retornar); // fechar janela atual
            b0.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b0.Start();
        }

        private void retornar(object obj)
        {
            Application.Run(new Forms3_TelaMenu()); // Abre nova janela
        }
    }
}
