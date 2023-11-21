package boletin3;

import org.apache.commons.lang3.StringUtils;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		try {
			 String str = "Reconocer";
			 if (FuncionesCadenas.esPalindromo(str)) {
				  System.out.println("Cadena : " + str + "\nEs palíndromo");
			 }
			 else {
				 System.out.println("Cadena : " + str + "\nNo es palíndromo");
			 }		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		try {
			String str = "Murcielago";
			if (FuncionesCadenas.esHeterograma(str)) {
				System.out.println("\nCadena: " + str + "\nEs heterograma");
			} else {
				System.out.println("\nCadena: " + str + "\nNo es heterograma");
			}
			
		} catch (Exception e) {
			
		}
		
		try {
			String str = "Mequetrefe";
			System.out.println("");
			FuncionesCadenas.conteoVocales(str);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = "Invertir cadena";
			System.out.printf("\n\nCadena: '%s' \nCadena invertida: '%s'", str, FuncionesCadenas.invertirCadena(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String str = "    Cadena    con    espacios   ";
			System.out.printf("\n\nCadena original: %s\nCadena sin espacios: %s", str, FuncionesCadenas.eliminarEspacios(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = "    Cadena    con    espacios  con muchos     espacios    entre    palabras ";
			System.out.printf("\n\nCadena original: %s\nCadena sin espacios: %s", str, FuncionesCadenas.eliminarEspaciosDuplicados(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str1 = "Zorra";
			String str2 = "Arro";
			System.out.printf("\n\nCadena 1: %s ", str1);
			System.out.printf("\nCadena 2: %s ", str2);
			if(FuncionesCadenas.esAnagrama(str2,str1)) {
				System.out.println("\nSon anagramas");
			} else {
				System.out.println("\nNo son anagramas");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = "    Cadena    con    espacios  con muchos     espacios    entre    palabras ";
			System.out.printf("\n\nCadena original: %s\nCadena sin espacios: %s", str, FuncionesCadenas.eliminarEspaciosDuplicados(str));
			System.out.printf("\nNúmero de palabras: %d", FuncionesCadenas.contarPalabras(str));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String str = "Cambiar Una Cadena a Mayúsculas o Minúsculas";
			boolean mayusMinus = true;
			System.out.printf("\n\nCadena original: %s", str);
			System.out.printf("\nCadena modificada: %s", FuncionesCadenas.mayusculasMinusculas(str, mayusMinus));
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
		
		try {
			String str = "Cambiar un caracter de una cadena por otro";
			char char1 = 'a', char2 = 'e';
			System.out.printf("\nCadena original: %s", str);
			System.out.printf("\nCadena modificada cambiando '%c' por '%c': %s", char1, char2, FuncionesCadenas.reemplazarCaracter(str, char1, char2));
			
			
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
	}
	

}
