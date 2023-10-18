package com.franpaton.tarea2;

import java.util.Scanner;

/*
	~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~
	1 - Suma
	2 - Resta
	3 - Multiplicación
	4 – División
	5 - Raíz cuadrada
	6 – Potencia
	0 - Salir del programa
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	Posteriormente se quedará a la espera de que el usuario introduzca un valor numérico.
	Si introduce un 0 el programa mostrará un mensaje de despedida, que habrá que confirmar pulsando cualquier tecla y después finalizará.
	Si se pulsa un valor comprendido entre 1 y 6 pedirá al usuario dos números y devolverá el resultado de la operación escogida.
	Si se pulsa cualquier otra cosa el programa volverá a mostrar el menú tras un mensaje de error instando a introducir un valor correcto.
*/

public class Ejercicio3Calculadora {

	public static void main(String[] args) {

		int opcionMenu = -1, num1 = 0, num2 = 0;
		Scanner entrada = new Scanner(System.in);
		boolean opcionCorrecta = false;

		do {
			System.out.println("\n~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~\n" + "1 - Suma\n" + "2 - Resta\r\n"
					+ "3 - Multiplicación\n" + "4 – División\n" + "5 – Potencia\n" + "0 - Salir del programa\n"
					+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Introduce una opción (1-5): ");

			opcionMenu = entrada.nextInt();

			if (opcionMenu >= 0 && opcionMenu <= 5) { // se comprueba que la opcion escogida está entre 1 y 6
				switch (opcionMenu) {
				case 1: // SUMAR
					System.out.println("Introduce primer número: ");
					num1 = entrada.nextInt();
					System.out.println("Introduce segundo número:");
					// se comprueba que num2 es un número entero
					num2 = entrada.nextInt();
					System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2));

					break;

				case 2: // RESTAR
					System.out.println("Introduce primer número: ");
					num1 = entrada.nextInt();
					System.out.println("Introduce segundo número:");
					num2 = entrada.nextInt();
					System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2));
					break;

				case 3: // MULTIPLICAR
					System.out.println("Introduce primer número: ");
					num1 = entrada.nextInt();
					System.out.println("Introduce segundo número:");
					num2 = entrada.nextInt();
					System.out.println("Resultado: " + num1 + " * " + num2 + " = " + (num1 * num2));
					break;

				case 4: // DIVIDIR
					System.out.println("Introduce primer número: ");
					num1 = entrada.nextInt();
					System.out.println("Introduce segundo número:");
					num2 = entrada.nextInt();
					if (num2 == 0) {
						System.out.println("Error, no se puede dividir por cero.");
					} else {
						System.out.println("Resultado: " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
					}

					break;

				case 5: // ELEVAR
					System.out.println("Introduce primer número: ");
					num1 = entrada.nextInt();
					System.out.println("Introduce segundo número:");
					num2 = entrada.nextInt();
					System.out.println("Resultado: " + num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));
					break;

				default:
					System.out.println("Programa terminado. Presione cualquier tecla para continuar");
					break;
				}
			} else {
				System.out.println("Error, introduce una opción de 1 a 5 (0 para salir).");
			}

		} while (opcionMenu != 0);

		entrada.close();

	}

}
