package com.franciscoramirezpaton.tarea3;

import java.util.Scanner;

public class UsoDeStringBuilder {

	public static void main(String[] args) {
		String str;
		StringBuilder builderVocales = new StringBuilder();
		StringBuilder builderConsonantes = new StringBuilder();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		str = scn.nextLine();
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
						ch == 'á' || ch == 'é' || ch == 'í' || ch == 'ó' || ch == 'ú' || ch == 'Á' || ch == 'É' || ch == 'Í' || ch == 'Ó' || ch == 'Ú' ) {
					builderVocales.append(ch);
				} else {
					builderConsonantes.append(ch);
				}	
			}
		}
		scn.close();
		System.out.println("Vocales: " + builderVocales.toString());
		System.out.println("Consonantes: " + builderConsonantes.toString());

	}
}
