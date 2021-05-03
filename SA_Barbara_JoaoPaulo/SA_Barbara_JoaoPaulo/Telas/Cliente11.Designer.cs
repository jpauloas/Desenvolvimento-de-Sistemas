
namespace SA_Barbara_JoaoPaulo.Telas
{
    partial class Cliente11
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Cliente11));
            this.H1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button_cadastrar = new System.Windows.Forms.Button();
            this.button_sair = new System.Windows.Forms.Button();
            this.txt_telefone = new System.Windows.Forms.MaskedTextBox();
            this.txt_cnpj = new System.Windows.Forms.MaskedTextBox();
            this.txt_erro_genero = new System.Windows.Forms.Label();
            this.txt_erro_telefone = new System.Windows.Forms.Label();
            this.txt_erro_nome = new System.Windows.Forms.Label();
            this.txt_erro_cnpj = new System.Windows.Forms.Label();
            this.Telefone = new System.Windows.Forms.Label();
            this.txt_nome = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txt_erro_nomeContato = new System.Windows.Forms.Label();
            this.txt_endereco = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.txt_nomeContato = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.nome = new System.Windows.Forms.Label();
            this.txt_erro_endereco = new System.Windows.Forms.Label();
            this.txt_erro_emailContato = new System.Windows.Forms.Label();
            this.txt_emailContato = new System.Windows.Forms.TextBox();
            this.txt_erro_emailEmpresa = new System.Windows.Forms.Label();
            this.txt_emailEmpresa = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtsucesso = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // H1
            // 
            this.H1.AutoSize = true;
            this.H1.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.H1.Location = new System.Drawing.Point(290, 217);
            this.H1.Name = "H1";
            this.H1.Size = new System.Drawing.Size(192, 37);
            this.H1.TabIndex = 79;
            this.H1.Text = "Novo cliente";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(270, 12);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(224, 193);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 78;
            this.pictureBox1.TabStop = false;
            // 
            // button_cadastrar
            // 
            this.button_cadastrar.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_cadastrar.Location = new System.Drawing.Point(418, 536);
            this.button_cadastrar.Name = "button_cadastrar";
            this.button_cadastrar.Size = new System.Drawing.Size(182, 34);
            this.button_cadastrar.TabIndex = 82;
            this.button_cadastrar.Text = "Cadastrar";
            this.button_cadastrar.UseVisualStyleBackColor = true;
            this.button_cadastrar.Click += new System.EventHandler(this.button_cadastrar_Click);
            // 
            // button_sair
            // 
            this.button_sair.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_sair.Location = new System.Drawing.Point(606, 536);
            this.button_sair.Name = "button_sair";
            this.button_sair.Size = new System.Drawing.Size(168, 34);
            this.button_sair.TabIndex = 83;
            this.button_sair.Text = "Voltar";
            this.button_sair.UseVisualStyleBackColor = true;
            this.button_sair.Click += new System.EventHandler(this.button_sair_Click);
            // 
            // txt_telefone
            // 
            this.txt_telefone.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_telefone.Location = new System.Drawing.Point(27, 541);
            this.txt_telefone.Mask = "(00) 0000-00000";
            this.txt_telefone.Name = "txt_telefone";
            this.txt_telefone.Size = new System.Drawing.Size(364, 29);
            this.txt_telefone.TabIndex = 152;
            // 
            // txt_cnpj
            // 
            this.txt_cnpj.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_cnpj.Location = new System.Drawing.Point(27, 301);
            this.txt_cnpj.Mask = "000.000.000-00";
            this.txt_cnpj.Name = "txt_cnpj";
            this.txt_cnpj.Size = new System.Drawing.Size(364, 29);
            this.txt_cnpj.TabIndex = 151;
            // 
            // txt_erro_genero
            // 
            this.txt_erro_genero.AutoSize = true;
            this.txt_erro_genero.Location = new System.Drawing.Point(30, 650);
            this.txt_erro_genero.Name = "txt_erro_genero";
            this.txt_erro_genero.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_genero.TabIndex = 149;
            // 
            // txt_erro_telefone
            // 
            this.txt_erro_telefone.AutoSize = true;
            this.txt_erro_telefone.Location = new System.Drawing.Point(30, 573);
            this.txt_erro_telefone.Name = "txt_erro_telefone";
            this.txt_erro_telefone.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_telefone.TabIndex = 147;
            // 
            // txt_erro_nome
            // 
            this.txt_erro_nome.AutoSize = true;
            this.txt_erro_nome.Location = new System.Drawing.Point(30, 410);
            this.txt_erro_nome.Name = "txt_erro_nome";
            this.txt_erro_nome.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_nome.TabIndex = 146;
            // 
            // txt_erro_cnpj
            // 
            this.txt_erro_cnpj.AutoSize = true;
            this.txt_erro_cnpj.Location = new System.Drawing.Point(30, 333);
            this.txt_erro_cnpj.Name = "txt_erro_cnpj";
            this.txt_erro_cnpj.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_cnpj.TabIndex = 145;
            // 
            // Telefone
            // 
            this.Telefone.AutoSize = true;
            this.Telefone.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Telefone.Location = new System.Drawing.Point(23, 514);
            this.Telefone.Name = "Telefone";
            this.Telefone.Size = new System.Drawing.Size(195, 24);
            this.Telefone.TabIndex = 142;
            this.Telefone.Text = "Telefone da empresa:";
            // 
            // txt_nome
            // 
            this.txt_nome.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_nome.Location = new System.Drawing.Point(27, 379);
            this.txt_nome.Name = "txt_nome";
            this.txt_nome.Size = new System.Drawing.Size(364, 29);
            this.txt_nome.TabIndex = 141;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(23, 352);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(129, 24);
            this.label5.TabIndex = 140;
            this.label5.Text = "Nome fantasia";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(23, 274);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(58, 24);
            this.label4.TabIndex = 139;
            this.label4.Text = "CNPJ";
            // 
            // txt_erro_nomeContato
            // 
            this.txt_erro_nomeContato.AutoSize = true;
            this.txt_erro_nomeContato.Location = new System.Drawing.Point(421, 335);
            this.txt_erro_nomeContato.Name = "txt_erro_nomeContato";
            this.txt_erro_nomeContato.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_nomeContato.TabIndex = 161;
            // 
            // txt_endereco
            // 
            this.txt_endereco.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_endereco.Location = new System.Drawing.Point(27, 454);
            this.txt_endereco.Name = "txt_endereco";
            this.txt_endereco.Size = new System.Drawing.Size(364, 29);
            this.txt_endereco.TabIndex = 159;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(23, 427);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(94, 24);
            this.label10.TabIndex = 157;
            this.label10.Text = "Endereço";
            // 
            // txt_nomeContato
            // 
            this.txt_nomeContato.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_nomeContato.Location = new System.Drawing.Point(418, 300);
            this.txt_nomeContato.Name = "txt_nomeContato";
            this.txt_nomeContato.Size = new System.Drawing.Size(356, 29);
            this.txt_nomeContato.TabIndex = 156;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(414, 351);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(181, 24);
            this.label8.TabIndex = 155;
            this.label8.Text = "E-mail contato direto";
            // 
            // nome
            // 
            this.nome.AutoSize = true;
            this.nome.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nome.Location = new System.Drawing.Point(414, 273);
            this.nome.Name = "nome";
            this.nome.Size = new System.Drawing.Size(207, 24);
            this.nome.TabIndex = 154;
            this.nome.Text = "Nome de contato direto";
            // 
            // txt_erro_endereco
            // 
            this.txt_erro_endereco.AutoSize = true;
            this.txt_erro_endereco.Location = new System.Drawing.Point(30, 486);
            this.txt_erro_endereco.Name = "txt_erro_endereco";
            this.txt_erro_endereco.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_endereco.TabIndex = 166;
            // 
            // txt_erro_emailContato
            // 
            this.txt_erro_emailContato.AutoSize = true;
            this.txt_erro_emailContato.Location = new System.Drawing.Point(421, 413);
            this.txt_erro_emailContato.Name = "txt_erro_emailContato";
            this.txt_erro_emailContato.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_emailContato.TabIndex = 168;
            // 
            // txt_emailContato
            // 
            this.txt_emailContato.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_emailContato.Location = new System.Drawing.Point(418, 378);
            this.txt_emailContato.Name = "txt_emailContato";
            this.txt_emailContato.Size = new System.Drawing.Size(356, 29);
            this.txt_emailContato.TabIndex = 167;
            // 
            // txt_erro_emailEmpresa
            // 
            this.txt_erro_emailEmpresa.AutoSize = true;
            this.txt_erro_emailEmpresa.Location = new System.Drawing.Point(420, 489);
            this.txt_erro_emailEmpresa.Name = "txt_erro_emailEmpresa";
            this.txt_erro_emailEmpresa.Size = new System.Drawing.Size(0, 13);
            this.txt_erro_emailEmpresa.TabIndex = 171;
            // 
            // txt_emailEmpresa
            // 
            this.txt_emailEmpresa.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_emailEmpresa.Location = new System.Drawing.Point(418, 454);
            this.txt_emailEmpresa.Name = "txt_emailEmpresa";
            this.txt_emailEmpresa.Size = new System.Drawing.Size(356, 29);
            this.txt_emailEmpresa.TabIndex = 170;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(414, 427);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(168, 24);
            this.label2.TabIndex = 169;
            this.label2.Text = "E-mail da empresa";
            // 
            // txtsucesso
            // 
            this.txtsucesso.AutoSize = true;
            this.txtsucesso.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtsucesso.Location = new System.Drawing.Point(421, 509);
            this.txtsucesso.Name = "txtsucesso";
            this.txtsucesso.Size = new System.Drawing.Size(0, 24);
            this.txtsucesso.TabIndex = 172;
            // 
            // Cliente11
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 601);
            this.Controls.Add(this.txtsucesso);
            this.Controls.Add(this.txt_erro_emailEmpresa);
            this.Controls.Add(this.txt_emailEmpresa);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txt_erro_emailContato);
            this.Controls.Add(this.txt_emailContato);
            this.Controls.Add(this.txt_erro_endereco);
            this.Controls.Add(this.txt_erro_nomeContato);
            this.Controls.Add(this.txt_endereco);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.txt_nomeContato);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.nome);
            this.Controls.Add(this.txt_telefone);
            this.Controls.Add(this.txt_cnpj);
            this.Controls.Add(this.txt_erro_genero);
            this.Controls.Add(this.txt_erro_telefone);
            this.Controls.Add(this.txt_erro_nome);
            this.Controls.Add(this.txt_erro_cnpj);
            this.Controls.Add(this.Telefone);
            this.Controls.Add(this.txt_nome);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.button_sair);
            this.Controls.Add(this.button_cadastrar);
            this.Controls.Add(this.H1);
            this.Controls.Add(this.pictureBox1);
            this.Name = "Cliente11";
            this.Text = "Cliente11";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label H1;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button button_cadastrar;
        private System.Windows.Forms.Button button_sair;
        private System.Windows.Forms.MaskedTextBox txt_telefone;
        private System.Windows.Forms.MaskedTextBox txt_cnpj;
        private System.Windows.Forms.Label txt_erro_genero;
        private System.Windows.Forms.Label txt_erro_telefone;
        private System.Windows.Forms.Label txt_erro_nome;
        private System.Windows.Forms.Label txt_erro_cnpj;
        private System.Windows.Forms.Label Telefone;
        private System.Windows.Forms.TextBox txt_nome;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label txt_erro_nomeContato;
        private System.Windows.Forms.TextBox txt_endereco;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox txt_nomeContato;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label nome;
        private System.Windows.Forms.Label txt_erro_endereco;
        private System.Windows.Forms.Label txt_erro_emailContato;
        private System.Windows.Forms.TextBox txt_emailContato;
        private System.Windows.Forms.Label txt_erro_emailEmpresa;
        private System.Windows.Forms.TextBox txt_emailEmpresa;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label txtsucesso;
    }
}