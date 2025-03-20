package app;

import entities.Triangulo;

public class App {

	public static void main(String[] args) {
	
		Triangulo t1 = new Triangulo(12, 33, 34);
		
		System.out.println(t1.perimetro());

	}

}
