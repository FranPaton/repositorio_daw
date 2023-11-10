package boletin3;

import java.util.Scanner;

/*
 
 Crea un método adicional en el ejercicio anterior que sea capaz de insertar 10
saltos de línea en la salida estándar. Utilízalo cuando creas que es necesario en
la aplicación
 
 */

public class Ejercicio2 {

public static void main(String[] args) {
		
		int opcionMenu;
		do {
			opcionMenu = mostrarMenu();
			switch (opcionMenu) {
				case 1: 
					System.out.println("Opción 1 - Añadir");
					break;
				
				case 2: 
					System.out.println("Opción 2 - Borrar");
					break;
				
				case 3:
					System.out.println("Opción 3 - Modificar");
					break;
				
				case 4: 
					System.out.println("Opción 4 - Mostrar por pantalla");
					break;
				
				case 5: 
					System.out.println("Opción 5 - Finalizar");
					break;
				
				default: 
					System.out.println("Opción no valida. Por favor, introduce una opción correcta.");
					break;
				
			}
			saltosLinea(3);
			
		} while (opcionMenu != 5);
		

	}
	
	private static int mostrarMenu () {
		int opcionMenu = 0;
		Scanner entrada = new Scanner (System.in);
		System.out.println("1. Añadir"
				+ "\n2. Borrar"
				+ "\n3. Modificar"
				+ "\n4. Mostrar por pantalla"
				+ "\n5. Salir");
		opcionMenu = entrada.nextInt();
		//entrada.close();
		return (opcionMenu);
					
	}
	
	private static void saltosLinea (int numSaltos) {
		
		String saltos = "";
		for(int i = 1; i <= numSaltos; i++) {
			saltos+="\n";
		}		
		System.out.print(saltos);	
	}

}
