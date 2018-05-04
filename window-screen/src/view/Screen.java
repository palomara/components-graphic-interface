package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Screen extends JFrame {

	JLabel lblNome = new JLabel ("Nome: ");
	JTextField txtNome = new JTextField();
	
	JFormattedTextField txtCpf = null;
	JLabel lblCPF = new JLabel("CPF: ");
	
	JFormattedTextField txtRg = null;
	JLabel lblRG = new JLabel("RG: ");
	
	JLabel lblEndereco = new JLabel ("Endereço: ");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblBairro = new JLabel ("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblCEP = new JLabel ("CEP: ");
	JTextField txtCEP = new JTextField();
	
	JLabel lblCidade = new JLabel("Cidade: ");	
	JTextField txtCidade = new JTextField();
	
	JLabel lblEst = new JLabel("ESTADO: ");
	JComboBox cmbEst = new JComboBox(); 
	
	JFormattedTextField txtTel = null;
	JLabel tel = new JLabel("TELEFONE: ");
	
	JFormattedTextField txtCel = null;
	JLabel cel = new JLabel("CELULAR: ");
	
	
	
	MaskFormatter formatTel = null; //add máscara
	MaskFormatter formatCel = null;
	MaskFormatter formatCPF = null;
	MaskFormatter formatCep = null;
	MaskFormatter formatRg = null;
	
	public Screen() {
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(10,2));
		
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Janela com Novo Layout");
			
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		pane.add(lblBairro);
		pane.add(txtBairro);
		
		try { //
			formatCep = new MaskFormatter("#####-###"); //máscara
			txtCEP = new JFormattedTextField(formatCep);
		} catch (Exception ex) { //exibe erro
			ex.printStackTrace();
		}
		
		pane.add(lblCEP);
		pane.add(txtCEP);			
		
	}
	
	public static void main (String[] args) {
		Screen firstS = new Screen ();
		
	}
}
