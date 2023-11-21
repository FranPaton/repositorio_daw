package unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilidadesUnidad4 {
	public static int[] rellenarArrayEnteros(int longArray) {
		Scanner scan = new Scanner(System.in);
		int[] arrayNumeros = new int[longArray];
		boolean correcto = false;
		for (int i=0; i<=longArray-1; i++) {		
			do {
				System.out.printf("Introduce número %d de %d: ", i + 1, longArray);
				try {
					arrayNumeros[i] = scan.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("Error, introduce un número correcto");
					scan.next();
					correcto = false;
				}
			}while (!correcto);
		}
		scan.close();
		return arrayNumeros;
	}
	
	
}