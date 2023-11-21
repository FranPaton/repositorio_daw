package unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribe un programa que pida 10 numeros por teclado y los muestre indicando el numero minimo y el maximo
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrayNumeros = new int[10];
		boolean correcto = false;
		int min = 0, max = 0;
		//int indiceMin = 0, indiceMax = 0;
		for (int i=0; i<=9; i++) {		
			do {
				try {
					System.out.printf("Introduce número %d de 10: ", i + 1);
					arrayNumeros[i] = scan.nextInt();
					correcto = true;
					if(i == 0) {
						min = max = arrayNumeros[0];
						//indiceMin = indiceMax = 0;
					} else {
						if(arrayNumeros[i] > max) {
							//indiceMax = i;
							max = arrayNumeros[i];
						} else if (arrayNumeros[i] < min) {
							//indiceMin = i;
							min = arrayNumeros[i];
						}
						
					}
				} catch (InputMismatchException e) {
					System.out.println("Error, introduce un número correcto");
					correcto = false;
					scan.next();
				}
			}while (!correcto);
		}
		
		for(int i=0; i<=9; i++) {
			String salida = arrayNumeros[i] + "";
			//System.out.println(arrayNumeros[i]);
			if(arrayNumeros[i] == min) {
				salida += " Mínimo";
			}
			if(arrayNumeros[i] == max) {
				salida += " Máximo";
			}
			System.out.println(salida);	
		}
		//System.out.printf("\nMin: %d, Max: %d", indiceMin, indiceMax);

	}

}
