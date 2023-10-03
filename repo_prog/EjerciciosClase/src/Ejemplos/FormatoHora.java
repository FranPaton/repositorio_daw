package Ejemplos;

import java.util.Scanner;

public class FormatoHora {

	public static void main(String[] args) {
		int hora, minuto, segundo;
		String formatoHora = " a.m.";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la hora: ");
		hora = entrada.nextInt();
		System.out.println("Introduce el mínuto: ");
		minuto = entrada.nextInt();
		System.out.println("Introduce el segundo: ");
		segundo = entrada.nextInt();
		
		
		if (hora > 12) {
			hora -= 12;
			formatoHora = " p.m.";		
		}
		
		System.out.println("Son las " + hora + ":" + minuto + ":" + segundo + formatoHora );
		
		

	}

}
