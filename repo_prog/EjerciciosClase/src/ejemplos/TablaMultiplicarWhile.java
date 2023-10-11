package ejemplos;

/*

Dado un número num, mostrar su tabla de multiplicar con el bucle while

*/

public class TablaMultiplicarWhile {

	public static void main(String[] args) {
		
		int i = 0, num = 7;
		
		System.out.println("Tabla de multiplicar del " + num);
		while (i <= 9) {
			System.out.println(num + " x " + i + " = " + (num * i));
			i++;			
		}

	}

}
