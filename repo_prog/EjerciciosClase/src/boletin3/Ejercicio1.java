package boletin3;

import java.util.Scanner;

/*
 
 Crea una aplicación que muestre el siguiente menú:
1.- Añadir
2.- Borrar
3.- Modificar
4.- Mostrar por pantalla
5.- Finalizar
Este menú se mostrará indefinidamente tras la elección de opción hasta que se
pulse finalizar, o bien se introduzca una opción no contemplada, de lo cual
informará y mostrará de nuevo el menú.
El menú debe de estar en un método que se llame mostrarMenu que devolverá
el número con la última opción seleccionada y que será llamado desde el main. 
 
 */

public class Ejercicio1 {

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
		entrada.close();
		return (opcionMenu);
					
	}

}
