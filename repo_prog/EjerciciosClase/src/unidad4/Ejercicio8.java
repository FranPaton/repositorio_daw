package unidad4;
import boletin3.FuncionesMatematicas;
/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
que los almacene en un array. El programa debe ser capaz de pasar todos los
números pares a las primeras posiciones del array (del 0 en adelante) y todos
los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		int longArray = 20;
<<<<<<< HEAD
		long [] arrayNumeros = FuncionesMatematicas.getRandomArrayLong(longArray, 0, 100);
		long[] arrayPares = new long[longArray];
		long[] arrayImpares = new long[longArray];
		//long[] arrayNumeros = {1,3,5,7,9,11};
=======
		long [] arrayNumeros = FuncionesMatematicas.getRandomArray(longArray, 0, 100);
		//long[] arrayNumeros = {1,2,3,4,5,6,7,8,9};
		long[] arrayImpares = new long[longArray];
>>>>>>> 82e3c504551fd8d71f8fb0e261e02d5b6b3e74f3
		
		for(int i=0;i<=longArray - 1; i++) {
			System.out.print(arrayNumeros[i] + " ");
		}
		
<<<<<<< HEAD
		System.out.println("\n");
		int contPares = 0, contImpares = 0;
		int j = 0;
		int n = longArray - 1;
		int contIteraciones=0;
		/*for(int i=0; i<=longArray-1; i++) {
			if(FuncionesMatematicas.esPar(arrayNumeros[i])) {
				arrayPares[contPares] = arrayNumeros[i];
				contPares++;
			} else {
				if(j==0) {
					arrayPares[n] = arrayNumeros[i];
				} else {
					for(int k=j-1; k>=0; k--) {
						arrayPares[n-k-1] = arrayPares[n-k];
					}
					arrayPares[n] = arrayNumeros[i];
				}							
				j++; 									
=======
		int contImpares = 0, contPares = 0;
		for(int i=0; i<=longArray-1; i++) {
			if(!FuncionesMatematicas.esPar(arrayNumeros[i])) {
				arrayImpares[contImpares] = arrayNumeros[i];
				contImpares++;
			} else {
				arrayNumeros[contPares] = arrayNumeros[i];
				contPares++;
>>>>>>> 82e3c504551fd8d71f8fb0e261e02d5b6b3e74f3
			}
			contIteraciones++;
		}*/
		
		for(int i=0; i<=longArray-1; i++) {
			if(FuncionesMatematicas.esPar(arrayNumeros[i])) {
				arrayPares[contPares] = arrayNumeros[i];
				contPares++;
			} else {
				
				arrayImpares[contImpares] = arrayNumeros[i];
			}
			
		}
<<<<<<< HEAD
		for(int i=0; i<=contPares; i++) {
			arrayNumeros[i] = arrayPares[i];	
		}
		
		for(int i=contImpares; i<=longArray-1; i++) {
			arrayNumeros[i] = arrayImpares[i];	
		}
		for (int i = 0; i < arrayPares.length; i++) {
			System.out.printf("%d ", arrayPares[i]);		
		}
		System.out.println("\nIteraciones " + contIteraciones);
		
		
=======
		System.out.println("");
		for (int i = contPares, j=0; i < arrayNumeros.length; i++, j++) {
			arrayNumeros[i] = arrayImpares[j];
		}
		System.out.println("");
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.printf("%d ",arrayNumeros[i]);
		}
>>>>>>> 82e3c504551fd8d71f8fb0e261e02d5b6b3e74f3
	
	}
	
	

}
