package revisao;

import java.util.Scanner;

public class HoraSegundos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora, minuto, segundos;
		
		System.out.print("Digite o horario do dia 'H M S': ");
		hora = sc.nextInt();
		minuto = sc.nextInt();
		segundos = sc.nextInt();
		
		System.out.println("A hora " + hora + ":" + minuto + ":" + segundos + " sao " + conversor(hora, minuto, segundos) + " Segundos");
		sc.close();
	}

	public static int conversor(int hora, int minuto, int segundos) {
		return (hora * 3600) + (minuto * 60) + segundos;
	}
}
