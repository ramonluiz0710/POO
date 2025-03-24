package APP;

import java.util.Scanner;

import PA.PA;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//objeto de PA instanciado com o construtor do primeiro termo e da razao.
		PA pa1 = new PA(3, 2);
		
		// numero de termos da PA definido pelo usuario
		System.out.print("Quantos termos terao a PA? ");
		int n = sc.nextInt();
		
		// chamando loop com o metodo do proximo termo;.
		for(int i = 0; i<n; i++) {
			System.out.println(pa1.proximoTermo());
		}
		
		
		// redefinindo o primeiro termo da PA.
		System.out.print("Qual o primeiro termo da PA? ");
		int primeiroTermo = sc.nextInt();
		pa1.setTermoAtual(primeiroTermo);
		
		// redefinindo a razão da PA. 
		System.out.print("Qual a razao termo da PA? ");
		int razao = sc.nextInt();
		pa1.setRazao(razao);
		
		// chamando novamente o loop com o metodo do proximo termo.
		for(int i = 0; i<n; i++) {
			System.out.println(pa1.proximoTermo());
		}
		
		sc.close();
	}

}
