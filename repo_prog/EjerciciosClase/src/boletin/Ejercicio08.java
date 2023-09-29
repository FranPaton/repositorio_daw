package boletin;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		double exchange = 0.95;
		double dolares;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce cantidad en dólares: ");
		dolares = entrada.nextDouble();
		System.out.println("Convesor: " + dolares + " dólares son " + (dolares * exchange) + " Euros");
		entrada.close();


	}

}
