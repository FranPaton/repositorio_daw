package boletin3;

import org.apache.commons.lang3.StringUtils;

public class FuncionesCadenas {
	
	//DADA UNA CADENA, DEVOLVER ESTA CADENA INVERTIDA
	
	private static String voltearCadena (String str) {
		return(StringUtils.reverse(str));
	}
	
	//DADA UNA CADENA, DEVVOLVER ESTA CADENA SIN ESPACIOS
	
	private static String eliminarEspaciosAll(String str) {
		return(str.replaceAll(" ", ""));	
	}
	
	//DADA UNA CADENA, COMPRUBEA SI ES PALINDROMO
	
	public static boolean esPalindromo(String str) throws Exception{
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			throw new Exception ("Error, la cadena no puede estar vacía");
		}
		return (eliminarEspaciosAll(str).equalsIgnoreCase(eliminarEspaciosAll( voltearCadena(str) )));
	}
	
	public static boolean esHeterograma (String s) {
		boolean esHeterograma = true;
		String cadena = eliminarEspaciosAll(s);
		int i = 0;
		char c;
		System.out.println(cadena);
		while (i < cadena.length() && esHeterograma) {  // Si la primera ocurrencia de un carácter dentro de una cadena y la última son distintas, entonces ese carácter se repite al menos 2 veces, por lo tanto la cadena no es heterograma
			c = cadena.charAt(i);
			if (cadena.indexOf(c) != cadena.lastIndexOf(c)) {
				esHeterograma = false;
			}
			i++;
		}
		return (esHeterograma);
	}
	//countMatches(CharSequence str, char ch)
	public static void conteoVocales (String str) throws Exception {
		if (str.length() == 0) {
			throw new Exception("Error, la cadena debe tener al menos un carácter.");
		}
		String sMinusculas = str.toLowerCase();
		//System.out.println(s);
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		for (int i=0; i<sMinusculas.length(); i++) {
			if (sMinusculas.charAt(i) == 'a' || sMinusculas.charAt(i) == 'á') {
				contA++;
			}
			if (sMinusculas.charAt(i) == 'e' || sMinusculas.charAt(i) == 'é') {
				contE++;
			}
			if (sMinusculas.charAt(i) == 'i' || sMinusculas.charAt(i) == 'í') {
				contI++;
			}
			if (sMinusculas.charAt(i) == 'o' || sMinusculas.charAt(i) == 'ó') {
				contO++;
			}
			if (sMinusculas.charAt(i) == 'u' || sMinusculas.charAt(i) == 'ú') {
				contU++;
			}
		}
		System.out.print("Cadena: " + str);
		System.out.print((contA != 0 ? "\na: " + contA : ""));
		System.out.print((contE != 0 ? "\ne: " + contE : ""));
		System.out.print((contI != 0 ? "\ni: " + contI : ""));
		System.out.print((contO != 0 ? "\no: " + contO : ""));
		System.out.print((contU != 0 ? "\nu: " + contU : ""));
	}
	
	public static String invertirCadena (String str) throws Exception {
		if (str.length()== 0) {
			throw new Exception("\n\nError, la cadena debe tener al menos un carácter.");
		}
		return (voltearCadena(str));
	}
	
	public static String eliminarEspacios (String str) throws Exception {
		if (str.length() == 0) {
			throw new Exception ("\n\nError, la cadena no puede estar vacía");
		}
		return (eliminarEspaciosAll(str));
	}
	
	public static String eliminarEspaciosDuplicados (String str) throws Exception {
		if (str.length() == 0) {
			throw new Exception("Error, la cadena no puede estar vacía");
		}
		String cadena = str.strip();
		return (cadena.replaceAll("\\s+", " "));
		
	}
	
	public static boolean esAnagrama(String str1, String str2) throws Exception{
		if (str1.length() == 0 || str2.length() == 0) {
			throw new Exception("Error, las cadenas no pueden estar vacías");
		}
		String str1SinEspacios = eliminarEspacios(str1).toLowerCase();
		String str2SinEspacios = eliminarEspacios(str2).toLowerCase();
		return(StringUtils.containsOnly(str1SinEspacios, str2SinEspacios));
	}
	
	public static int contarPalabras (String str) throws Exception{
		if (str.length() == 0) {
			throw new Exception("Error, la cadena no puede estar vacía");
		}
		int contPalabras = 0;
		String strAux = str.strip();
		strAux = eliminarEspaciosDuplicados(strAux);
		for(int i=0; i<strAux.length(); i++) {
			if(strAux.charAt(i) == ' ') {
				contPalabras++;
			}
		}
		return(contPalabras);
	}
	
	public static String mayusculasMinusculas (String str, boolean mayusMinus) throws Exception{
		if (str.length() == 0){
			throw new Exception("Error, la cadena no puede estar vacía.");
		}
		String strAux = str;
		if(mayusMinus) {
			strAux = strAux.toUpperCase();
		} else {
			strAux = strAux.toLowerCase();
		}
		return(strAux);
	}
	
	public static String reemplazarCaracter(String str, char oldChar, char newChar)throws Exception{
		if (str.length() == 0) {
			throw new Exception("Error, la cadena no puede estar vacía.");
		}
		return(str.replace(oldChar,newChar));
	}
	
	
}
