package boletin4;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Desarrolla un programa que implemente el clásico juego de las tres en raya, destinado
a dos jugadores. El tablero constará de 3 filas (1, 2 y 3) y 3 columnas (A, B y C), y se
mostrará en la pantalla. Los jugadores se alternarán para ingresar sus movimientos,
representados por "X" y "O" respectivamente. El juego continuará hasta que uno de
los jugadores logre alinear tres de sus símbolos en línea horizontal, vertical o diagonal,
o hasta que el tablero se llene sin que ningún jugador logre la victoria. En ese
momento, se declarará el resultado del juego como ganador, empate o ninguna
conclusión. Además, después de cada movimiento, el programa mostrará el estado
actual del tablero para que los jugadores puedan seguir el progreso del juego.

 */
public class Ejercicio6 {

	public static void main(String[] args) {
		char[][] arrayTablero = new char[3][3];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<=2; i++) {
			System.out.print((i + 1) + "");
			for(char j=0; j<=2; j++) {
				System.out.print("   -   ");
				arrayTablero[i][j] = '-';
			}
			System.out.println("\n");				
		}
		System.out.print("    a      b      c");
		
		boolean ganador = false;
		int numJugadas = 0;
		String jugada = "";
		int fila, columna, filaComp, columnaComp;
		
		do {
			boolean correcto = false;
			while(!correcto) {
				System.out.print("\n\nIntroduce jugada(por ejemplo '1a'): ");
				jugada = scan.nextLine();
				//resultado = (condicion)?valor1:valor2;
				
				fila = Character.getNumericValue(jugada.charAt(0) - 1);
				columna = (jugada.charAt(1) == 'a') ? 0:  (jugada.charAt(1) == 'b'? 1: 2)  ;
				System.out.println("Jugada: " + fila + " " + columna);
			
				if(arrayTablero[fila][columna]=='-' && arrayTablero[fila][columna] !='X' && arrayTablero[fila][columna] !='O' ) {
					arrayTablero[fila][columna] = 'X';
					correcto = true;
					
				} else {
					System.err.print("\nError, jugada incorrecta. Elige una nueva jugada.");
				}
			}
			
			
			boolean correctoComp = false;
			while (!correctoComp) {
				filaComp = (int)(Math.random() * 3);
				columnaComp = (int)(Math.random() * 3);
				System.out.printf("\n\nJugada Comp: %d %d\n\n", filaComp, columnaComp);
				if(arrayTablero[filaComp][columnaComp]=='-' && arrayTablero[filaComp][columnaComp] !='X' && arrayTablero[filaComp][columnaComp] !='O' ) {
					arrayTablero[filaComp][columnaComp] = 'O';
					correctoComp = true;
				}
			}
			for(int i=0; i<=2; i++) {
				System.out.print((i + 1) + "");
				for(char j=0; j<=2; j++) {
					if(arrayTablero[i][j] == '-') { 
						System.out.print("   -   ");
					}else {
						System.out.print("   " + arrayTablero[i][j] + "   ");
					}
				}
				System.out.println("\n");				
			}
			System.out.print("    a      b      c");		
			
		} while (!ganador && numJugadas < 10);	
		scan.close();
	}

}
