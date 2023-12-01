package boletin4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		final String RESET = "\u001B[0m";
		final String ROJO = "\u001B[31m";
		System.out.println("Introduce la posición del alfil, con el formato LETRANUMERO. Ejemplo: \"d5\"");
		Scanner scan = new Scanner(System.in);
		String posicionAlfil = scan.nextLine();
		scan.close();
		char letra = posicionAlfil.charAt(0);
		char numero = posicionAlfil.charAt(1);
		//Imprimir tablero
		for (char fila = '8'; fila >= '1'; fila--) {
			for (char columna = 'a'; columna <= 'h'; columna++) {
				if (letra == columna && numero == fila) {
					System.out.print("X\t");
				} else {
					System.out.print(columna + "" + fila + "\t");
				}
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		System.out.print("\n");
		
		char[] arrayFilas = new char[15];
		char[] arrayColumnas = new char[15];
		
		// Calculo la diagonal arriba-derecha
		System.out.print("Diagonal arriba-derecha");
		char fila = numero;
		char columna = letra;
		int indiceFilas = 0;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayFilas[indiceFilas] = fila;
				arrayColumnas[indiceFilas] = columna;
				indiceFilas++;
			}
			columna++;
			fila++;
		}
		System.out.print("\nDiagonal abajo-derecha");
		// Calculo la diagonal abajo-derecha
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayFilas[indiceFilas] = fila;
				arrayColumnas[indiceFilas] = columna;
				indiceFilas++;
			}
			columna++;
			fila--;
		}
		System.out.print("\nDiagonal abajo-izquierda");
		// Calculo la diagonal abajo-izquierda
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayFilas[indiceFilas] = fila;
				arrayColumnas[indiceFilas] = columna;
				indiceFilas++;
			}
			columna--;
			fila--;
		}
		System.out.print("\nDiagonal arriba-izquierda");
		// Calculo la diagonal arriba-izquierda
		// TODO: EXTRA. Una vez calculados los movimientos, pintarlos en rojo en la
		// matriz
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') {
			if (fila != numero && columna != letra) {
				System.out.print(" " + columna + fila);
				arrayFilas[indiceFilas] = fila;
				arrayColumnas[indiceFilas] = columna;
				indiceFilas++;
			}
			columna--;
			fila++;
		}
		
		System.out.println("\n\n");
		boolean encontrado = true;
		for (char filaColor = '8'; fila >= '1'; fila--) {
			for (char columnaColor = 'a'; columna <= 'h'; columna++) {
				if (letra == columna && numero == fila) {
					System.out.print("X\t");
				} else {
					encontrado = false;
					int indice = indiceFilas;
					while (indice > 0 && !encontrado){
						if(filaColor == arrayFilas[indice] &&  columnaColor == arrayColumnas[indice]) {
							encontrado = true;
						}
						indice--;
						
					}
					if(encontrado) {
						System.out.print(ROJO + columna + "" + fila + "\t" + RESET);
					} else {
						System.out.print(columna + "" + fila + "\t");
					}
					
				}
			}
			System.out.print("\n");
		}
		
		
	}

}
