package Ejemplos;

 /* PIEDRA, PAPEL, TIJERA CON MANEJO DE ERROR DE ENTRADA */

import java.util.Scanner;

public class PiedraPapelTijeraV3 {

	public static void main(String[] args) {
		
		int comp = (int)Math.floor((Math.random() * 3));
		String compElige;
		String jugadorElige;
		String ganador;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Jugador elige: piedra, papel o tijera");
		jugadorElige = entrada.nextLine();
		boolean correcto = jugadorElige.equalsIgnoreCase("piedra") |
						   jugadorElige.equalsIgnoreCase("papel") |
						   jugadorElige.equalsIgnoreCase("tijera") ?  true : false;
								  
		//System.out.println("Jugador ha elegido " + jugadorElige);	
		
		//Piedra = 0; Papel = 1; Tijera = 2
		compElige = (comp == 0 ? "piedra" : 
	   		 		 comp == 1 ? "papel" :
	   			 		         "tijera");
		
		//System.out.println("Computadora ha elegido " + compElige + ".");
		
		String msgGanador = "\nJugador elige " + jugadorElige + ".\nComputadora elige " + compElige;
		ganador = (correcto ? ((jugadorElige.equals(compElige)) ? "\nAmbos jugadores han elegido " + jugadorElige + ".\nEmpate" :                    //Mismo resultado, empate
			  	  (jugadorElige.equalsIgnoreCase("piedra") && compElige.equalsIgnoreCase("tijera")) ||  //Jugador gana, piedra contra tijera 
			      (jugadorElige.equalsIgnoreCase("papel") && compElige.equalsIgnoreCase("piedra") ||    //Jugador gana, papel contra piedra
			      (jugadorElige.equalsIgnoreCase("tijera") && compElige.equalsIgnoreCase("papel"))) ?   //Jugdador gana, tijera contra papel
			    		msgGanador + ".\nGana el jugador." : msgGanador + ".\nGana la computadora.") :
			     "\nError. Escribe 'piedra', 'papel' o 'tijera'");                   // Si no gana el jugador, gana la computadora, el empate ya se resuelve en la primera comparación
		
		System.out.println(ganador);
		
		System.out.println();
		
		entrada.close();

	}

}
