package boletin;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		double precioBase;
		double precioFinal;
		double iva = 21d;
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Introduce precio sin IVA: ");
		precioBase = entrada.nextDouble();
		precioFinal = precioBase * (iva/100) + precioBase;
		System.out.println("Precio Final: " + precioFinal + " €");
		entrada.close();
		
	}

}
