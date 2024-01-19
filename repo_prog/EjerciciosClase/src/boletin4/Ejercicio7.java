package boletin4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		final char FICHAJUGADOR1 = 'X';
		final char FICHAJUGADOR2 = 'O';
		final String RESET = "\u001B[0m";
		final String VERDE = "\u001B[32m";
		final String ROJO = "\u001B[31m";
		
		
		char[][] arrayTablero = new char[6][7];
		Scanner scan = new Scanner(System.in);
		int numJugadas = 0;
		int jugada;
		boolean ganador = false;
		for (int i = 5; i >= 0; i--) {
			System.out.print((i) + "\t");
			for (int j = 0; j <= 6; j++) {
				System.out.print("-\t");
				arrayTablero[i][j] = '-';
			}
			System.out.println("\n");
		}
		System.out.println("\t0\t1\t2\t3\t4\t5\t6");
		do {
			boolean jugadaCorrecta = false;
			do {
				System.out.print("\nIntroduce jugada de " + VERDE + "JUGADOR 1: " + RESET);
				jugada = scan.nextInt();
				if (jugada >= 0 && jugada <= 6) {
					int fila = 0;
					boolean columnaCompleta = false;
					while (arrayTablero[fila][jugada] != '-' && fila <= 5 && !columnaCompleta) {
						if (fila == 5) {
							System.out.println("Columna completa");
							columnaCompleta = true;
						} else {
							fila++;
						}
					}
					if (arrayTablero[fila][jugada] == '-') {
						arrayTablero[fila][jugada] = FICHAJUGADOR1;
						jugadaCorrecta = true;

						if (comprobarGanador(arrayTablero, fila, jugada, FICHAJUGADOR1)) {
							System.out.println(VERDE + "¡¡¡ Gana el jugador1 !!!" + RESET);
							ganador = true;

						}

						numJugadas++;
						System.out.println("\n\nJugadas" + numJugadas + "\n\n");

					}
				} else {
					System.out.println("Error, columna incorrecta");
				}

			} while (!jugadaCorrecta && !ganador);

			pintarTablero(arrayTablero);

			
			if(!ganador) {
				do {
					System.out.print("\nIntroduce jugada de " + ROJO + "JUGADOR 2: " + RESET);
					jugada = scan.nextInt();
					jugadaCorrecta = false;
					if (jugada >= 0 && jugada <= 6) {
						int fila = 0;
						boolean columnaCompleta = false;
						while (arrayTablero[fila][jugada] != '-' && fila <= 5 && !columnaCompleta) {
							if (fila == 5) {
								System.out.println("Columna completa");
								columnaCompleta = true;
							} else {
								fila++;
							}
						}
						if (arrayTablero[fila][jugada] == '-') {
							arrayTablero[fila][jugada] = FICHAJUGADOR2;
							jugadaCorrecta = true;

							if (comprobarGanador(arrayTablero, fila, jugada, FICHAJUGADOR2)) {
								System.out.println(ROJO + "¡¡¡ Gana el jugador 2 !!!" + RESET);
								ganador = true;

							}
							numJugadas++;
						}
					} else {
						System.out.println("Error, columna incorrecta");
					}
	
				} while (!jugadaCorrecta);
				
				pintarTablero(arrayTablero);
			}

			

		} while (numJugadas <= 42 && !ganador);

	}

	public static boolean comprobarGanador(char[][] arrayTablero, int fila, int jugada, char fichaJugador) {
		boolean ganador = false;
		//Comprobar columna hacia abajo para jugador 1
		
			int i = fila, cont = 0, j = 0;
			if (arrayTablero[i][jugada] == fichaJugador)
				while (i >= 0 && arrayTablero[i][jugada] == fichaJugador && cont <= 4) {
					cont++;
					i--;
				}
			if (cont == 4) {
				ganador = true;
			}
			
			//Comprobar diagonal abajo derecha

			if(!ganador) {
				cont = 0;
				i = 6 - fila - 1; 
				j = 7 - jugada - 1;
				if(arrayTablero[i][j] == fichaJugador) {
					while(i>=0 && j<=6 && arrayTablero[i][j] == fichaJugador && cont <= 4) {
						i--;
						j++;
						cont++;
					}
					
					while(i>=0 && j<=6 && arrayTablero[i][j] == fichaJugador && cont <= 4) {
						i--;
						j++;
						cont++;
					}
					
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			//Comprobar diagonal abajo izquierda
			if(!ganador) {
				i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == fichaJugador) {
					while(i>=0 && j>=0 && arrayTablero[i][j] == fichaJugador && cont <= 4) {
						i--;
						j--;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			} 
			
			//Comprobar diagonal arriba derecha
			if(!ganador) {
				cont = 0;
				i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == fichaJugador) {
					while(i<=5 && j<=6 && arrayTablero[i][j] == fichaJugador && cont <= 4) {
						i++;
						j++;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			//Comprobar diagonal arriba izquierda
			if(!ganador) {
				i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == fichaJugador) {
					while(i<=5 && j>=0 && arrayTablero[i][j] == fichaJugador && cont <= 4) {
						i++;
						j--;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			
		
		//Comprobar fila hacia la derecha
		if(jugada <= 3 && !ganador) {
			i = jugada;
			cont = 0;
			if (arrayTablero[fila][i] == fichaJugador)
				while (i <=6 && arrayTablero[fila][i] == fichaJugador && cont <= 4) {
					cont++;
					i++;
				}
			if (cont == 4) {
				ganador = true;
			}
		}
		//Comprobar fila hacia la izquierda
		if(jugada >= 3 &&!ganador) {
			i = jugada;
			cont = 0;
			if (arrayTablero[fila][i] == fichaJugador)
				while (i >= 0 && arrayTablero[fila][i] == fichaJugador && cont <= 4) {
					cont++;
					i--;
				}
			if (cont == 4) {
				ganador = true;
			}
		}
		
		return (ganador);
	}
	
	public static void pintarTablero(char[][] arrayTablero) {
		final char FICHAJUGADOR1 = 'X';
		final char FICHAJUGADOR2 = 'O';
		final String RESET = "\u001B[0m";
		final String VERDE = "\u001B[32m";
		final String ROJO = "\u001B[31m";
		for (int i = 5; i >= 0; i--) {
			System.out.print((i) + "\t");
			for (int j = 0; j <= 6; j++) {
				if(arrayTablero[i][j] == FICHAJUGADOR1) {
					System.out.print(VERDE + arrayTablero[i][j] + "\t" + RESET);
				} else if(arrayTablero[i][j] == FICHAJUGADOR2){
					System.out.print(ROJO + arrayTablero[i][j] + "\t" + RESET);
				}
				else {
					System.out.print(arrayTablero[i][j] + "\t");
				}

			}
			System.out.println("\n");
		}
		System.out.println("\t0\t1\t2\t3\t4\t5\t6");
		
	}
	/*
	public static boolean comprobarGanador(char[][] arrayTablero, int fila, int jugada, char fichaJugador) {
		boolean ganador = false;
		//Comprobar columna hacia abajo para jugador 1
		if (fila >= 3) {
			
			int i = fila, cont = 0;
			if (arrayTablero[i][jugada] == 'X')
				while (i >= 0 && arrayTablero[i][jugada] == 'X' && cont <= 4) {
					cont++;
					i--;
				}
			if (cont == 4) {
				ganador = true;
			}
			//Comprobar diagonal abajo derecha
			if(jugada <= 3 && !ganador) {
				i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == 'X') {
					while(i>=0 && j<=6 && arrayTablero[i][j] == 'X' && cont <= 4) {
						i--;
						j++;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			//Comprobar diagonal abajo izquierda
			if(jugada >= 3 && !ganador) {
				i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == 'X') {
					while(i>=0 && j>=0 && arrayTablero[i][j] == 'X' && cont <= 4) {
						i--;
						j--;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			
			
		} else {  // i<3
			int cont = 0;
			//Comprobar diagonal arriba derecha
			if(jugada <= 3 && !ganador) {
				int i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == 'X') {
					while(i<=5 && j<=6 && arrayTablero[i][j] == 'X' && cont <= 4) {
						i++;
						j++;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			//Comprobar diagonal arriba izquierda
			if(jugada >= 3 && !ganador) {
				int i = fila;
				int j = jugada;
				cont = 0;
				if(arrayTablero[i][j] == 'X') {
					while(i<=5 && j>=0 && arrayTablero[i][j] == 'X' && cont <= 4) {
						i++;
						j--;
						cont++;
					}
				}
				if (cont == 4) {
					ganador = true;
				}	
			}
			
			
		}
		//Comprobar fila hacia la derecha para jugador 1
		if(jugada <= 3 && !ganador) {
			int i = jugada, cont = 0;
			if (arrayTablero[fila][i] == 'X')
				while (i <=6 && arrayTablero[fila][i] == 'X' && cont <= 4) {
					cont++;
					i++;
				}
			if (cont == 4) {
				ganador = true;
			}
		}
		//Comprobar fila hacia la izquierda para jugador 1
		if(jugada >= 3 &&!ganador) {
			int i = jugada, cont = 0;
			if (arrayTablero[fila][i] == 'X')
				while (i >= 0 && arrayTablero[fila][i] == 'X' && cont <= 4) {
					cont++;
					i--;
				}
			if (cont == 4) {
				ganador = true;
			}
		}
		
		return (ganador);
	}*/

}
