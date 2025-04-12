package elevador;

/**
 * classe para instanciar um elevador no predio.
 * @author 200035240
 *
 */


public class Elevador {

	private int andarAtual = 0;
	private int totalAndar;
	private int capacidade;
	private int presentes=0;
	
	/**
	 * construtor para adicionar a capacidade e o total de andares.
	 * @param totalAndar
	 * @param capacidade
	 */
	public Elevador(int totalAndar, int capacidade) {
		this.totalAndar = totalAndar;
		this.capacidade = capacidade;
	}
	
	
	
	public int getAndarAtual() {
		return andarAtual;
	}



	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}



	public int getTotalAndar() {
		return totalAndar;
	}



	public void setTotalAndar(int totalAndar) {
		this.totalAndar = totalAndar;
	}



	public int getCapacidade() {
		return capacidade;
	}



	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}



	public int getPresentes() {
		return presentes;
	}



	public void setPresentes(int presentes) {
		this.presentes = presentes;
	}


	/**
	 * metodo para adicionar uma pessoa dentro do elevador.
	 */
	public void entra() {
		if(this.presentes == this.capacidade) {
			System.out.println("Elevador cheio!!");
		}else {
			this.presentes ++;
			System.out.println("Mais uma pessoa entrou! total presentes: " + this.presentes);
		}
	}
	
	/**
	 * metodo para tirar uma pessoa do elevador.
	 */
	public void sai() {
		if(this.presentes == 0) {
			System.out.println("Elevador vazio!!");
		}else {
			this.presentes --;
			System.out.println("Mais uma pessoa saiu! total presentes: " + this.presentes);
		}
	}
	
	/**
	 * metodo para subir um andar.
	 */
	public void sobe() {
		if(andarAtual == totalAndar) {
			System.out.println("Ja estamos no ultimo andar!");
		}else {
			this.andarAtual ++;
			System.out.println("Subimos 1 andar! andar atual: " + andarAtual);
		}
	}
	
	/**
	 * metodo para descer um andar.
	 */
	public void desce() {
		if(andarAtual == 0) {
			System.out.println("Ja estamos no terreo");
		}else {
			this.andarAtual --;
			System.out.println("Descemos 1 andar! andar atual: " + andarAtual);
		}
	}
}
