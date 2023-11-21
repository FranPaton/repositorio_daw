package unidad4;

import java.util.Scanner;

/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		double[] arrayTemperaturas = new double[12];
		String[] arrayMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		int anio;
		Scanner scn = new Scanner(System.in);
		System.out.print("Introduce año: ");
		anio = scn.nextInt();
		for(int i=0; i<=11;i++) {
			System.out.printf("Introduce temperatura del mes %d: ",i + 1);
			arrayTemperaturas[i] = scn.nextInt();	
		}
		
		System.out.println("TEMPERATURAS DE " + anio);
		for(int i=0; i<=11; i++) {
			
			for(int j=1; j<=arrayTemperaturas[i]; j++)
				System.out.print("*");
			System.out.print("\t" + arrayMeses[i] + "\t\n ");
		}
		scn.close();
	}

}
