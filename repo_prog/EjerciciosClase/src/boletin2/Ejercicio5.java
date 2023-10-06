package boletin2;

import java.util.Scanner;

//Escribe un programa que nos diga el horóscopo a partir del día y el mes de Nacimiento
/*
Capricornio: 22 de diciembre al 19 de enero
Acuario: 20 de enero al 18 de febrero           Meses con 31 días: ENERO(1), MARZO(3), MAYO(5), JULIO(7), AGOSTO(8), OCTUBRE(10) Y DICIEMBRE(12)
Piscis: 19 de febrero al 20 de marzo			Meses con 30 días: ABRIL(4), (JUNIO(6), SEPTIEMBRE(9), NOVIEMBRE(11)
Aries: 21 de marzo al 19 de abril
Tauro: 20 de abril y al 20 de mayo
Géminis: 21 de mayo al 20 de junio
Cáncer: 21 de junio al 22 de julio
Leo: 23 de julio al 22 de agosto
Virgo: 23 de agosto al 22 de septiembre
Libra: 23 de septiembre al 22 de octubre
Escorpio: 23 de octubre al 21 de noviembre
Sagitario: 22 de noviembre al 21 de diciembre

 */

public class Ejercicio5 {

	public static void main(String[] args) {

		/*final int ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE;
		ENERO = MARZO = MAYO = JULIO = AGOSTO = OCTUBRE = DICIEMBRE = 31;
		int ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE;
		ABRIL = JUNIO = SEPTIEMBRE = NOVIEMBRE = 30;
		final int FEBRERO = 28;*/

		int dia = 1, mes = 1;
		String signo ="";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(("Introduce día de la fecha de nacimiento en número: "));
		dia = entrada.nextInt();
		if (dia >=1 && dia <= 31) {
			System.out.println(("Introduce mes de la fecha de nacimiento en número: "));
			mes = entrada.nextInt();
			if (mes >= 1 && mes <=12) {
				signo ="Error. " + dia + "/" + mes + " no es una fecha válida.";
				switch (mes) {
				case 1: 
						if (dia >= 20){
							signo = "Capricornio";
						} else if (dia <= 31){  //31 dias
							signo = "Acuario";
						}						
						break;
				case 2: 
						if (dia <= 18) {
							signo = "Acuario";
						} else if (dia <= 28){  //28 dias
							signo = "Piscis";
						} 
					break;
				case 3: 
					if (dia <= 20) {
						signo = "Piscis";
					} else if (dia <= 31){  //31 dias
						signo = "Aries";
					}
					break;
				case 4: 
					if (dia <= 19) {
						signo = "Aries";
					} else if (dia <= 30){  //30 dias
						signo = "Tauro";
					}
					break;
				case 5:
					if (dia <= 20) {
						signo = "Tauro";
					} else if (dia <= 31){  //31 dias
						signo = "Géminis";
					}
					break;
				case 6:
					if (dia <= 20) {
						signo = "Géminis";
					} else if (dia <= 30){  //31 dias
						signo = "Cáncer";
					}
					break;
				case 7:
					if (dia <= 22) {
						signo = "Cáncer";
					} else if (dia <= 31){  //31 dias
						signo = "Leo";
					}
					break;
				case 8:
					if (dia <= 22) {
						signo = "Leo";
					} else if (dia <= 31){  //31 dias
						signo = "Virgo";
					}
					break;
				case 9:
					if (dia <= 22) {
						signo = "Virgo";
					} else if (dia <= 30){  //30 dias
						signo = "Libra";
					}
					break;
		
				case 10:
					if (dia <= 22) {
						signo = "Libra";
					} else if (dia <= 31){  //31 dias
						signo = "Escorpio";
					}
					break;
				
				case 11:
					if(dia <= 21) {
						signo = "Escorpio";
					} else 	if (dia <= 30){  //31 dias
						signo = "Sagitario";
					}
					break;
				case 12:
					if(dia <= 21) {
						signo = "Sagitario";
					} else if (dia <= 31){  //31 dias
						signo = "Capricornio";
					}
					break;
				default: 
				//	signo = "Error. " + dia + "/" + mes + " es una fecha inválida";
					break;

				}
				
			} else {
				signo = "Error. Introduce un mes del 1 al 12";
			}
			
			//signo = "Error. " + dia + "/" + mes + " es una fecha inválida";
			
			
		} else {
			signo = "Error. Introduce un día del 1 al 31";
		}
		
		if (signo.contains("Error")) {
			System.out.println(signo);
		} else {
			System.out.println("Los nacidos el " + dia + "/" + mes + " son " + signo);
		}
		entrada.close();

	}
	
}
