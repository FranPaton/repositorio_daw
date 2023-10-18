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

public class Ejercicio4PedirNumeros {

	public static void main(String[] args) {

		int num = 0, cont = 0, min = 0, max = 0, suma = 0;
		double media = 0;
		Scanner entrada = new Scanner(System.in);
		String numIntroducidos = "";

		do {
			System.out.println("Introduce número (-1 para terminar): ");
			num = entrada.nextInt();
			if (num != -1) {
				cont++;
				if (cont == 1) {
					min = max = num;
					numIntroducidos = "" + num;
				} else if (num < min) {
					min = num;
				} else if (num > max) {
					max = num;
				}
				suma += num;		
				media = (double) suma / cont;
				if (cont != 1) {
					numIntroducidos += ", " + num;
				}
				
				
			}
		} while (num != -1);

		if(cont ==0) {
			System.out.println("No se ha introducido ningún número");
		} else {
			System.out.println("Números: " + numIntroducidos);
			System.out.println("\nMin: " + min + "\nMax: " + max + "\nSuma: " + suma + "\nMedia: " + media);
		}

		entrada.close();
	}
}
