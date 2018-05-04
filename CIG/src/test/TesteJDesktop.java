package test;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TesteJDesktop extends JFrame {

	private JDesktopPane desktop;
	
	
	public TesteJDesktop() {
		
		super ("Testando JInternalFrame contida em " +
	  "uma JDesktopPane");
		
		JMenuBar barra = new JMenuBar();
		
		JMenu arquivo = new JMenu ("Arquivo");	
		
		JMenuItem novo = new JMenuItem ("Novo");
		JMenuItem sair = new JMenuItem ("Sair");
		
		barra.add(arquivo);
		
		setJMenuBar(barra);
		
		desktop = new JDesktopPane();
		desktop.setBackground(Color.lightGray);
		desktop.setToolTipText("Eu sou a JDesktopPane. " +
		"Você pode utilizar meu menu.");
		this.getContentPane().add(desktop);
		
		novo.addActionListener(
				
		new ActionListener() {
			
				public void actionPerformed (ActionEvent evento) {
					
					JInternalFrame frame = new JInternalFrame ("Janela Interna", true, true, true, true);
					
					Container container = frame.getContentPane();
					
					JanelaInterna interna = new JanelaInterna();
					
					container.add(interna, BorderLayout.CENTER);
					
					frame.pack();
					frame.setVisible(true);
					desktop.add(frame);
					
					
				}
		}			
		);
		
		sair.addActionListener(
				
		new ActionListener() {
			
			public void actionPerformed (ActionEvent evento) {
				
				System.exit(0);
			}
		}
		);
		
		setSize (700, 600);
		setVisible(true);		
	}
	
	public static void main (String args[]) {
	
		TesteJDesktop aplicacao = new TesteJDesktop();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class JanelaInterna extends JPanel {
	
	private JTextArea areaTexto;
	
	public JanelaInterna() {
		
		areaTexto = new JTextArea(25,25);
		
		areaTexto.setLineWrap(true);
		
		areaTexto.setWrapStyleWord(true);
		
		areaTexto.setText("Este material destina-se a usu´arios da liguagem " +
				 "Java que pretendem incluir interfaces gr´aficas em suas aplica¸c~oes,"+
				 "sejam elas aut^onomas ou applets. Salientamos que ´e de grande valia ao " +
				 "usu´ario se este j´a estiver familiarizado com a Linguagem Java, pois " +
				 "o conte´udo desse material n~ao explana conceitos b´asicos, nem discute a " +
				 "sintaxe da Linguagem.");

		this.add(new JScrollPane(areaTexto));		
	}	
}