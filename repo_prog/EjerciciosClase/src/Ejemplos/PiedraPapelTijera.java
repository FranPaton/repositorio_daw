import java.util.Scanner;

public class PruebaJugadores {

	public static void main(String[] args) {
		
		int computer = (int)Math.floor((Math.random() * 3));
		String jugador;
		
		System.out.println(computer);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Jugador elige: piedra, papel o tijera");
		jugador = entrada.nextLine();
		System.out.println(computer == 0 ? "Computadora he elegido piedra" : 
						   computer == 1 ? "Computadora ha elegido papel" :
							   			   "Computadora ha elegido tijera"
						 );
							
		
		 //Piedra = 0; Papel = 1; Tijera = 2
		
		System.out.println(jugador.equals("piedra") 0 && computer ==1 ? "Computadora he elegido piedra" : 
			   computer == 1 ? "Computadora ha elegido papel" :
				   			   "Computadora ha elegido tijera"
			 );
		
		
		
		entrada.close();

	}

}
