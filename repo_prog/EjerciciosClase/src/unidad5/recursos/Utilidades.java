package unidad5.recursos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
	static Scanner scn = new Scanner(System.in);
	public static int obtenerEntero () {
		
		int num = 0;
		
		try {
			System.out.println("Introduce número entero: ");
			num = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error, introduce un número entero.");
			scn.next();
		}
		return(num);
	}
	
	public static String obtenerCadena() {
		return(scn.nextLine());
	}
	
	public static char obtenerChar() throws Exception {
		String str = obtenerCadena();
		char result;
		if(str.length() == 1) {
			result = str.charAt(0);
		} else {
			throw new Exception("Error, introduce solo un carácter: ");
		}
		return(result);
	}
	
	public static boolean cifValido (String cif) throws Exception {
		boolean cifValido = false;
		String pattern = "[0-9]{8}[A-Z]";
		if(cif.matches(pattern)) {
			cifValido = true;
		} else {
			throw new Exception("Error, CIF incorrecto. Introduce CIF con 8 números y 1 letra.");
		}
		return(cifValido);
	}
	
	
	
	

}
