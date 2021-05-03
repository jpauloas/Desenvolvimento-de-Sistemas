
namespace SA_Barbara_JoaoPaulo.Telas
{
    partial class Vendas01
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Vendas01));
            this.button_Ver = new System.Windows.Forms.Button();
            this.button_Nova = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.button_Sair = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // button_Ver
            // 
            this.button_Ver.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Ver.Location = new System.Drawing.Point(482, 321);
            this.button_Ver.Name = "button_Ver";
            this.button_Ver.Size = new System.Drawing.Size(280, 34);
            this.button_Ver.TabIndex = 26;
            this.button_Ver.Text = "Visualizar vendas";
            this.button_Ver.UseVisualStyleBackColor = true;
            this.button_Ver.Click += new System.EventHandler(this.button_Ver_Click);
            // 
            // button_Nova
            // 
            this.button_Nova.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Nova.Location = new System.Drawing.Point(482, 281);
            this.button_Nova.Name = "button_Nova";
            this.button_Nova.Size = new System.Drawing.Size(280, 34);
            this.button_Nova.TabIndex = 25;
            this.button_Nova.Text = "Cadastrar nova venda";
            this.button_Nova.UseVisualStyleBackColor = true;
            this.button_Nova.Click += new System.EventHandler(this.button_Nova_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(25, 31);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(406, 388);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 24;
            this.pictureBox1.TabStop = false;
            // 
            // button_Sair
            // 
            this.button_Sair.BackColor = System.Drawing.Color.LightCoral;
            this.button_Sair.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Sair.Location = new System.Drawing.Point(482, 379);
            this.button_Sair.Name = "button_Sair";
            this.button_Sair.Size = new System.Drawing.Size(280, 40);
            this.button_Sair.TabIndex = 23;
            this.button_Sair.Text = "Sair";
            this.button_Sair.UseVisualStyleBackColor = false;
            this.button_Sair.Click += new System.EventHandler(this.button_Sair_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(475, 212);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(126, 37);
            this.label1.TabIndex = 22;
            this.label1.Text = "Vendas";
            // 
            // Vendas01
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button_Ver);
            this.Controls.Add(this.button_Nova);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.button_Sair);
            this.Controls.Add(this.label1);
            this.Name = "Vendas01";
            this.Text = "_01_Vendas";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button button_Ver;
        private System.Windows.Forms.Button button_Nova;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button button_Sair;
        private System.Windows.Forms.Label label1;
    }
}