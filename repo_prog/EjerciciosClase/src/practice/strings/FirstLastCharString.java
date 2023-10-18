package practice.strings;
import java.util.*;

/*
	Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
	
	withoutEnd("Hello") → "ell"
	withoutEnd("java") → "av"
	withoutEnd("coding") → "odin"
*/

public class FirstLastCharString {

	public static void main(String[] args) {

		String cadena;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce cadena: ");
		cadena = entrada.nextLine();
		System.out.println(cadena.substring(1, cadena.length() -1));
		entrada.close();
				

	}
	

}
