package figuras;

public class Circulo {
	private int x;
	private int y;
	private double raio;
	
	
	public Circulo(int x, int y, double raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}
	
	
	public double perimetro() {
		return 2 * 3.14 * this.raio;
	}
	
	public double raio() {
		return 3.14 * (this.raio * this.raio);
	}
}
