package unidad4;

/*
 * ESCRIBE UN PROGRAMA QUE LEA 10 NUMEROS Y LUEGO LOS MUESTRE EN ORDEN INVERSO
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] arrayNumeros = UtilidadesUnidad4.rellenarArrayEnteros(10);
		for(int i=9; i>=0; i--) {
			System.out.printf("%d ", arrayNumeros[i]);
		}
	}

}
