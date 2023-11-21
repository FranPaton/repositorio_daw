package ejemplos;

import java.util.*;

/*
 * 
 
 Introducidos dos números, mostrar un menú con las operaciones posibles:
 Sumar, restar, multiplicar, dividir. Controlar error en la entrada del menú y de los números.
 
 * 
 */

public class CalculadoraDoWhile {

	public static void main(String[] args) {

		int menu = 0, num1 = 0, num2 = 0;
		String result = "";
		Scanner entrada = new Scanner(System.in);

		System.out.println("CALCULADORA");
		do {
			
			System.out.println("Introduce primer número: ");
			if(entrada.hasNextInt()) {
				num1 = entrada.nextInt();
				System.out.println("Introduce segundo número: ");
				if (entrada.hasNextInt()) {
					num2=entrada.nextInt();
					System.out.println("\nElige una opción: "
							+ "\n1. Sumar"
							+ "\n2. Restar"
							+ "\n3. Multiplicar"
							+ "\n4. Dividir"	);
				}
				if (entrada.hasNextInt()) {
					menu = entrada.nextInt();
					switch (menu) {
						case 1: result = num1 + " + " + num2 + " = " + (num1 + num2);
								break;
						case 2: result = num1 + " - " + num2 + " = " + (num1 - num2);
								break;
						case 3: result = num1 + " * " + num2 + " = " + (num1 * num2);
								break;
						case 4: result = num1 + " / " + num2 + " = " + ((double)num1/num2);
								break;			
					}
					System.out.println(result);
					


				}
			}
	


	}while(menu>=1&&menu<=4);
	entrada.close();
}

}
