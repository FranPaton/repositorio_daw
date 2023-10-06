package boletin2;

import java.util.Scanner;

//Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.

public class Ejercicio3 {

	public static void main(String[] args) {
		final double GRAVEDAD = 9.81;
		
		double altura, tiempoCaida;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce altura:" );
		altura = entrada.nextDouble();
		tiempoCaida = Math.sqrt((altura*2)/GRAVEDAD);
		
		System.out.println("Tiempo de caída: " + tiempoCaida);
		entrada.close();

	}

}
