package com.franpaton.tarea3;

import java.util.Date;

public class UsoDeObjetos {

	public static void main(String[] args) {
		
		System.out.println("--- FUNCIONES MATEMÁTICAS --- ");
		
		//Llamadas al método volteaNumero(num), que devuelve un número volteado, del final al principio
		System.out.println("\n1. Voltear un número");
		int num1 = 12345, num2 = -12345;
		System.out.printf("Numero: %d - Número inverso: %d", num1, UtilidadesMatematicas.volteaNumero(num1));
		System.out.printf("\nNumero: %d - Número inverso: %d", num2, UtilidadesMatematicas.volteaNumero(num2));
		
		//Llamadas al método esCapicua(num), que devuelve un booleano que indica si un número es capicua
		System.out.println("\n\n2. Comprobar si un número es capicua");
		int numCapicua1 = 1232321, numCapicua2 = 1233210, numCapicua3 = -12321;
		if(UtilidadesMatematicas.esCapicua(numCapicua1)) {
			System.out.printf("%d es capicua", numCapicua1);
		} else {
			System.out.printf("%d no es capicua", numCapicua1);
		}
		if(UtilidadesMatematicas.esCapicua(numCapicua2)) {
			System.out.printf("%d es capicua", numCapicua2);
		} else {
			System.out.printf("\n%d no es capicua", numCapicua2);
		}
		if(UtilidadesMatematicas.esCapicua(numCapicua3)) {
			System.out.printf("\n%d es capicua", numCapicua3);
		} else {
			System.out.printf("\n%d no es capicua", numCapicua3);
		}
		
		//Llamadas al método nDigito(num, posicion), que devuelve el digito de un número en la posicion pasada por parámetro. Devuelve -1 si no lo encuentra.
		System.out.println("\n\n3.  Devolver el dígito que se encuentra en una posición dada dentro de un número ");
		try {
			int numDigito1 = 12345, numDigito2 = 10203040, posicion1 = 2, posicion2 = 6 ;
			System.out.printf("\nEn el número %d, en la posición %d se encuentra el dígito %d", numDigito1, posicion1, UtilidadesMatematicas.nDigito(numDigito1, posicion1));
			System.out.printf("\nEn el número %d, en la posición %d se encuentra el dígito %d", numDigito2, posicion2, UtilidadesMatematicas.nDigito(numDigito2, posicion2));
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		
		//Llamadas al método cambioExacto(cantidad), que muestra el número mínimo de billetes y monedas para devolver una cantidad de euros.
		System.out.print("\n\n4. Devolver cambio en euros con el mínimo de billetes y monedas");
		try {
			double cantidadCambio1 = 123.45, cantidadCambio2 = 0.23;
			UtilidadesMatematicas.cambioExacto(cantidadCambio1);
			UtilidadesMatematicas.cambioExacto(cantidadCambio2);
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		System.out.println("\n\n--- FUNCIONES DE CADENAS DE TEXTO ---");
		//Llamadas al método contarVocales(str), que muestra el número de vocales de un string
		System.out.println("\n1. Contar vocales de una cadena.");
		try {
			String str1 = "Hola Mundo", str2 = "Francisco Manuel Ramírez Patón";
			UtilidadesCadenasTexto.contarVocales(str1);
			UtilidadesCadenasTexto.contarVocales(str2);
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		
		//Llamadas al método eliminarEspcaciosDuplicados(str), que devuelve una cadena sin espacios duplicados entre palabras
		System.out.println("\n2.Eliminar espacios duplicados en una cadena =-");
		try {
			String str1 = "   Hola     Mundo    ", str2 = "   Francisco   Manuel  Ramírez       Patón";
			System.out.printf("\nCadena original: %s", str1);
			System.out.printf("\nCadena modificada sin espacios: %s", UtilidadesCadenasTexto.eliminarEspaciosDuplicados(str1));
			System.out.printf("\n\nCadena original: %s", str2);
			System.out.printf("\nCadena modificada sin espacios: %s", UtilidadesCadenasTexto.eliminarEspaciosDuplicados(str2));
		} catch(Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		
		//Llamadas al método contarPalabras(str), que devuelve el número de palabras de una cadena
		System.out.println("\n\n3. Contar palabras de una cadena");
		try {
			String str1 = "Cadena   con 4   palabras   ", str2 = "  Esta cadena tiene   cinco  palabras   ";
			System.out.printf("\nCadena: %s", str1);
			System.out.printf("\nNúmero de palabras: %d", UtilidadesCadenasTexto.contarPalabras(str1));
			System.out.printf("\n\nCadena: %s", str2);
			System.out.printf("\nNúmero de palabras: %d", UtilidadesCadenasTexto.contarPalabras(str2));
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		
		//Llamadas al método esPalindromo(str), que devuelve un booleano que indica si una cadena es un palíndromo
		System.out.println("\n\n4. Comprobar si una cadena es un palíndromo");
		try {
			String str1 = "Reconocer", str2 ="Dabale arroz a la zorra el abad", str3 = "abcdabcd";
			if (UtilidadesCadenasTexto.esPalindromo(str1)) {
				System.out.printf("\n'%s' es palíndromo", str1);
			} else {
				System.out.printf("\n'%s' no es palíndromo", str1);
			}
			if (UtilidadesCadenasTexto.esPalindromo(str2)) {
				System.out.printf("\n\n'%s' es palíndromo", str2);
			} else {
				System.out.printf("\n\n'%s' no es palíndromo", str2);
			}
			if (UtilidadesCadenasTexto.esPalindromo(str3)) {
				System.out.printf("\n\n'%s' es palíndromo", str3);
			} else {
				System.out.printf("\n\n'%s' no es palíndromo", str3);
			}
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}	
		System.out.println("\n\n--- FUNCIONES DE FECHAS ---");
		//Llamadas al método formatrearFecha(fecha, formatoFecha), que devuelve una cadena con una fecha formateada según 'formatoFecha'
		System.out.println("\n1. Formatear fecha");
		try {
			String fechaNac = "15/10/1981";
			String fechaFormato = "dd/MM/yyyy";
			Date fechaDate = UtilidadesFechas.obtenerFecha(fechaNac, fechaFormato);
			System.out.printf("Fecha con formato '%s': %s", fechaFormato, fechaNac);
			fechaFormato = "MM/dd/yyyy";
			System.out.printf("\nFecha con formato '%s': %s", fechaFormato, UtilidadesFechas.formatearFecha(fechaDate, fechaFormato));
			fechaFormato ="yyyy/MM/dd";
			System.out.printf("\nFecha con formato '%s': %s", fechaFormato, UtilidadesFechas.formatearFecha(fechaDate, fechaFormato));

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\n2. Calcular edad");
		try {
			String fechaNac = "15/10/1981";
			String fechaFormato = "dd/MM/yyyy";
			Date fechaDate = UtilidadesFechas.obtenerFecha(fechaNac, fechaFormato);
			int edad = UtilidadesFechas.calcularEdad(fechaDate);
			System.out.printf("\nFecha de nacimiento: %s", fechaNac);
			if (edad == 0) {
				System.out.println("\nTodavía no has cumplido ningún año");
			} else if (edad == 1) {
				System.out.println("\nTienes 1 año");
			} else {
				System.out.printf("\nTienes %d años", edad);
			}
			fechaNac = "12/01/2000";
			fechaDate = UtilidadesFechas.obtenerFecha(fechaNac, fechaFormato);
			edad = UtilidadesFechas.calcularEdad(fechaDate);
			System.out.printf("\n\nFecha de nacimiento: %s", fechaNac);
			if (edad == 0) {
				System.out.println("\nTodavía no has cumplido ningún año");
			} else if (edad == 1) {
				System.out.println("\nTienes 1 año");
			} else {
				System.out.printf("\nTienes %d años", edad);
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Llamadas a la función esBisiesto(fechaStr), que devuelve si el año de una fecha es bisiesto
		System.out.println("\n\n3. Comprobar si un año es bisiesto");
		try {
			String fechaStr = "15/10/1984";
			if (UtilidadesFechas.esAnioBisiesto(fechaStr)) {
				System.out.printf("\nEl año de la fecha %s es bisiesto", fechaStr);
			} else {
				System.out.printf("\nEl año de la fecha %s no es bisiesto", fechaStr);
			}
			
			fechaStr = "15/10/1981";
			if (UtilidadesFechas.esAnioBisiesto(fechaStr)) {
				System.out.printf("\n\nEl año de la fecha %s es bisiesto", fechaStr);
			} else {
				System.out.printf("\n\nEl año de la fecha %s no es bisiesto", fechaStr);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Llamadas al método obtenerMes(fechaDate), que devuelve el mes de una fecha
		System.out.println("\n\n4. Obtener mes de una fecha");
		try {
			String fechaStr = "15/10/1984";
			String fechaFormato = "dd/MM/yyyy";
			Date fechaDate = UtilidadesFechas.obtenerFecha(fechaStr, fechaFormato);
			int mes = UtilidadesFechas.obtenerMes(fechaDate) + 1;
			System.out.printf("\nFecha: %s - Mes : %d", fechaStr, mes);	
			
			fechaStr = "20/11/2023";
			fechaDate = UtilidadesFechas.obtenerFecha(fechaStr, fechaFormato);
			mes = UtilidadesFechas.obtenerMes(fechaDate) + 1;
			System.out.printf("\n\nFecha: %s - Mes : %d", fechaStr, mes);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	
	
	
	

}
