package com.franciscoramirezpaton.tarea3;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class RuletaSuerte {

	public static void main(String[] args) {
		String[] arrayPlatos = {"RISOTTO CON SETAS Y PARMESANO", "POLLO AL CURRY CON ARROZ BASMATI", "PESCADO EN SALSA DE LIMON Y ALCAPARRAS",
								"ENSALADA DE QUINOA CON AGUACATE Y ADEREZO CITRICO", "TERNERA ESTOFADA CON PATATAS Y ZANAHORAS", "SUSHI DE SALMON Y AGUACATE FRESCO",
								"PIZZA CON MOZARELLA Y ALBAHACA", "LASAÑA DE CARNE CON RICOTTA Y ESPINACAS", "TARTA DE CHOCOLATE CON GANACHE Y FRAMBUESAS",
								"TACOS DE CARNITAS CON SALSA DE MANGO"};
		int opcionMenuPrincipal = 0;
		Scanner scn = new Scanner(System.in);
		boolean opcionCorrecta = false;
		
		do {
		
			System.out.println("---- LA RULETA DE LA FORTUNA ----"
					+ "\n1. Jugar"
					+ "\n2. Finalizar el juego");
			try {
				opcionMenuPrincipal = scn.nextInt();
				opcionCorrecta = true;
				switch (opcionMenuPrincipal) {
				case 1:
					
					int numFraseRandom = (int) (Math.random() * 10);
					char opcionMenuLetras;
					String fraseRandom = arrayPlatos[numFraseRandom];
					
					String fraseResuelta = "";
					for(int i = 0; i < fraseRandom.length(); i++) {
						if(fraseRandom.charAt(i) != ' ') {
							fraseResuelta += '-';
						} else {
							fraseResuelta += ' ';
						}
					}
				
					boolean ganador = false;
					do {
						System.out.println("\nFrase Oculta: " + fraseResuelta);
						System.out.println("\nC. Comprar letra" 
										+ "\nR. Resolver"
										+ "\nS. Salir");
						opcionMenuLetras = scn.next().charAt(0);
						opcionMenuLetras = Character.toUpperCase(opcionMenuLetras);
						switch(opcionMenuLetras) {
						case 'C':
							char letra;
							int contLetras = 0;
							
							System.out.print("\nIntroduce la letra que quieres comprar: ");
							letra = scn.next().charAt(0);
							letra = Character.toUpperCase(letra);
							contLetras = StringUtils.countMatches(fraseRandom, letra);
							if(contLetras == 0) {
								System.out.printf("No existe la letra '%c' en la frase.", letra);
							} else {
								System.out.printf("La letra '%c' aparece %d veces", letra, StringUtils.countMatches(fraseRandom,letra));
								int i = 0;
								while( contLetras >= 0 && i < fraseRandom.length()) {
									if(letra == fraseRandom.charAt(i)) {
										fraseResuelta = reemplazarCaracter(fraseResuelta, fraseRandom.charAt(i), i);
										contLetras--;
									}
									i++;
								}
								
							}
							break;
						case 'R' :
							scn.nextLine();
							String fraseSolucion ="";
							
							System.out.println("Introduce la frase resuelta: ");		
							fraseSolucion = scn.nextLine();
							if(fraseSolucion.equalsIgnoreCase(fraseRandom)) {
								System.out.println("¡Enhorabuena, has acertado la frase!");
								ganador = true;
							} else {
								System.out.println("Lo siento, la frase no es correcta. Vuelve a intentarlo o compra otra letra.");
							}
							break;
							
						case 'S':
							break;
						default:
							System.out.println("Error, introduce una opcion correcta");
							break;
						}
					} while(opcionMenuLetras != 'S' && !ganador);
					
					break;
				case 2:
					System.out.println("Juego finalizado. ¡Buena Suerte!");
					break;

				default:
					System.out.println("Error, introduce una opción correcta");
					opcionCorrecta = false;
					break;
				}
			
				
			} catch (InputMismatchException e) {
				System.out.println("Error, introduce una opción correcta.");
				opcionCorrecta = false;
				scn.next();
			}
	} while(opcionMenuPrincipal!= '2' && !opcionCorrecta);
			
		scn.close();
	
	}
	
	public static String reemplazarCaracter (String str, char ch, int index) {
		 str = str.substring(0, index) + ch  + str.substring(index + 1);
		 return (str);
	}

}
