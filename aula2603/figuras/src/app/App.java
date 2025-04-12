package app;

import figuras.Circulo;
import figuras.Retangulo;

public class App {
	public static void main(String[] args) {
		Circulo circ = new Circulo(2, 3, 5);
		Retangulo ret = new Retangulo(3, 2, 5, 6);
		
		System.out.println(circ.perimetro());
		System.out.println(circ.raio());
		
		System.out.println(ret.perimetro());
		System.out.println(ret.area());
	}
}
