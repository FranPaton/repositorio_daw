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
		long [] arrayNumeros = FuncionesMatematicas.getRandomArrayLong(longArray, 0, 100);
		long[] arrayPares = new long[longArray];
		long[] arrayImpares = new long[longArray];
		//long[] arrayNumeros = {1,3,5,7,9,11};
		
		for(int i=0;i<=longArray - 1; i++) {
			System.out.print(arrayNumeros[i] + " ");
		}
		
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
		
		
	
	}
	
	

}
