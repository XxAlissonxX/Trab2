package Interface;

import javax.swing.JLabel;

public class Goleiro {
	
	private int maoDireita;
	private int maoEsquerda;
	private String  nome;
	
	public Goleiro( String nome) {
		
		
		this.maoDireita = maoDireita;
		this.maoEsquerda = maoEsquerda;
		this.nome = nome;
		
		maoDireita = 1;
		maoEsquerda = 2;
	}

	public int getMaoDireita() {
		return maoDireita;
	}

	public void setMaoDireita(int maoDireita) {
		this.maoDireita = maoDireita;
	}

	public int getMaoEsquerda() {
		return maoEsquerda;
	}

	public void setMaoEsquerda(int maoEsquerda) {
		this.maoEsquerda = maoEsquerda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
