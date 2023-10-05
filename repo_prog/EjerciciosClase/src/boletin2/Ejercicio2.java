package boletin2;

import java.util.Scanner;

/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1 x = -0.5
Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.*/
  
 

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int a,b;
		double x;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Resolución de ax + b = 0");
		System.out.print("Introduce valor de a: ");
		a = entrada.nextInt();
		System.out.print("Introduce valor de b: ");
		b = entrada.nextInt();
		x = (double)b * (-1) / a ;
		String msgEcuacion = a + "x + " + b + " = 0";
		if(a == 0) {	
			System.out.println(msgEcuacion);
			System.out.println("Esta ecuación no tiene una solución real");
		} else {
			System.out.println(msgEcuacion + " ==> x = " + x);
		}
		
		entrada.close();

	}

}
