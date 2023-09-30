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
		System.out.println("Computadora ha elegido " + compElige);
		
		//System.out.println("Jugador ha elegido " + jugador);					
		
		//Piedra = 0; Papel = 1; Tijera = 2
		
		ganador = (jugadorElige.equals("piedra") && compElige.equals("papel") ?  "Ha ganado la computadora" : //Piedra contra papel gana papel (comp)
				   jugadorElige.equals("piedra") && compElige.equals("tijera") ? "Ha ganado el jugador" : //Piedra contra tijera gana tijera (jugador)
				   jugadorElige.equals("papel") && compElige.equals("piedra") ?  "Ha ganado el jugador" : //Papel contra piedra gana papel (jugador)
				   jugadorElige.equals("papel") && compElige.equals("tijera") ?  "Ha ganado la computadorar" : //Papel contra tijera gana tijera (comp)
				   jugadorElige.equals("tijera") && compElige.equals("piedra") ? "Ha ganado la computadora" : //Tijera contra piedra gana piedra (comp)
				   jugadorElige.equals("tijera") && compElige.equals("papel") ?  "Ha ganado el jugador" : //Tijera contra papel gana tijera (jugador)
					   									   						 "Empate"					   
			);
		
		System.out.println(ganador);
		
		
		entrada.close();
	}

}
