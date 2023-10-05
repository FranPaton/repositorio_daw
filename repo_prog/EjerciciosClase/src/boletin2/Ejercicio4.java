package boletin2;

import java.util.Scanner;

//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0)

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int a, b, c;
		double x, xPos, xNeg;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Resolución de ax2 + bx + c= 0");
		System.out.print("Introduce valor de a: ");
		a = entrada.nextInt();
		System.out.print("Introduce valor de b: ");
		b = entrada.nextInt();
		System.out.print("Introduce valor de c: ");
		c = entrada.nextInt();
		System.out.println(a + "x2 + " + b + "x + " + c + " = 0");
		/*x = Math.round((-b + Math.sqrt((b*b) - (4 * a * c)))/(a*2));
		System.out.println("x = " + x);
		x = Math.round((-b - Math.sqrt((b*b) - (4 * a * c)))/(a*2));
		System.out.println("x = " + x);*/
		x = (-b + Math.sqrt((b*b) - (4 * a * c)))/(a*2);
		System.out.println("x = " + x);
		x = (-b - Math.sqrt((b*b) - (4 * a * c)))/(a*2);
		System.out.println("x = " + x);
		
	}

}
