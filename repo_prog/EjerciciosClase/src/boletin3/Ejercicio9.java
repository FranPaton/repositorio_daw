package boletin3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio9 {

	public static void main(String[] args) {
		try {
			String fechaNac = "15/10/1981";
			String fechaFormato = "dd/MM/yyyy";
			Date fechaDate = FuncionesFechas.obtenerFecha(fechaNac, fechaFormato);
			System.out.println("-= Cambiar formato de fecha =-");
			System.out.printf("Fecha con formato '%s': %s", fechaFormato, fechaNac);
			fechaFormato = "MM/dd/yyyy";
			System.out.printf("\nFecha con formato '%s': %s", fechaFormato, FuncionesFechas.formatearFecha(fechaDate, fechaFormato));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String fechaNac = "15/10/1981";
			String fechaFormato = "dd/MM/yyyy";
			Date fechaDate = FuncionesFechas.obtenerFecha(fechaNac, fechaFormato);
			int edad = FuncionesFechas.calcularEdad(fechaDate);
			System.out.println("\n\n -= Calcular edad =-"
					+ "\nFecha de nacimiento: " + fechaNac);
			if (edad == 0) {
				System.out.println("Todavía no has cumplido ningún año");
			} else if (edad == 1) {
				System.out.println("Tienes 1 año");
			} else {
				System.out.printf("Tienes %d años", edad);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String fechaStr = "15/10/1984";
			System.out.println("\n\n-= Comprobar año bisiesto =-");
			if (FuncionesFechas.esAnioBisiesto(fechaStr)) {
				System.out.printf("El año %s es bisiesto", fechaStr);
			} else {
				System.out.printf("El año %s no es bisiesto", fechaStr);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String fechaStr = "15/10/1984";
			String fechaFormato = "dd/MM/yyyy";
			Date fechaDate = FuncionesFechas.obtenerFecha(fechaStr, fechaFormato);
			int mes = FuncionesFechas.obtenerMes(fechaDate);
			System.out.println("\n\n-= Obtener mes de una fecha =-"
					+ "\nFecha: " + fechaStr 
					+ "\nMes: " + (mes + 1));			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}			
		
	}
}
