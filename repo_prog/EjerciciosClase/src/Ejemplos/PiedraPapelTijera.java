package Ejemplos;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		
		int comp = (int)Math.floor((Math.random() * 3));
		String compElige;
		String jugadorElige;
		String ganador;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Jugador elige: piedra, papel o tijera");
		jugadorElige = entrada.nextLine();
		compElige = (comp == 0 ? "piedra" : 
			   		 comp == 1 ? "papel" :
			   			 		 "tijera");
		System.out.println("Jugador ha elegido " + jugadorElige);			
		System.out.println("Computadora ha elegido " + compElige + ".");
		
				
		
		//Piedra = 0; Papel = 1; Tijera = 2
		
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
		
		System.out.println(ganador);
		
		
		entrada.close();
	}

}
