import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;

public class FormCalculadora extends JFrame {
	private JButton btCalcular;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JLabel lbNumero1;
	private JLabel lbNumero2;
	private JLabel lbResultado;
	
	
	public FormCalculadora() {
		Container conteiner; 

		//configuração de tela
		this.setTitle("SENAI TDS: Calculadora soma");
		
		// Declaração do modelo do Layout
		this.setLayout(new FlowLayout());
		this.setVisible(true); // torna a visualização abert
		this.setSize(600,150); //tamanho da tela 
	
	
		conteiner = this.getContentPanel(); //Construindo o Conteiner
	
		btCalcular = new JButton("Calcular");
		tfNumero1 = new JTextFiled(10);
		tfNumero2 = new JTextFiled(10);
		lbNumero1 = new JLabel ("Numero 1");
		lbNumero2 = new JLabel ("Numero 2");
	
		conteiner.add(lbNumero1);
		conteiner.add(lbNumero2);
		conteiner.add(tfNumero1);
		conteiner.add(tfNumero2);
		conteiner.add(btCalcular);
		conteiner.add(lbResultado);
	
	}
	
	
	
}
