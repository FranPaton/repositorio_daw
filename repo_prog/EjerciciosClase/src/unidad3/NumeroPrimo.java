package unidad3;

import java.util.Scanner;

public class NumeroPrimo {

	
	
	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		boolean esPrimo = true;
		
		System.out.println("Introduce un número: ");
		num = entrada.nextInt();
		
		esPrimo = esPrimo(num);
		System.out.printf((esPrimo ? "%d es primo" : "%d no es primo"), num);
		entrada.close();
	}

	private static boolean esPrimo(int num) {
		int i = 2;
		boolean esPrimo = true;
		while(i < num && esPrimo) {
			if (num % i == 0) {
				esPrimo = false;
			}	
			i++;
		}
		return esPrimo;
	}

}
