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
		
		
		for(int i=0;i<=longArray - 1; i++) {
			System.out.print(arrayNumeros[i] + " ");
		}
		
		for(int i=0; i<=longArray-1; i--) {
			if(FuncionesMatematicas.esPar(arrayNumeros[i])) {
				
			}
		}
	
	}
	
	

}
