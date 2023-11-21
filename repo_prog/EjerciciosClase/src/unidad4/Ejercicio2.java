package unidad4;

/*
 * Define 3 arrays de 20 numeros enteros, con nombres numero, cuadrado y cubo
 * Carga el array numeros con 20 enteros aleatorios entre 0 y 100
 * En el array cuadrados se deben guardar los cuadrados del array numeros
 * En el array cubos se deben guardar los cubos del array numeros
 * Muestra el contenido de los 3 arrays en 3 columnas
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[] arrayNumeros = new int[20];
		int[] arrayCuadrados = new int[20];
		int[] arrayCubos = new int[20];
	
		for(int i=0; i<20; i++) {
			int num = (int)(Math.random() * 101);
			arrayNumeros[i] = num;
			arrayCuadrados[i] = num * num;
			arrayCubos[i] = num * num * num;
		}
		System.out.println("Número\tCuadrado Cubo");
		for(int i=0; i<20; i++) {
			System.out.printf("%d\t%d\t%d\n", arrayNumeros[i], arrayCuadrados[i], arrayCubos[i]); 
		}
	}
}


