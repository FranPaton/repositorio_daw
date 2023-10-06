package boletin2;
import java.util.*;

/*
Escribe un programa que ordene tres números enteros introducidos por teclado.
*/

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int a, b, c, min, max, med;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce primer número: ");
		a = entrada.nextInt();
		System.out.println("Introduce segundo número: ");
		b = entrada.nextInt();
		System.out.println("Introduce tercer número: ");
		c = entrada.nextInt();
		max = Math.max(a, Math.max(b, c));
		min = Math.min(a, Math.min(b,c));
		med = a + b + c - min - max;
		
		System.out.println(min + " < " + med + " < " + max);
		entrada.close();
	}

}
