package boletin2;
import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {

        int jugadorElige = 0, compElige = 0;
        Scanner entrada = new Scanner(System.in);
        compElige = (int)Math.floor(Math.random()*3);
        boolean entradaCorrecta = false;
        
        String piedraDibujo = "    _______" 
                        + "\n---'   ____)" 
                        + "\n      (_____)" 
                        + "\n      (_____)" 
                        + "\n      (____)" 
                        + "\n---.__(___)"
                        + "\n  PIEDRA";

        String papelDibujo = "    _______" 
                        + "\n---'   ____)____" 
                        + "\n          ______)" 
                        + "\n          _______)" 
                        + "\n         _______)" 
                        + "\n---.__________)  "
                        + "\n  PAPEL" ;

        String tijeraDibujo = "    _______"
                        + "\n---'   ____)_____  "
                        + "\n          _______)"
                        + "\n       ___________)"
                        + "\n      (____)"
                        + "\n---.__(___)"
                        + "\n  TIJERA";

        System.out.println("============= PIEDRA, PAPEL, TIJERA =============");
        System.out.println("\nJugador elige: "
                        + "\n   1. Piedra"
                        + "\n   2. Papel"
                        + "\n   3. Tijera" );
        
        jugadorElige = entrada.nextInt() - 1;
        if (jugadorElige >= 0 && jugadorElige <= 2) {
            entradaCorrecta = true;
        }             
       
        if (entradaCorrecta) {
            System.out.println("\nJugador elige " + jugadorElige + ". Computadora elige " + compElige +"\n");

            System.out.println("\nJugador ha elegido: \n" + (jugadorElige == 0 ? piedraDibujo :  jugadorElige == 1 ? papelDibujo : tijeraDibujo ));
            System.out.println("\nComputadora ha elegido: \n" + (compElige == 0 ? piedraDibujo :  compElige == 1 ? papelDibujo : tijeraDibujo ));
            
            // Jugador gana si
            // PIEDRA - TIJERA
            // PAPEL - PIEDRA
            // TIJERA - PAPEL
            // PIEDRA = 0, PAPEL = 1, TIJERA = 2

            if (jugadorElige == compElige) {
                System.out.println("\nEMPATE.");
            } else if (jugadorElige == 0 && compElige == 2 || jugadorElige == 1  && compElige == 0 || jugadorElige == 2 && compElige == 1) {
                System.out.println("\nJUGADOR GANA.\n");
            } else {
                System.out.println("\nCOMPUTADORA GANA.\n");
            }

        }
        else {
            System.out.println("\nError. Elige una opción correcta, de 1 a 3.\n");
        }
        
        entrada.close();
    }
    
}
