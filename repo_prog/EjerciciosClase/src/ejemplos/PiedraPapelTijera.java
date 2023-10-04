package ejemplos;
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
		System.out.println("Jugador ha elegido " + jugadorElige);	
		
		//Piedra = 0; Papel = 1; Tijera = 2
		compElige = (comp == 0 ? "piedra" : 
	   		 		 comp == 1 ? "papel" :
	   			 		         "tijera");
		
		System.out.println("Computadora ha elegido " + compElige + ".");
		
		ganador = (jugadorElige.equals(compElige)) ? "Empate " :                    //Mismo resultado, empate
			  	  (jugadorElige.equals("piedra") && compElige.equals("tijera")) ||  //Jugador gana, piedra contra tijera 
			      (jugadorElige.equals("papel") && compElige.equals("piedra") ||    //Jugador gana, papel contra piedra
			      (jugadorElige.equals("tijera") && compElige.equals("papel")))     //Jugdador gana, tijera contra papel
                  ? "Gana el jugador." :  "Gana la computadora.";                   // Si no gana el jugador, gana la computadora, el empate ya se resuelve en la primera comparación
		
		System.out.println(ganador);
		
		entrada.close();
	}

}
