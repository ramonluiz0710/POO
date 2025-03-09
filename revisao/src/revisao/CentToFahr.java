package revisao;

import java.util.Scanner;

public class CentToFahr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int graus = sc.nextInt();
		
		System.out.println(fahr(graus));

	}
	
	public static int fahr(int graus) {
		return ((9*graus)+160)/5;
	}

}
