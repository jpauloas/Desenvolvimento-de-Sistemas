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

namespace SA_Barbara_JoaoPaulo
{
    public partial class Form1_Tela_Login : Form
    {
        Thread b1; // Tela de Novo Cadastro
        Thread b2; // Tela Para Menu Inicial

        public Form1_Tela_Login()
        {
            InitializeComponent();
        }

        private void button_entrar_Click(object sender, EventArgs e)
        {
            this.Close();
            b2 = new Thread(abrirmenuinicial); // fechar janela inicial
            b2.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b2.Start();
        }
        private void abrirmenuinicial(object obj)
        {
            Application.Run(new Telas.Forms3_TelaMenu()); // Abre nova janela
        }

      
            
        private void button_NovoCadastro_Click_1(object sender, EventArgs e)
        {

            this.Close();
            b1 = new Thread(abrirNovoCadastro); // fechar janela inicial
            b1.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b1.Start();
        }

        private void abrirNovoCadastro(object obj)
        {
            Application.Run(new Telas.Form2_NovoCadastro()); // Abre nova janela para te
        }

    }
}
