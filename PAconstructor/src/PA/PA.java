package PA;

public class PA {
	
	private int primeiroTermo;
	private int razao;
	private int termoAtual;
	
	// construtor apenas com o primeiro termo e a razão da PA.
	public PA(int primeiroTermo, int razao) {
		this.primeiroTermo = primeiroTermo;
		this.razao = razao;
		this.termoAtual = this.primeiroTermo;
	}
	
	
	
	public int getPrimeiroTermo() {
		return primeiroTermo;
	}



	public void setPrimeiroTermo(int primeiroTermo) {
		this.primeiroTermo = primeiroTermo;
	}



	public int getRazao() {
		return razao;
	}



	public void setRazao(int razao) {
		this.razao = razao;
	}



	public int getTermoAtual() {
		return termoAtual;
	}



	public void setTermoAtual(int termoAtual) {
		this.termoAtual = termoAtual;
	}


	// metodo que mostra o termo atual e calcula oo proximo termo.
	public int proximoTermo() {
		int atual = this.termoAtual;
		this.termoAtual += this.razao;
		return atual;
	}
	
	
}
