package boletin3;

/*
 
 Implementa un programa con tres funciones:
 void imprimePositivo(int p): Imprime el valor p. Lanza ‘Exception’ si p < 0
 void imprimeNegativo(int n): Imprime el valor n. Lanza ‘Exception’ si p >= 0
 La función main para realizar pruebas. Puedes llamar a ambas funciones
varias veces con distintos valores, hacer un bucle para pedir valores por
teclado y pasarlos a las funciones. Maneja las posibles excepciones.

 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		try {
			imprimeNegativo(-1);
			imprimePositivo(5);
			imprimeNegativo(-2);
			imprimePositivo(-3);
		} catch(Exception e){
			System.out.printf("\n%s", e.getMessage());
		}
		
		

	}
	
	private static void imprimePositivo(int p) throws Exception {
		if (p < 0 ) throw new Exception("Error, el número no es positivo");
		System.out.printf("Numero positivo: %d\n", p);
	}
	private static void imprimeNegativo(int p) throws Exception {
		if (p >= 0 ) throw new Exception("Error, el número no es negativo");
		System.out.printf("Numero negativo: %d\n", p);		
	}
	
	

}

