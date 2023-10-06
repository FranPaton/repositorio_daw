package boletin2;
import java.util.Scanner;

/*
Escribe un programa que ordene tres números enteros introducidos por teclado.
*/

public class Ejercicio8IF {

	public static void main(String[] args) {
		
		int a, b, c, min, max, med;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce primer número: ");
		a = entrada.nextInt();
		System.out.println("Introduce segundo número: ");
		b = entrada.nextInt();
		System.out.println("Introduce tercer número: ");
		c = entrada.nextInt();
		if (a >= b) {
			if (a >= c) {
				max = a;
				if (b >= c) {
					med = b;
					min = c;
				} else {
					med = c;
					min = b;
				}
			} else {
				max = c;
				med = a;
				min = b;				
			}			
		} else {  //a < b
			if (b >= c) {
				max = b;
				if (a >= c) {
					med = a;
					min = c;
				}
				else {
					med = c;
					min = a;
				}
			} else { // c > b
				max = c;
				med = b;
				min = a;
			}
		}

		System.out.println(min + " < " + med + " < " + max);
		entrada.close();
		
	}

}
