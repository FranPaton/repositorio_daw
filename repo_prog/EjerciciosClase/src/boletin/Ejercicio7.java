package boletin;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double exchange = 1.06;
		System.out.print("Introduce cantidad en Euros: ");
		double euros = entrada.nextDouble();	
		System.out.println("Convesor: " + euros + " Euros son " + (euros * exchange) + " dolares");
		entrada.close();
	}

}
