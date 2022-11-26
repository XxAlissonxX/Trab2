package Interface;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Display extends JPanel {
		
	private JTextField local;
	
	public Display() {
		local = new JTextField (50);
		local.setHorizontalAlignment(local.RIGHT);
		local.setEnabled(false);
		setBackground(Color.BLACK);
		
		add(local);
		
	}
	
	public void setLocal(String texto) {
		
		local.setText(texto);
	}

	public JTextField getLocal() {
		return local;
	}

	public void setLocal(JTextField  local) {
		this.local = local;
	}
	
}
