package estructurascontrol;

import java.util.Scanner;

public class PiedraPapelTijeraEC {

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
		
		//Piedra = 0; Papel = 1; Tijera = 2
		compElige = (comp == 0 ? "piedra" : 
	   		 		 comp == 1 ? "papel" :
	   			 		         "tijera");
		
		if (correcto) {
			ganador = "Jugador elige " + jugadorElige + ". Computadora elige " + compElige + ".";	
			if (jugadorElige.equalsIgnoreCase(compElige)) {
				ganador += "\nAmbos jugadores han elegido " + jugadorElige + ". Empate";
				
			} 
			else if ((jugadorElige.equalsIgnoreCase("piedra") && compElige.equalsIgnoreCase("tijera")) ||
					(jugadorElige.equalsIgnoreCase("papel") && compElige.equalsIgnoreCase("piedra")) ||
					(jugadorElige.equalsIgnoreCase("tijera") && compElige.equalsIgnoreCase("piedra"))) {
				ganador += "\nJugador gana.";
			}	
			else {
				ganador += "\nComputadora gana.";
			}
		}
		else {
			ganador = "\nError. Escribe 'piedra', 'papel' o 'tijera'";
		}
		
		System.out.println(ganador);
		
		//String compElige[] = {"piedra", "papel", "tijera"};
		//System.out.println("Computadora ha elegido " + compElige + ".");
		
		/*String msgGanador = "\nJugador elige " + jugadorElige + ".\nComputadora elige " + compElige;
		ganador = (correcto ? ((jugadorElige.equals(compElige)) ? "\nAmbos jugadores han elegido " + jugadorElige + ".\nEmpate" :                    //Mismo resultado, empate
			  	  (jugadorElige.equalsIgnoreCase("piedra") && compElige.equalsIgnoreCase("tijera")) ||  //Jugador gana, piedra contra tijera 
			      (jugadorElige.equalsIgnoreCase("papel") && compElige.equalsIgnoreCase("piedra") ||    //Jugador gana, papel contra piedra
			      (jugadorElige.equalsIgnoreCase("tijera") && compElige.equalsIgnoreCase("papel"))) ?   //Jugdador gana, tijera contra papel
			    		msgGanador + ".\nGana el jugador." : msgGanador + ".\nGana la computadora.") :
			     "\nError. Escribe 'piedra', 'papel' o 'tijera'");                   // Si no gana el jugador, gana la computadora, el empate ya se resuelve en la primera comparación
		
		System.out.println(ganador);*/
		
		
		entrada.close();

	}

}
