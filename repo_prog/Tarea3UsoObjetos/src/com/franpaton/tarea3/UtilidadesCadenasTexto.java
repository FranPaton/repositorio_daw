package com.franpaton.tarea3;

import org.apache.commons.lang3.StringUtils;

public class UtilidadesCadenasTexto {
	public static void contarVocales (String str) throws Exception {
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
		System.out.print("\nCadena: " + str);
		System.out.print((contA != 0 ? "\na: " + contA : ""));
		System.out.print((contE != 0 ? "\ne: " + contE : ""));
		System.out.print((contI != 0 ? "\ni: " + contI : ""));
		System.out.print((contO != 0 ? "\no: " + contO : ""));
		System.out.print((contU != 0 ? "\nu: " + contU + "\n": ""));
	}
	
	public static String eliminarEspaciosDuplicados (String str) throws Exception {
		if (str.length() == 0) {
			throw new Exception("Error, la cadena no puede estar vacía");
		}
		String cadena = str.strip();
		return (cadena.replaceAll("\\s+", " "));
	}
	
	public static int contarPalabras (String str) throws Exception{
		if (str.length() == 0) {
			throw new Exception("Error, la cadena no puede estar vacía");
		}
		int contPalabras = 1;
		String strAux = str.strip();
		strAux = eliminarEspaciosDuplicados(strAux);
		for(int i=0; i<strAux.length(); i++) {
			if(strAux.charAt(i) == ' ') {
				contPalabras++;
			}
		}
		return(contPalabras);
	}

	public static boolean esPalindromo(String str) throws Exception{
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			throw new Exception ("Error, la cadena no puede estar vacía");
		}
		String auxStr = str.replaceAll(" ", "");
		String auxStrInversa = StringUtils.reverse(auxStr);
		return (auxStr.equalsIgnoreCase(auxStrInversa));
	}
}
