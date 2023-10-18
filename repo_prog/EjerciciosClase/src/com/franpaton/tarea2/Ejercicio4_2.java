package com.franpaton.tarea2;

import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		
		int num1 = 0, cont = 0, min = 0, max = 0;
		double suma = 0, media = 0;
		Scanner entrada = new Scanner(System.in);
		
		do { 
			System.out.println("Introduce número (-1 para terminar): ");
			if (!entrada.hasNextInt()) {
				System.out.println("Error, introduce un número correcto");
				entrada.next();
			} else {
				num1 = entrada.nextInt();
				if (num1 != - 1) {
					if (cont == 0) {
						min = num1;
						max = num1;
					}
					cont++;
					if (num1 < min) {
						min = num1;
					}
					if (num1 > max) {
						max = num1;
					}
					suma += num1;
					media = (double)suma / cont; 
						
				}
			}
					
		} while (num1 != -1);
			
		System.out.println("\nMin: " + min
					+ "\nMax: " + max
					+ "\nSuma: " + suma
					+ "\nMedia: " + media);
		
		entrada.close();

	}
}


