package com.franpaton.tarea2;

import java.util.*;

/*. Escribe un programa con una cadena de texto que contenga una contraseña
cualquiera. Después se pedirá al usuario que introduzca la contraseña, con 3
intentos. Cuando acierte mostrará un mensaje de éxito. Si excede el número de
intentos, avisa del error y termina el programa.
*/
<<<<<<<< HEAD:repo_prog/EjerciciosClase/src/com/franpaton/tarea2/Ejercicio1ComprobarPassword.java
public class Ejercicio1ComprobarPassword {
========
public class Ejercicio1 {
>>>>>>>> 91cee1db989af9820715adc280f504604fb0f01c:repo_prog/EjerciciosClase/src/com/franpaton/tarea2/Ejercicio1.java

	public static void main(String[] args) {
		
		String password ="1234abcd";
		String entradaPassword = "";
		Scanner entrada = new Scanner(System.in);
		boolean passwordCorrecto = true;
		int numIntentos = 3; //Se puede modificar el valor de esta variable para permitir más o menos intentos sin tener que modificar nada más del programa
		
		do {
			System.out.println("Introduce contraseña (" + numIntentos + " intentos) :");	
			entradaPassword = entrada.nextLine();
			if(entradaPassword.equals(password)) {
				passwordCorrecto = true;
				System.out.println("Contraseña aceptada");
				
			} else {
				numIntentos--;
				passwordCorrecto = false;
				if(numIntentos > 0) {
					System.out.println("Error. Quedan " + numIntentos + " intentos.");
				}else {
					System.out.println("Error. Demasiados intentos, programa bloqueado.");
				}		
			}	
		} while(numIntentos>0 && !passwordCorrecto);	
		
		entrada.close();
	}
}