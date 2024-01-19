package unidad4;

import java.util.Scanner;

import boletin3.FuncionesMatematicas;

/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		long min = 0, max = 20, numOld, numNew;
		String[] arrayStrings = new String[3];
		System.out.println("Array strings 1"+ arrayStrings[0]);
		int longArray = 100, contCambiados = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Introduce valor a cambiar: ");
		numOld = scn.nextLong();
		System.out.print("Introduce nuevo valor: ");
		numNew = scn.nextLong();
		long[] arrayNumeros = FuncionesMatematicas.getRandomArrayLong(longArray, min, max);	
		for(int i=0; i<=longArray-1; i++) {
			System.out.printf("%d ", arrayNumeros[i]);
		}
		System.out.println("");
		for (int i=0; i<=longArray-1; i++) {
			if(arrayNumeros[i] == numOld) {
				arrayNumeros[i] = numNew;
				System.out.printf("\"%d\" ",arrayNumeros[i]);
				contCambiados++;
			} else {
				System.out.printf("%d ", arrayNumeros[i]);
				
			}
		}
		System.out.println("\nNúmeros cambiados: " + contCambiados);
		scn.close();
	}

}
