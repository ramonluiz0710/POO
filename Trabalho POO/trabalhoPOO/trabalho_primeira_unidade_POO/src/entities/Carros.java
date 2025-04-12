package entities;

import java.util.Random;

public class Carros {
	private int posInicial = 0;
	private int posAtual = posInicial;
	
	
	public Carros() {
		
	}
	
	public Carros(int posInicial, int posAtual) {
		this.posInicial = posInicial;
		this.posAtual = posAtual;
	}


	public int getPosAtual() {
		return posAtual;
	}


	public void setPosAtual(int posAtual) {
		this.posAtual = posAtual;
	}
	
	public int movimenta() {
		Random rd = new Random();
		int proxPos = rd.nextInt(4);
		while(proxPos == 0) {
			 proxPos = rd.nextInt(4);
		}
		return this.posAtual += proxPos;
	}
	
	
	
}
