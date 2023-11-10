package boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
  
 Implementa un programa que pida dos valores int A y B utilizando un nextInt()
(de Scanner), calcula A/B y muestra el resultado por pantalla. Se deberán tratar
de forma independiente las dos posibles excepciones, InputMismatchException
y ArithmeticException, mostrando un mensaje de error indicativo del error en
cada caso.
 
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int a, b;
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Introduce valor de a:");
			a = entrada.nextInt();
			System.out.println("Introduce valor de b:");
			b = entrada.nextInt();
			if (b == 0) {
				entrada.close();
				throw new ArithmeticException();			
			}
			System.out.printf("%d / %d = %.2f", a, b, (double)a / b);
		} catch (InputMismatchException e){
			System.out.println("\nError, introduce un valor entero");	
		}
		catch (ArithmeticException e){
			System.out.println("\nError, no se puede dividir por cero");
			e.printStackTrace();
		}
		entrada.close();
	}

}
