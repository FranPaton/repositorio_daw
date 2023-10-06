package boletin2;

import java.util.Scanner;

public class Ejercicio5V2 {

	public static void main(String[] args) {
		int dia = 1, mes = 1;
		String signo = "";
		Scanner entrada = new Scanner(System.in);

		System.out.println(("Introduce día de la fecha de nacimiento en número: "));
		dia = entrada.nextInt();
		if (dia >= 1 && dia <= 31) {
			System.out.println(("Introduce mes de la fecha de nacimiento en número: "));
			mes = entrada.nextInt();
			signo = "Error. " + dia + "/" + mes + " no es una fecha válida.";
			switch (mes) {
			case 1:
				if (dia >= 20) {
					signo = "Capricornio";
				} else if (dia <= 31) { // 31 dias
					signo = "Acuario";
				}
				break;
			case 2:
				if (dia <= 18) {
					signo = "Acuario";
				} else if (dia <= 29) { // 28 dias
					signo = "Piscis";
				}
				break;
			case 3:
				if (dia <= 20) {
					signo = "Piscis";
				} else if (dia <= 31) { // 31 dias
					signo = "Aries";
				}
				break;
			case 4:
				if (dia <= 19) {
					signo = "Aries";
				} else if (dia <= 30) { // 30 dias
					signo = "Tauro";
				}
				break;
			case 5:
				if (dia <= 20) {
					signo = "Tauro";
				} else if (dia <= 31) { // 31 dias
					signo = "Géminis";
				}
				break;
			case 6:
				if (dia <= 20) {
					signo = "Géminis";
				} else if (dia <= 30) { // 31 dias
					signo = "Cáncer";
				}
				break;
			case 7:
				if (dia <= 22) {
					signo = "Cáncer";
				} else if (dia <= 31) { // 31 dias
					signo = "Leo";
				}
				break;
			case 8:
				if (dia <= 22) {
					signo = "Leo";
				} else if (dia <= 31) { // 31 dias
					signo = "Virgo";
				}
				break;
			case 9:
				if (dia <= 22) {
					signo = "Virgo";
				} else if (dia <= 30) { // 30 dias
					signo = "Libra";
				}
				break;

			case 10:
				if (dia <= 22) {
					signo = "Libra";
				} else if (dia <= 31) { // 31 dias
					signo = "Escorpio";
				}
				break;

			case 11:
				if (dia <= 21) {
					signo = "Escorpio";
				} else if (dia <= 30) { // 31 dias
					signo = "Sagitario";
				}
				break;
			case 12:
				if (dia <= 21) {
					signo = "Sagitario";
				} else if (dia <= 31) { // 31 dias
					signo = "Capricornio";
				}
				break;
			default:
				signo = "Error. " + dia + "/" + mes + " no es una fecha válida.";
				break;
			}

		} else {
			signo = "Error. Introduce un día del 1 al 31.";
		}

		if (signo.contains("Error")) {
			System.out.println(signo);
		} else {
			System.out.println("Los nacidos el " + dia + "/" + mes + " son " + signo);
		}
		entrada.close();

	}

}
