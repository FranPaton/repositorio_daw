package Ejemplos;

import java.util.*;

public class PiedraPapelTijeraV2 {

	public static void main(String[] args) {
		
	    /* La libreria java.util incluye la clase Random para generar números aleatorios, 
	     * con distintos métodos para generar distintos tipos de datos, al contrario que Math.random(),
	     * que sólo genera números tipo double.
	    */
	
		/*Random rand = new Random();  
		  int comp = rand.nextInt(3);
		*/
		
		int comp = (int)Math.floor((Math.random() * 2.999999)); //Se generan doubles de 0 a 3 y se rendondean a la baja para obtener 0, 1 y 2;
		String compElige;
		String jugadorElige;
		String ganador;
		Scanner entrada = new Scanner(System.in);
		String piedraAscii = "    _______" 
					     + "\n---'   ____)" 
			             + "\n      (_____)" 
			             + "\n      (_____)" 
			             + "\n      (____)" 
			             + "\n---.__(___)"
			             + "\n  PIEDRA";
		
		String papelAscii = "    _______" 
				         + "\n---'   ____)____" 
				         + "\n          ______)" 
				         + "\n          _______)" 
				         + "\n         _______)" 
				         + "\n---.__________)  "
				         + "\n  PAPEL" ;
		
		String tijeraAscii = "    _______"
				         + "\n---'   ____)_____  "
				         + "\n          _______)"
				         + "\n       ___________)"
				         + "\n      (____)"
				         + "\n---.__(___)"
				         + "\n  TIJERA";
	
		System.out.print("Jugador elige: piedra, papel o tijera: "); //print en lugar de println permite la entrada de datos en la misma línea
		jugadorElige = entrada.nextLine().toLowerCase();
			
		//Convertimos el número generado por el random en su string correspondiente, 0 = piedra, 1 = papel, 2 = tijera, que guardamos en compElige
		compElige = (comp == 0 ? "piedra" : //piedra = 0, papel = 1, tijera = 2 comp
		             comp == 1 ? "papel" : 
		            	         "tijera" );
		 
		
		System.out.println("\nJugador elige:");  //Muestra por pantalla la elección del jugador, representada en código ASCII
		System.out.println(jugadorElige.equals("piedra") ? piedraAscii : 
						   jugadorElige.equals("papel") ?  papelAscii :
							   							   tijeraAscii
						   );
		
		System.out.println("\nComputadora elige:");
		

		System.out.println(comp == 0 ? piedraAscii :  //Muestra por pantalla la elección de la computadora, representada en código ASCII
						   comp == 1 ? papelAscii :
						               tijeraAscii			
						  );
		
		/*ganador = (jugadorElige.equals("piedra") && compElige.equals("papel") ?  "Papel gana a piedra. Ha ganado la computadora." : //Piedra contra papel gana papel (comp)
	     *          jugadorElige.equals("piedra") && compElige.equals("tijera") ? "Piedra gana a tijera. Ha ganado el jugador." : //Piedra contra tijera gana tijera (jugador)
	     *          jugadorElige.equals("papel") && compElige.equals("piedra") ?  "Papel gana a piedra. Ha ganado el jugador." : //Papel contra piedra gana papel (jugador)
	     *          jugadorElige.equals("papel") && compElige.equals("tijera") ?  "Tijera gana a papel. Ha ganado la computadora." : //Papel contra tijera gana tijera (comp)
	     *          jugadorElige.equals("tijera") && compElige.equals("piedra") ? "Piedra gana a tijera. Ha ganado la computadora." : //Tijera contra piedra gana piedra (comp)
	     *          jugadorElige.equals("tijera") && compElige.equals("papel") ?  "Tijera gana a papel. Ha ganado el jugador." : //Tijera contra papel gana tijera (jugador)
		 *  									   						             "Empate."					   
         *          );
		 */
		
		ganador = (jugadorElige.equals(compElige)) ? "Empate " :                    //Mismo resultado, empate
				  (jugadorElige.equals("piedra") && compElige.equals("tijera")) ||  //Jugador gana, piedra contra tijera 
				  (jugadorElige.equals("papel") && compElige.equals("piedra") ||    //Jugador gana, papel contra piedra
				  (jugadorElige.equals("tijera") && compElige.equals("papel")))     //Jugdador gana, tijera contra papel
	              ? "Gana el jugador." :  "Gana la computadora.";                   // Si no gana el jugador, gana la computadora, el empate ya se resuelve en la primera comparación
				
		System.out.println("\n" + ganador);
		
		entrada.close();
			
	}

}
