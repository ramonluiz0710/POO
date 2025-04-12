package APP;

import entities.Carros;

public class Aplication {

	public static void main(String[] args) {
		Carros carro1 = new Carros();
		Carros carro2 = new Carros();
		
		System.out.println("Largada!!!");
		
		System.out.println("--------------------");
		System.out.println("#");
		System.out.println("#");
		System.out.println("--------------------");
		
		
		while(carro1.getPosAtual() < 20 && carro2.getPosAtual() < 20){
			
			carro1.movimenta();
			carro2.movimenta();
			
			System.out.println("--------------------");
			
			for(int j = 1; j < carro1.getPosAtual(); j++) {
				System.out.print(" ");
			}
			System.out.println("#");
			
			for(int k = 1; k < carro2.getPosAtual(); k++) {
				System.out.print(" ");
			}
			System.out.println("#");
			
			System.out.println("--------------------");
			
			System.out.println();
		}
		if(carro1.getPosAtual() > carro2.getPosAtual()) {
			System.out.println("Carro 1 foi o campeao!!");
		}else if(carro2.getPosAtual() > carro1.getPosAtual()) {
			System.out.println("Carro 2 foi o campeao!!");
		}else {
			System.out.println("Empate!!");
		}
	}

}
