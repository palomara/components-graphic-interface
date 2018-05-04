package view;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {

	private JDesktopPane desktop;
	
	
	JTextField txtLogin = new JTextField();
	JLabel lblLogin = new JLabel ("Login: ");
	
	JLabel lblPassword = new JLabel ("Password: ");
	JPasswordField jPassword = new JPasswordField (); // a subclasse de JTextField e acrescenta vários métodos específicos para o processamento de senha
	
	JButton btnLogin = new JButton("Sign  in ");
	
	public LoginScreen() {
		
		desktop = new JDesktopPane();
		desktop.setBackground(Color.LIGHT_GRAY);
		
		
		Container pane = this.getContentPane();
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(330, 300);
		this.setResizable(true);
		this.setTitle("Login");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pane.add(lblLogin);
		pane.add(txtLogin);
		lblLogin.setBounds(40, 15, 45, 30);
		txtLogin.setBounds(110, 20, 150, 25);		
		
		pane.add(lblPassword);
		pane.add(jPassword);
		lblPassword.setBounds(20, 45, 70, 30);
		jPassword.setBounds(110, 50, 150, 25);
		
		
		pane.add(btnLogin);
		btnLogin.setBounds(110, 80, 150, 30);
		
	}
		
		

	public static void main (String args[]) {
		LoginScreen window = new LoginScreen();
	}
}
