package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

   //cria barra de menu                             
   private JMenuBar     jmPrincipal     = new JMenuBar();

   //cria menu "cadastro" na barra de menu
   private JMenu        jmCadastro      = new JMenu("Cadastros");
   private JMenu        jmLogin			= new JMenu ("Login");
   private JMenu        jmSair 			= new JMenu("Sair");
   
   //cria item "cliente" dentro do menu "cadastro"
   private JMenuItem    jmCadCliente    = new JMenuItem("Cliente");
   private JMenuItem    jmCadFornecedor = new JMenuItem("Fornecedor");
  
    JTextField txtNome = new JTextField();
	JLabel lblNome = new JLabel ("Nome: ");
	
	JTextField txtSobrenome = new JTextField();
	JLabel lblSobrenome = new JLabel ("Sobrenome: ");
	
	JLabel lblPassword = new JLabel ("Password: ");
	JPasswordField jPassword = new JPasswordField ();
	
	JButton btnCadastrar = new JButton ("Cadastrar");

   //cria objeto jdPane, do tipo JDesktopPane. Ele vai dentro d JFrame
   public  JDesktopPane jdPane          = new JDesktopPane();

   Tela telaCadCliente, telaCadFornecedor, telaCadProduto, telaLogin;

   //m�todo main instancia o objeto menu A inicializa��o fica com o construtor da classe	
   public static void main(String args[]) {
      Menu menu = new Menu();
   }
   
 //m�todo construtor da aplica��o
   public Menu() {
      
	   super ("Testando JInternalFrame contida em " +
				  "uma JDesktopPane");
	   
	    jdPane = new JDesktopPane();
	    jdPane.setBackground(Color.gray);
	    //jdPane.setToolTipText(""); 
		this.getContentPane().add(jdPane);   
	
		
		   
	   //"pegue o conte�do do painel" - adiciona o jDesktopPane ao JFrame (janela principal
      getContentPane().add(jdPane);

      //adiciona o menu cadastro � barra de menus (jmPrincipal)
      jmPrincipal.add(jmCadastro);
      
      jmPrincipal.add(jmLogin);
      
      jmPrincipal.add(jmSair);
      
      //adiciona o item cliente ao menu cadastro
      jmCadastro.add(jmCadCliente);

      //adiciona o item fornecedor ao menu cadastro
      jmCadastro.add(jmCadFornecedor);

      //"ajusta" a barra de menu dentro da janela principal
      setJMenuBar(jmPrincipal);

      //adiciona actionlistener ao item "cliente" do menu, 
      //para que os eventos sejam tratados
      jmCadCliente.addActionListener(this);

      //adiciona o actionlistener ao item "fornecedor do menu
      jmCadFornecedor.addActionListener(this);

      jmLogin.addActionListener(this);
      
      setSize(800,600);
      setVisible(true);
   }
   
 //tratamento dos eventos de menu
   public void actionPerformed(ActionEvent evt) {

      //se o evento capturado for uma chamada vinda do item cliente do menu...
      if (evt.getSource() == jmCadCliente) {
         //se n�o for null, a tela j� est� vis�vel, tendo apenas que ser "levada pra frente"
         if (telaCadCliente == null)
            //instancia a tela de cadastro de clientes
            telaCadCliente = new Tela("Cadastro de Cliente", this);

         //independente da tela estar vis�vel ou n�o, a tela � movida para frente
         jdPane.moveToFront(telaCadCliente);
      }

      // mesmo anterior, por�m, ocorre quando o evento v�m do item fornecedor do menu...
      if (evt.getSource() == jmCadFornecedor) {
         if (telaCadFornecedor == null)
            telaCadFornecedor = new Tela("Cadastro de Fornecedor", this);

         jdPane.moveToFront(telaCadFornecedor);
      }
   }
   class Tela extends JInternalFrame {

	   //classe pai dos objetos que ser�o instanciadas por essa classe
	   private Menu telaPrincipal;

	   //m�todo construtor da tela
	   public Tela(String titulo, Menu telaPrincipal) {

	      //reescreve o m�todo construtor da classe pai, ajustando o t�tulo da janela (neste caso)
	      super(titulo,true,true,true,true);

	      
	      
	      setSize(300,200);
	      setVisible(true);

	      this.telaPrincipal = telaPrincipal;

	      telaPrincipal.jdPane.add(this);
	      
	   
	   }

	}
}