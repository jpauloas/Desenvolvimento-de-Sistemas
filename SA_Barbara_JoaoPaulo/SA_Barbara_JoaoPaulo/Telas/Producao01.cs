﻿using System;
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
    public partial class Producao01 : Form
    {
        Thread b0; // para retornar

        public Producao01()
        {
            InitializeComponent();
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
