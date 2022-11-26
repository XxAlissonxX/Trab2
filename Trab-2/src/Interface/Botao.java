package Interface;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;

public class Botao extends JButton {

	
	public Botao (String posicao,int numero,Color cor) {	
		
		setText(posicao);
		setOpaque(true);
		setBackground(cor);
	}
	
	
	

	
	
}
