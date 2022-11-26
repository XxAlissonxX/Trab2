package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JPanel;

import Dados.Memoria;

public class Gol extends JPanel implements ActionListener{
	
	private Memoria memoria;
	private Display display;
	private int def;
	private int trave;
	private int fora;
	private int gol ;
	
	
	public Gol(Memoria memoria,Display display) {
		
		this.memoria = memoria;
		this.display = display;
		this.gol = gol;
		this.trave = trave;
		this.fora = fora;
		this.def = def;
		
		setLayout(new GridLayout(9,17));
		
		
		add(criarBotao("Fora",1,Color.red));
		add(criarBotao("Fora",2,Color.red));
		add(criarBotao("Fora",3,Color.red));
		add(criarBotao("Fora",4,Color.red));
		add(criarBotao("Fora",5,Color.red));
		add(criarBotao("Fora",6,Color.red));
		add(criarBotao("Fora",7,Color.red));
		add(criarBotao("Fora",8,Color.red));
		add(criarBotao("Fora",9,Color.red));
		add(criarBotao("Fora",10,Color.red));
		add(criarBotao("Fora",11,Color.red));
		add(criarBotao("Fora",12,Color.red));
		add(criarBotao("Fora",13,Color.red));
		add(criarBotao("Fora",14,Color.red));
		add(criarBotao("Fora",15,Color.red));
		add(criarBotao("Fora",16,Color.red));
		add(criarBotao("Fora",17,Color.red));
		add(criarBotao("Fora",18,Color.red));
		add(criarBotao("Trave",19,Color.ORANGE));
		add(criarBotao("Trave",20,Color.ORANGE));
		add(criarBotao("Trave",21,Color.ORANGE));
		add(criarBotao("Trave",22,Color.ORANGE));
		add(criarBotao("Trave",23,Color.ORANGE));
		add(criarBotao("Trave",24,Color.ORANGE));
		add(criarBotao("Trave",25,Color.ORANGE));
		add(criarBotao("Trave",26,Color.ORANGE));
		add(criarBotao("Trave",27,Color.ORANGE));
		add(criarBotao("Trave",28,Color.ORANGE));
		add(criarBotao("Trave",29,Color.ORANGE));
		add(criarBotao("Trave",30,Color.ORANGE));
		add(criarBotao("Trave",31,Color.ORANGE));
		add(criarBotao("Trave",32,Color.ORANGE));
		add(criarBotao("Trave",33,Color.ORANGE));
		add(criarBotao("Fora",34,Color.red));
		add(criarBotao("Fora",35,Color.red));
		add(criarBotao("Trave",36,Color.ORANGE));
		add(criarBotao("Gol",37,Color.GREEN));
		add(criarBotao("Gol",38,Color.GREEN));
		add(criarBotao("Gol",39,Color.GREEN));
		add(criarBotao("Gol",40,Color.GREEN));
		add(criarBotao("Gol",41,Color.GREEN));
		add(criarBotao("Gol",42,Color.GREEN));
		add(criarBotao("Gol",43,Color.GREEN));
		add(criarBotao("Gol",44,Color.GREEN));
		add(criarBotao("Gol",45,Color.GREEN));
		add(criarBotao("Gol",46,Color.GREEN));
		add(criarBotao("Gol",47,Color.GREEN));
		add(criarBotao("Gol",48,Color.GREEN));
		add(criarBotao("Gol",49,Color.GREEN));
		add(criarBotao("Trave",50,Color.ORANGE));
		add(criarBotao("Fora",51,Color.red));
		add(criarBotao("Fora",52,Color.red));
		add(criarBotao("Trave",53,Color.ORANGE));
		add(criarBotao("Gol",54,Color.GREEN));
		add(criarBotao("Gol",55,Color.GREEN));
		add(criarBotao("Gol",56,Color.GREEN));
		add(criarBotao("Gol",57,Color.GREEN));
		add(criarBotao("Gol",58,Color.GREEN));
		add(criarBotao("Gol",59,Color.GREEN));
		add(criarBotao("Gol",60,Color.GREEN));
		add(criarBotao("Gol",61,Color.GREEN));
		add(criarBotao("Gol",62,Color.GREEN));
		add(criarBotao("Gol",63,Color.GREEN));
		add(criarBotao("Gol",64,Color.GREEN));
		add(criarBotao("Gol",65,Color.GREEN));
		add(criarBotao("Gol",66,Color.GREEN));
		add(criarBotao("Trave",67,Color.ORANGE));
		add(criarBotao("Fora",68,Color.red));
		add(criarBotao("Fora",69,Color.red));
		add(criarBotao("Trave",70,Color.ORANGE));
		add(criarBotao("Gol",71,Color.GREEN));
		add(criarBotao("Gol",72,Color.GREEN));
		add(criarBotao("Gol",73,Color.GREEN));
		add(criarBotao("Gol",74,Color.GREEN));
		add(criarBotao("Gol",75,Color.GREEN));
		add(criarBotao("Gol",76,Color.GREEN));
		add(criarBotao("Gol",77,Color.GREEN));
		add(criarBotao("Gol",78,Color.GREEN));
		add(criarBotao("Gol",79,Color.GREEN));
		add(criarBotao("Gol",80,Color.GREEN));
		add(criarBotao("Gol",81,Color.GREEN));
		add(criarBotao("Gol",82,Color.GREEN));
		add(criarBotao("Gol",83,Color.GREEN));
		add(criarBotao("Trave",84,Color.ORANGE));
		add(criarBotao("Fora",85,Color.red));
		add(criarBotao("Fora",86,Color.red));
		add(criarBotao("Trave",87,Color.ORANGE));
		add(criarBotao("Gol",88,Color.GREEN));
		add(criarBotao("Gol",89,Color.GREEN));
		add(criarBotao("Gol",90,Color.GREEN));
		add(criarBotao("Gol",91,Color.GREEN));
		add(criarBotao("Gol",92,Color.GREEN));
		add(criarBotao("Gol",93,Color.GREEN));
		add(criarBotao("Gol",94,Color.GREEN));
		add(criarBotao("Gol",95,Color.GREEN));
		add(criarBotao("Gol",96,Color.GREEN));
		add(criarBotao("Gol",97,Color.GREEN));
		add(criarBotao("Gol",98,Color.GREEN));
		add(criarBotao("Gol",99,Color.GREEN));
		add(criarBotao("Gol",100,Color.GREEN));
		add(criarBotao("Trave",101,Color.ORANGE));
		add(criarBotao("Fora",102,Color.red));
		add(criarBotao("Fora",103,Color.red));
		add(criarBotao("Trave",104,Color.ORANGE));
		add(criarBotao("Gol",105,Color.GREEN));
		add(criarBotao("Gol",106,Color.GREEN));
		add(criarBotao("Gol",107,Color.GREEN));
		add(criarBotao("Gol",108,Color.GREEN));
		add(criarBotao("Gol",109,Color.GREEN));
		add(criarBotao("Gol",110,Color.GREEN));
		add(criarBotao("Gol",111,Color.GREEN));
		add(criarBotao("Gol",112,Color.GREEN));
		add(criarBotao("Gol",113,Color.GREEN));
		add(criarBotao("Gol",114,Color.GREEN));
		add(criarBotao("Gol",115,Color.GREEN));
		add(criarBotao("Gol",116,Color.GREEN));
		add(criarBotao("Gol",117,Color.GREEN));
		add(criarBotao("Trave",118,Color.ORANGE));
		add(criarBotao("Fora",119,Color.red));
		add(criarBotao("Fora",120,Color.red));
		add(criarBotao("Trave",121,Color.ORANGE));
		add(criarBotao("Gol",122,Color.GREEN));
		add(criarBotao("Gol",123,Color.GREEN));
		add(criarBotao("Gol",124,Color.GREEN));
		add(criarBotao("Gol",125,Color.GREEN));
		add(criarBotao("Gol",126,Color.GREEN));
		add(criarBotao("Gol",127,Color.GREEN));
		add(criarBotao("Gol",128,Color.GREEN));
		add(criarBotao("Gol",129,Color.GREEN));
		add(criarBotao("Gol",130,Color.GREEN));
		add(criarBotao("Gol",131,Color.GREEN));
		add(criarBotao("Gol",132,Color.GREEN));
		add(criarBotao("Gol",133,Color.GREEN));
		add(criarBotao("Gol",134,Color.GREEN));
		add(criarBotao("Trave",135,Color.ORANGE));
		add(criarBotao("Fora",136,Color.red));
		add(criarBotao("Fora",137,Color.red));
		add(criarBotao("Trave",138,Color.ORANGE));
		add(criarBotao("Gol",139,Color.GREEN));
		add(criarBotao("Gol",140,Color.GREEN));
		add(criarBotao("Gol",141,Color.GREEN));
		add(criarBotao("Gol",142,Color.GREEN));
		add(criarBotao("Gol",143,Color.GREEN));
		add(criarBotao("Gol",144,Color.GREEN));
		add(criarBotao("Gol",145,Color.GREEN));
		add(criarBotao("Gol",146,Color.GREEN));
		add(criarBotao("Gol",147,Color.GREEN));
		add(criarBotao("Gol",148,Color.GREEN));
		add(criarBotao("Gol",149,Color.GREEN));
		add(criarBotao("Gol",150,Color.GREEN));
		add(criarBotao("Gol",151,Color.GREEN));
		add(criarBotao("Trave",152,Color.ORANGE));
		add(criarBotao("Fora",153,Color.red));
			
	}
	
	public Botao criarBotao(String posicao,int numero,Color cor) {
	
		Botao b = new Botao(posicao,numero,cor);
		
		b.addActionListener(this);
		return b;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		memoria.setPosicao(b.getText());
		display.setLocal(memoria.getPosicao());
		
		if(memoria.getPosicao() == "Trave") {
			
			this.setTrave(this.getTrave()+1);
		}else if(memoria.getPosicao() == "Fora") {
			
			this.setFora(this.getFora()+1);
		}else if(memoria.getPosicao() == "Gol") {
			
			this.setGol(this.getGol()+1);
		}if(memoria.getPosicao() == "Defesa") {
			
			this.setDef(this.getDef()+1);
		}
		
		System.out.println(b.getText());
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getTrave() {
		return trave;
	}

	public void setTrave(int trave) {
		this.trave = trave;
	}

	public int getFora() {
		return fora;
	}

	public void setFora(int fora) {
		this.fora = fora;
	}

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

	
	
}
