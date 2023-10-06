package boletin2;
import java.util.*;

//Escribe un programa que dada una hora determinada (horas y minutos), calcule
//los segundos que faltan para llegar a la medianoche


public class Ejercicio6 {

	public static void main(String[] args) {
		
		final int SEGUNDOS_DIA = 86400;
		int hora, minuto, horaAsegundos;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce hora en formato 24h: ");
		hora = entrada.nextInt();
		if(hora < 0 && hora > 24) {
			System.out.println("Error. Introduce una hora de 0 a 24.");
		} else {
			System.out.println("Introduce minuto :");
			minuto = entrada.nextInt();
			if (minuto<0 && minuto>59) {
				System.out.println("Error. Introduce un minuto de 0 a 59.");
			} else {
				horaAsegundos = hora * 3600 + minuto * 60;
				System.out.println("Hora: " + hora + ":" + ((minuto < 10) ? "0" + minuto : minuto));
				System.out.println("Quedan " + (SEGUNDOS_DIA - horaAsegundos)  + " segundos para la medianoche.");
				System.out.println("Quedan " + (SEGUNDOS_DIA - horaAsegundos)/60  + " minutos para la medianoche.");
				System.out.println("Quedan " + (double)(SEGUNDOS_DIA - horaAsegundos)/(3600.00) / 24.00  + " horas para la medianoche.");				
			}		
		}
		entrada.close();
	}

}
