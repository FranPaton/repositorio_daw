package com.franpaton.tarea2;

import java.util.Scanner;

/*
	Construye un programa que simule el juego de la adivinanza de un número. El ordenador debe generar un número aleatorio entre 1 y 100 
	y el usuario tiene cinco oportunidades para acertarlo. Después de cada intento el programa debe indicarle al usuario si el número 
	introducido por él es mayor, menor o igual al número a adivinar, y el número de intentos restantes.
	Nota: para generar el valor aleatorio puede emplearse la sentencia:
	int aleatorio = (int) (100*Math.random()+1);
*/

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numRandom = (int)(100 * Math.random() + 1);
		int numEntrada;
		int numIntentos = 5;
		Scanner entrada = new Scanner(System.in);
		boolean encontrado = false;
		
		do {
			System.out.println("Introduce un número del 1 al 100 (" + numIntentos + " intentos): ");
			if (entrada.hasNextInt()){  					//antes de guardar el contenido del scanner, se comprueba que es número entero.
				numEntrada = entrada.nextInt();
				
				if (numEntrada >= 1 && numEntrada <= 100 ) {
					if (numRandom < numEntrada) {			//si el número es menor
						System.out.println("Menor.");     
							
					} else if (numRandom > numEntrada) {    //si el número es mayor
						System.out.println("Mayor.");     
						
					} else {                         		//si no es mayor ni menor es que es igual y se ha encontrado el número
						encontrado = true;
						System.out.println("Ganaste, el número era " + numEntrada);  
					}	
				} else {									// si se introduce un número menor que 1 y mayor que 100
					System.out.println("Error, introduce un número entero entre 1 y 100");   
				}
				
			} else {                						// si lo que se introduce no es un número entero
				System.out.println("Error, introduce un número correcto.");
				entrada.next();  							//limpia el contenido del scanner si no se ha introducido un número entero para que lo vuelva a pedir.
				
			}
			numIntentos--;
			
		} while (numIntentos > 0 && !encontrado);
		
		if (!encontrado) {
			System.out.println("Terminado, no has encontrado el número. El número era " + numRandom);
		}
		
		entrada.close();
			
	}
		
}
