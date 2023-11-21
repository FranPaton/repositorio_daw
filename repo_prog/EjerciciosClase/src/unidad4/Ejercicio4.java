package unidad4;

/*
 * Escribe un programa que lea 10 números por teclado y que los almacene en un array.
 * Rota los elementos de un array una posición a la derecha. El ultimo numero pasa al primero.
 * Muestra el array
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		int[] arrayNumeros  = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		rotarDerechaArray(arrayNumeros);
		for (int i=0; i<=arrayNumeros.length - 1; i++) {
			System.out.printf("%d ", arrayNumeros[i]);
		}
	}
	
	public static void rotarDerechaArray (int[] arrayNumeros) {
		int auxFinal = arrayNumeros[arrayNumeros.length - 1];
		for(int i=arrayNumeros.length - 2; i>=0; i--) {
			arrayNumeros[i+1] = arrayNumeros[i];	
		}
		arrayNumeros[0] = auxFinal;	
	}

}
