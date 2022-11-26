package Dados;

import java.util.ArrayList;

public class Memoria {
	
	
	private ArrayList <String> posicao;
	
	public Memoria() {
		posicao = new ArrayList <String>();
	}
	
	public String getPosicao() {
		
		String resultado = "";
		
		for(String pos : posicao) {
			
			resultado += pos;
		}
		return resultado;
	}
	
	public void setPosicao(String pos) {
		
		posicao.add(pos);
	}
}
