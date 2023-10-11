package ejemplos;
import java.util.*;

/*
 * 
 Dados udos número, devolver los múltiplos de 7 entre los números
 Controlar 
 	num1 < num2
 	num1 > 0
 	existe al menos un multiplo de 7 entre ellos
 * 
 */

public class MultiplosDeSiete {

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		String strMultiplos = ""; 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce número 1: ");
		if(entrada.hasNextInt() && (num1 = entrada.nextInt()) > 0 ) {
			System.out.println("Introduce número 2: ");
			if(entrada.hasNextInt() && (num2 = entrada.nextInt()) > 0 && num2 > num1) {
				//System.out.println("Correcto");
				for (int i= num1;  i < num2; i++) {
					if (i % 7 == 0) {
						strMultiplos += i + " ";
					}
				}
				if (strMultiplos.equals("")) {
					System.out.println("No hay ningún múltiplo de 7 entre " + num1 + " y " + num2);			
				} else {
					System.out.println("Multiplos de 7 entre: " + num1 + " y " + num2 + " --> " + strMultiplos);
				}
			}
			else {
				System.out.println("Error. Introduce un número positivo mayor que " + num1);

			}
		} else {
			System.out.println("Error. Introduce un número positivo.");
		}
		
		
		
		entrada.close();	
		
	}

}
