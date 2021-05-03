
namespace SA_Barbara_JoaoPaulo.Telas
{
    partial class Forms3_TelaMenu
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Forms3_TelaMenu));
            this.H1 = new System.Windows.Forms.Label();
            this.button_Sair = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button_Cliente = new System.Windows.Forms.Button();
            this.button_Vendas = new System.Windows.Forms.Button();
            this.button_Producao = new System.Windows.Forms.Button();
            this.button_Estoque = new System.Windows.Forms.Button();
            this.button_RH = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // H1
            // 
            this.H1.AutoSize = true;
            this.H1.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.H1.Location = new System.Drawing.Point(476, 59);
            this.H1.Name = "H1";
            this.H1.Size = new System.Drawing.Size(301, 37);
            this.H1.TabIndex = 10;
            this.H1.Text = "Gestão e processos";
            // 
            // button_Sair
            // 
            this.button_Sair.BackColor = System.Drawing.Color.LightCoral;
            this.button_Sair.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Sair.Location = new System.Drawing.Point(483, 370);
            this.button_Sair.Name = "button_Sair";
            this.button_Sair.Size = new System.Drawing.Size(280, 40);
            this.button_Sair.TabIndex = 15;
            this.button_Sair.Text = "Sair";
            this.button_Sair.UseVisualStyleBackColor = false;
            this.button_Sair.Click += new System.EventHandler(this.button_Sair_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(21, 22);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(406, 388);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 16;
            this.pictureBox1.TabStop = false;
            // 
            // button_Cliente
            // 
            this.button_Cliente.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Cliente.Location = new System.Drawing.Point(483, 143);
            this.button_Cliente.Name = "button_Cliente";
            this.button_Cliente.Size = new System.Drawing.Size(280, 34);
            this.button_Cliente.TabIndex = 17;
            this.button_Cliente.Text = "Clientes";
            this.button_Cliente.UseVisualStyleBackColor = true;
            this.button_Cliente.Click += new System.EventHandler(this.button_Cliente_Click);
            // 
            // button_Vendas
            // 
            this.button_Vendas.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Vendas.Location = new System.Drawing.Point(483, 183);
            this.button_Vendas.Name = "button_Vendas";
            this.button_Vendas.Size = new System.Drawing.Size(280, 34);
            this.button_Vendas.TabIndex = 18;
            this.button_Vendas.Text = "Vendas";
            this.button_Vendas.UseVisualStyleBackColor = true;
            this.button_Vendas.Click += new System.EventHandler(this.button_Vendas_Click_1);
            // 
            // button_Producao
            // 
            this.button_Producao.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Producao.Location = new System.Drawing.Point(483, 263);
            this.button_Producao.Name = "button_Producao";
            this.button_Producao.Size = new System.Drawing.Size(280, 34);
            this.button_Producao.TabIndex = 20;
            this.button_Producao.Text = "Produção";
            this.button_Producao.UseVisualStyleBackColor = true;
            this.button_Producao.Click += new System.EventHandler(this.button_Producao_Click);
            // 
            // button_Estoque
            // 
            this.button_Estoque.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Estoque.Location = new System.Drawing.Point(483, 223);
            this.button_Estoque.Name = "button_Estoque";
            this.button_Estoque.Size = new System.Drawing.Size(280, 34);
            this.button_Estoque.TabIndex = 19;
            this.button_Estoque.Text = "Estoque";
            this.button_Estoque.UseVisualStyleBackColor = true;
            this.button_Estoque.Click += new System.EventHandler(this.button_Estoque_Click);
            // 
            // button_RH
            // 
            this.button_RH.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_RH.Location = new System.Drawing.Point(483, 303);
            this.button_RH.Name = "button_RH";
            this.button_RH.Size = new System.Drawing.Size(280, 34);
            this.button_RH.TabIndex = 21;
            this.button_RH.Text = "Recursos Humanos";
            this.button_RH.UseVisualStyleBackColor = true;
            this.button_RH.Click += new System.EventHandler(this.button_RH_Click);
            // 
            // Forms3_TelaMenu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(822, 438);
            this.Controls.Add(this.button_RH);
            this.Controls.Add(this.button_Producao);
            this.Controls.Add(this.button_Estoque);
            this.Controls.Add(this.button_Vendas);
            this.Controls.Add(this.button_Cliente);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.button_Sair);
            this.Controls.Add(this.H1);
            this.Name = "Forms3_TelaMenu";
            this.Text = "A01_TelaMenu";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label H1;
        private System.Windows.Forms.Button button_Sair;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button button_Cliente;
        private System.Windows.Forms.Button button_Vendas;
        private System.Windows.Forms.Button button_Producao;
        private System.Windows.Forms.Button button_Estoque;
        private System.Windows.Forms.Button button_RH;
    }
}