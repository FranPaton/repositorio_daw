package com.franpaton.tarea2;

import java.util.Scanner;

/*
	Pedir números al usuario hasta que el usuario introduzca un -1. Al terminar, mostrará lo siguiente:
	mayor número introducido
	menor número introducido
	suma de todos los números
	media aritmética de todos los números
	número -1 no contara como número.  
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num = 0, cont = 0, min = 0, max = 0;
		double suma = 0, media = 0;
		Scanner entrada = new Scanner(System.in);
		
		do { 
			System.out.println("Introduce número (-1 para terminar): ");
			if (!entrada.hasNextInt()) {
				System.out.println("Error, introduce un número correcto");
				entrada.next();
			} else {
				num = entrada.nextInt();
				if (num != - 1) {
					if (cont == 0) {
						min = max = num;
						
					} else if (num < min) {
						min = num;
					} else if (num > max) {
						max = num;
					}
									
					suma += num;
					cont++;	
					media = suma / cont; 
						
				}
			}
					
		} while (num != -1);
			
		System.out.println("\nMin: " + min
					+ "\nMax: " + max
					+ "\nSuma: " + suma
					+ "\nMedia: " + media);
		
		entrada.close();

	}
			
}


