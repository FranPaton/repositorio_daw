package boletin4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	
		char[][] arrayTablero = new char[6][7];
		Scanner scan = new Scanner(System.in);
		int numJugadas = 0;
		int jugada;
		for(int i=5; i>=0;i--) {
			System.out.print((i) + "\t");
			for(int j=0; j<=6;j++) {
				System.out.print("-\t");
				arrayTablero[i][j] = '-';
			}
			System.out.println("\n");
		}
		System.out.println("\t0\t1\t2\t3\t4\t5\t6");
		do {
			boolean jugadaCorrecta = false;
			do {
				System.out.println("\nIntroduce jugada de jugador 1");
				jugada = scan.nextInt();
				if (jugada >= 0 && jugada <= 6) {
					int fila= 0;
					boolean columnaCompleta = false;
					while(arrayTablero[fila][jugada] != '-' &&fila <=5 && !columnaCompleta) {
						if(fila == 5) {
							System.out.println("Columna completa");
							columnaCompleta = true;
						} else {	
							fila++;
						}
					}
					if (arrayTablero[fila][jugada] == '-' ) {
						arrayTablero[fila][jugada] = 'X';
						jugadaCorrecta = true;
						numJugadas++;
					}
				} else {
					System.out.println("Error, columna incorrecta");
				}
				
			} while (!jugadaCorrecta);
			
		
			
			for(int i=5; i>=0;i--) {
				System.out.print((i) + "\t");
				for(int j=0; j<=6;j++) {
					System.out.print(arrayTablero[i][j] + "\t");
					
				}
				System.out.println("\n");
			}
			System.out.println("\t0\t1\t2\t3\t4\t5\t6");
			
			do {
				System.out.println("\nIntroduce jugada de jugador 2");
				jugada = scan.nextInt();
				jugadaCorrecta = false;
				if (jugada >= 0 && jugada <= 6) {
					int fila= 0;
					boolean columnaCompleta = false;
					while(arrayTablero[fila][jugada] != '-' &&fila <=5 && !columnaCompleta) {
						if(fila == 5) {
							System.out.println("Columna completa");
							columnaCompleta = true;
						} else {	
							fila++;
						}
					}
					if (arrayTablero[fila][jugada] == '-' ) {
						arrayTablero[fila][jugada] = 'O';
						jugadaCorrecta = true;
						numJugadas++;
					}
				} else {
					System.out.println("Error, columna incorrecta");
				}
				
			} while (!jugadaCorrecta);
			
		
			
			for(int i=5; i>=0;i--) {
				System.out.print((i) + "\t");
				for(int j=0; j<=6;j++) {
					System.out.print(arrayTablero[i][j] + "\t");
					
				}
				System.out.println("\n");
			}
			System.out.println("\t0\t1\t2\t3\t4\t5\t6");
		
			int contX = 0;
			for (int i = 0; i < arrayTablero.length; i++) {
				for (int j = 0; j < arrayTablero.length; j++) {
					
				}
				
			}
			System.out.println("\nContador: " + contX);
			
		}while (numJugadas<=42);
		
	}

}
