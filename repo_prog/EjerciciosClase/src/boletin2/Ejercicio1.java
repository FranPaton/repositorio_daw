package boletin2;

import java.util.Scanner;

/*Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.

Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros

Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros

Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros*/

public class Ejercicio1 {

	public static void main(String[] args) {
		
		final int SALARIO_NORMAL = 12;
		final int SALARIO_EXTRA = 16;
		int horas, salario;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce número de horas trabajadas: ");
		horas = entrada.nextInt();
		if (horas <= 40) {
			salario = horas * SALARIO_NORMAL;
		}
		else {
			salario = (SALARIO_NORMAL * 40) + SALARIO_EXTRA * (horas - 40); 
		}
			
		System.out.println("Salario semanal: " + salario);
		entrada.close();
		
	}

}


