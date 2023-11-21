package boletin3;

import java.util.Scanner;

/* 
 Crea una clase y llámala UtilidadesEj03. Dentro de esta clase crea un método
para cada tipo de dato primitivo llamado introduce[TIPO] que recibirá una
cadena de texto como parámetro para poder pedir que se introduzcan desde
teclado un valor de tipo:
 int
 float
 double
 boolean
 char
Estos métodos deberán de ser estáticos para poderlos llamar desde la clase. Se
accederán a los métodos mediante un menú y pasaremos un mensaje que se
muestre al usuario antes de recoger la información por teclado. Los métodos
deben de devolver el dato que se ha recogido por teclado si no se ha producido
un error con el tipo correspondiente.
En caso de que se produzca un error, se volverá a pedir que se introduzca un
valor.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int opcionMenu = 0;
		Scanner scan = new Scanner(System.in);
		//String cadena = "";
		
		do {
			System.out.println("\n\nIntroduce tipo del valor:"
					+ "\n1. Int"
					+ "\n2. Float"
					+ "\n3. Double"
					+ "\n4. Boolean"
					+ "\n5. Char"
					+ "\n0. Salir");
			opcionMenu = scan.nextInt();
			
			switch (opcionMenu) {
				case 1:
					int numInt;
					System.out.println("Introduce valor de tipo Int:");
					try {
						numInt = UtilidadesEj06.introduceInt(scan.next());
						System.out.printf("\nEl número entero introducido es %d", numInt);
					} catch (Exception e){
						System.out.println(e.getMessage());
					}
					
					
				case 2: 
					float numFloat;
					System.out.println("Introduce valor de tipo Float: ");
					try {
						numFloat = UtilidadesEj06.introduceFloat(scan.next());
						System.out.printf("\nEl número de tipo Float introducido es %.3f", numFloat);
					} catch(Exception e) {
						System.out.println(e.getMessage());
					} 
					
				
				/*case 3: 
					double numDouble;
					System.out.println("Introduce valor de tipo Double");
					numDouble = scan.nextDouble();
					numDouble = introduceDouble(scan.nextLine());
				case 4: 
					boolean bool;
					System.out.println("Introduce valor de tipo Boolean");
					bool = introduceBoolean(scan.nextLine());
				case 5: 
					char c;
					System.out.println("Introduce valor de tipo Int");
					c = introduceChar(scan.nextLine());*/
					
			}
			

		} while (opcionMenu!= 0);
		scan.close();
		
	}

}
