package Interface;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import Dados.Memoria;

public class JanelaPrincipal extends JFrame {
	
	public JanelaPrincipal() {
		super("Fazendo Gol");
		
		organizar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(900,600);
		
		setVisible(true);
	}
	
	public void organizar() {
		setLayout(new BorderLayout());
		
		Memoria memoria = new Memoria();
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(900,80));
		display.setLocal(memoria.getPosicao());
		add(display,BorderLayout.NORTH);
		
		Gol gol = new Gol(memoria,display);
		gol.setPreferredSize(new Dimension(900,620));
		add(gol,BorderLayout.CENTER);
		
		Stop stop = new Stop();
		add(stop,BorderLayout.SOUTH);
		
	}

}
