package boletin2;

import java.util.Scanner;

//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0)
// Fórmula x = (-b +- ((b*b) - 4 * a * c)^(1/2)) / (2 * a)

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int a, b, c;
		double x, baseRaiz;
		
		String formula;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Resolución de ax^2 + bx + c= 0");
		System.out.print("Introduce valor de a: ");
		a = entrada.nextInt();
		System.out.print("Introduce valor de b: ");
		b = entrada.nextInt();
		System.out.print("Introduce valor de c: ");
		c = entrada.nextInt();
		System.out.println("(" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0");
		System.out.println();
		baseRaiz = (b*b) - (4 * a * c);
		formula = " x = (-(" + b + ") +- ("+ baseRaiz +")^1/2 )) / " + 2 * a; 
		if (baseRaiz < 0 ) {
			System.out.println("Esta ecuación solo se puede resolver con números complejos, porque la raíz es de un número negativo.");
		} else {
			x = (-b + Math.sqrt((b*b) - (4 * a * c)))/(a*2);
			System.out.println("x = " + x);
			x = (-b - Math.sqrt((b*b) - (4 * a * c)))/(a*2);
			System.out.println("x = " + x);	
			
		}
		System.out.println(formula);
		entrada.close();
		
		
	}

}
