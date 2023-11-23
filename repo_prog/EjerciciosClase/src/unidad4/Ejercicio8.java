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
		long [] arrayNumeros = FuncionesMatematicas.getRandomArray(longArray, 0, 100);
		//long[] arrayNumeros = {1,2,3,4,5,6,7,8,9};
		long[] arrayImpares = new long[longArray];
		
		for(int i=0;i<=longArray - 1; i++) {
			System.out.print(arrayNumeros[i] + " ");
		}
		
		int contImpares = 0, contPares = 0;
		for(int i=0; i<=longArray-1; i++) {
			if(!FuncionesMatematicas.esPar(arrayNumeros[i])) {
				arrayImpares[contImpares] = arrayNumeros[i];
				contImpares++;
			} else {
				arrayNumeros[contPares] = arrayNumeros[i];
				contPares++;
			}
		}
		System.out.println("");
		for (int i = contPares, j=0; i < arrayNumeros.length; i++, j++) {
			arrayNumeros[i] = arrayImpares[j];
		}
		System.out.println("");
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.printf("%d ",arrayNumeros[i]);
		}
	
	}
	
	

}
