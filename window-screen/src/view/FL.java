package view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FL extends JFrame {

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(45);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(45);
	JLabel lblBairro = new JLabel ("Bairro: ");
	JTextField txtBairro = new JTextField(45);
	JLabel lblCEP = new JLabel ("CEP: ");
	JTextField txtCEP = new JTextField(45);
	
	public FL() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		pane.add(lblBairro);
		pane.add(txtBairro);
		pane.add(lblCEP);
		pane.add(txtCEP);		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 500);
	}
	
	
	public static void main(String[] args) {
		//
		FL janela = new FL();
	}

}

