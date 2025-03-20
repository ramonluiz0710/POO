package entities;

public class Triangulo {

	private int a, b, c;

	public Triangulo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int perimetro() {
		return this.a + this.b + this.c;
	}
}
