package Ejemplos;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comp = (int)Math.floor((Math.random() * 3));
		String jugador;
		String ganador;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Jugador elige: piedra, papel o tijera");
		jugador = entrada.nextLine();
		System.out.println(comp == 0 ? "Computadora he elegido piedra" : 
						   comp == 1 ? "Computadora ha elegido papel" :
							   			   "Computadora ha elegido tijera"
						 );
		
		//System.out.println("Jugador ha elegido " + jugador);					
		
		//Piedra = 0; Papel = 1; Tijera = 2
		
		ganador = (jugador.equals("piedra") && comp == 1 ? "Ha ganado la computadora" : //Piedra contra papel
				   jugador.equals("piedra") && comp == 2 ? "Ha ganado el jugador" : //Piedra contra tijera
				   jugador.equals("papel") && comp == 0 ?  "Ha ganado el jugador" : //Papel contra piedra
				   jugador.equals("papel") && comp == 2 ?  "Ha ganado la computadorar" : //Papel contra tijera
				   jugador.equals("tijera") && comp == 0 ? "Ha ganado la computadora" : //Tijera contra piedra
				   jugador.equals("tijera") && comp == 1 ? "Ha ganado el jugador" : //Tijera contra papel
					   									   "Empate"					   
			);
		
		System.out.println(ganador);
		
		entrada.close();
	}

}
