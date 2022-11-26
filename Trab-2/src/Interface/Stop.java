package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Stop extends JPanel implements ActionListener {

	private JTextField nome;
	private Gol gol;
	
	public Stop() {
		
		Botao b2 = new Botao("Stop", 1000, Color.BLACK);
		b2.addActionListener(this);
		
		Goleiro goleiro = new Goleiro("Mario");
		nome = new JTextField();
		nome.setText(goleiro.getNome());
		
		add(b2);
		
	}
	

	public void actionPerformed(ActionEvent e) {
		
		JButton b2 = (JButton) e.getSource();
		
		String numero = String.valueOf(+gol.getDef()+gol.getFora()+gol.getGol()+gol.getTrave());
		
		b2.setText(nome.getText()+ numero);
		
		
		nome.setText(b2.getText());
	}

	
	
	public JTextField getNome() {
		return nome;
	}


	public void setNome(JTextField nome) {
		this.nome = nome;
	}


	public Gol getGol() {
		return gol;
	}


	public void setGol(Gol gol) {
		this.gol = gol;
	}

	
}
