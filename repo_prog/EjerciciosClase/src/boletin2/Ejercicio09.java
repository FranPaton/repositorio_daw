package boletin2;
import java.util.*;

/*
 
 Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra,
 un número o los símbolos como *, +, € o $. El programa debe permitir al usuario mediante un menú elegir si el vértice
  de la pirámide está apuntando hacia arriba, hacia abajo o hacia la derecha.
  
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		
		String caracter = "";
		int opcionMenu;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce carácter. Puede ser un número, una la o los símbolos '*', '+', '$', '€'");
		caracter = entrada.nextLine();
		if (caracter.length() == 0 ){
			System.out.println("Error. Introduce un carácter.");
		} else if (caracter.length() > 1) {
			System.out.println("Error. Introduce un sólo caracter.");
		} else {
			if (Character.isLetter(caracter.charAt(0))||Character.isDigit(caracter.charAt(0)) ||		 //(Character.toLowerCase(caracter.charAt(0)) >= 'a' && Character.toLowerCase(caracter.charAt(0)) <= 'z')
				caracter.equals("*") ||caracter.equals("+") || caracter.equals("$") || caracter.equals("€"))	{

				System.out.println("Introduce dirección del vértice de la pirámide: "
									+ "\n1. Hacia arriba"
									+ "\n2. Hacia abajo"
									+ "\n3. Hacia la derecha"
									+ "\n4. Hacia la izquierda"
									+ "\n5. Dibujar rombo");
				opcionMenu = entrada.nextInt();
				switch(opcionMenu) {
					case 1 : {
							System.out.println("    " + caracter
											+ "\n   "  + caracter.repeat(3) 
											+ "\n  "  + caracter.repeat(5)
											+ "\n "  + caracter.repeat(7)
											+ "\n"  + caracter.repeat(9)   );
							break;
					}
					case 2 : {
						System.out.println("\n"  + caracter.repeat(9)
											+ "\n "  + caracter.repeat(7)
											+ "\n  "  + caracter.repeat(5)
											+ "\n   "  + caracter.repeat(3) 
											+ "\n    " + caracter);
							break;
					
					}
					case 3 : {
						System.out.println("\n" + caracter
											+ "\n" + caracter.repeat(3)
											+ "\n" + caracter.repeat(5)
											+ "\n" + caracter.repeat(7) 
											+ "\n" + caracter.repeat(9)
											+ "\n" + caracter.repeat(7)
											+ "\n" + caracter.repeat(5)
											+ "\n" + caracter.repeat(3) 
											+ "\n" + caracter				);
						break;
					}
					case 4 : {
						System.out.println("\n          " + caracter
											+ "\n        " + caracter.repeat(3)
											+ "\n      " + caracter.repeat(5)
											+ "\n    " + caracter.repeat(7) 
											+ "\n  " + caracter.repeat(9)
											+ "\n    " + caracter.repeat(7)
											+ "\n      " + caracter.repeat(5)
											+ "\n        " + caracter.repeat(3) 
											+ "\n          " + caracter				);
						break;
					}
					case 5 : {
						System.out.println("\n          " + caracter
											+ "\n         " + caracter.repeat(3)
											+ "\n        " + caracter.repeat(5)
											+ "\n       " + caracter.repeat(7) 
											+ "\n      " + caracter.repeat(9)
											+ "\n       " + caracter.repeat(7)
											+ "\n        " + caracter.repeat(5)
											+ "\n         " + caracter.repeat(3) 
											+ "\n          " + caracter				);
							break;
					}
					default: {
							System.out.println("Error. Introduce un número del 1 al 5");
					}
				}
			} else {
				System.out.println("Error, carácter no válido. Debe ser un número, una letra o lo los símbolos '*', '+', '$', '€'");
			}
		}
		entrada.close();
	}
}
 