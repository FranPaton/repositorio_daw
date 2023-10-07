package boletin;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		double exchange = 1.06;
		System.out.print("Introduce cantidad en Euros: ");
		double euros = entrada.nextDouble();	
		System.out.println("Convesor: " + euros + " Euros son " + (euros * exchange) + " dolares");
		entrada.close();
	}

}
