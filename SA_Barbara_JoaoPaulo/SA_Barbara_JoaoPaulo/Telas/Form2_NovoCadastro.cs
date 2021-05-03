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
    public partial class Form2_NovoCadastro : Form
    {
        Thread b0; // Tela Para login
        public Form2_NovoCadastro()
        {
            InitializeComponent();
        }

        private void button_sair_Click(object sender, EventArgs e) // ~Função de retornar ao login
        {
            this.Close();
            b0 = new Thread(abrirlogin); // fechar janela inicial
            b0.SetApartmentState(ApartmentState.STA); // configura o Apartament da Thread antes dela se iniciada
            b0.Start();
        }

        private void abrirlogin(object obj)
        {
            Application.Run(new Form1_Tela_Login()); // Abre nova janela
        }

        private void button_cadastrar_Click(object sender, EventArgs e) // Função cadastrar
        {

        }
    }
}
