package ejemplos;

import java.util.Scanner;

public class EjemploScannerHola {

	public static void main(String[] args) {
		String nombre;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		nombre = entrada.nextLine();
		System.out.println(String.format("¡Hola, %s!", nombre));
		entrada.close();
		
		
	}

}
