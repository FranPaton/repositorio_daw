package com.franciscoramirezpaton.tarea3;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MaquinaExpendedora {

	public static void main(String[] args) {
		
		String[][] productos = {{"Coca-Cola", "Sprite", "Fanta naranja"},
				 				{"Fanta limón", "Red Bull", "Monster"},
				 				{"Pepsi", "Schweppes tónica", "Agua mineral"},
				 				{"Cruzcampo", "Heineken", "Zumo de piña"}	};
		
		int[][] cantidadProductos = {{5, 5, 5},
				           		  {5, 5, 5},
				           		  {5, 5, 5},
				           		  {5, 5, 5}};
		
		int[][] cantidadVendidas = {{0, 0, 0},
	            					{0, 0, 0},
	            					{0, 0, 0},
	            					{0, 0, 0}};
			
		Scanner scn = new Scanner(System.in);
		int opcionMenu = 0;
	
		do {
			opcionMenu = mostrarMenu();
			switch(opcionMenu) {
			case 1:
				mostrarBebidas(productos, cantidadProductos);
				System.out.println("\n");
				break;
				
			case 2:			
				opcionPedirBebida(productos, cantidadProductos, cantidadVendidas);
				break;
				
			case 3:
				opcionRecargarBebida(productos, cantidadProductos);
				break;
				
			case 4:
				System.out.println("\nPrograma terminado.");
				mostrarVentas(productos, cantidadVendidas);
				break;
			default:
				System.out.println("Error, opción incorrecta. Elige una opción de 1 a 4.");
				break;
			}
		} while (opcionMenu!=4);
		scn.close();
	}
	
	public static int mostrarMenu() {	
		Scanner scn = new Scanner(System.in);
		int opcionMenu = 0;
		boolean opcionCorrecta = false;
			
		do {
			System.out.println("--- MAQUINA EXPENDEDORA ---"
					+ "\n1. Mostrar bebidas"
					+ "\n2. Pedir bebida"
					+ "\n3. Rellenar bebidas"
					+ "\n4. Apagar máquina");
			
			try {
				opcionMenu = scn.nextInt();
				if(opcionMenu >= 1 && opcionMenu <= 4) {
					opcionCorrecta = true;
				} else {
					System.out.println("\nError, opción incorrecta. Por favor, elige una opción de 1 a 4\n");
					opcionCorrecta = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nError, opción incorrecta. Por favor, elige una opción de 1 a 4\n");
				opcionCorrecta = false;
				scn.next();
			}
			
		}while (!opcionCorrecta);
		
		return(opcionMenu);
	}
	
	public static int mostrarMenuTecnico() {	
		Scanner scn = new Scanner(System.in);
		int opcionMenu = 0;
		boolean opcionCorrecta = false;	
		
		do {
			System.out.println("\n1. Mostrar bebidas"
							+ "\n2. Rellenar bebidas"
							+ "\n3. Salir");
			
			try {
				opcionMenu = scn.nextInt();
				if(opcionMenu >= 1 && opcionMenu <= 3) {
					opcionCorrecta = true;
				} else {
					System.out.println("\nError, opción incorrecta. Por favor, elige una opción de 1 a 3\n");
					opcionCorrecta = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nError, opción incorrecta. Por favor, elige una opción de 1 a 3\n");
				opcionCorrecta = false;
				scn.next();
			}
			
		}while (!opcionCorrecta);
		
		return(opcionMenu);
	}
	
	
	public static boolean codigoCorrecto(String codigoBebida) {
		boolean codigoCorrecto = false;
		if(StringUtils.isNumeric(codigoBebida) && codigoBebida.length() == 2) {
			int fila = Character.getNumericValue(codigoBebida.charAt(0));
			int columna = Character.getNumericValue(codigoBebida.charAt(1));
			if(fila >=0 && fila <=2 & columna >=0 && columna <=2) {
				codigoCorrecto = true;
			}
		}
		return(codigoCorrecto);
	}
	
	public static void mostrarBebidas(String[][] productos, int[][] cantidadProductos) {
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=2; j++) {
				if(cantidadProductos[i][j] > 0) {
					System.out.printf("\n(%s) - %s  ", ("" + i + j), productos[i][j]);
				}
			}
		}
	}
	
	public static void opcionPedirBebida (String[][] productos, int[][] cantidadProductos, int[][] cantidadVendidas){
		Scanner scn = new Scanner(System.in);
		System.out.print("\nIntroduce el código de la bebida: ");
		try {
			String codigoBebida = scn.nextLine();
			if(codigoCorrecto(codigoBebida)) {
				pedirBebida(productos, cantidadProductos, cantidadVendidas, codigoBebida);
			} else {
				System.out.println("Error, código incorrecto. Por favor, introduce un código correcto de dos digitos.");
			}						
		}
		catch (InputMismatchException e) {
			System.out.println("Error, has introducido un código no válido. Por favor introduce un código númerico de dos digitos");	
		}
		
	}
	
	public static void pedirBebida(String[][] productos, int[][] cantidadProductos, int[][] cantidadVendidas, String codigoBebida) {
		int fila = Character.getNumericValue(codigoBebida.charAt(0));
		int columna = Character.getNumericValue(codigoBebida.charAt(1));
		if(cantidadProductos[fila][columna] > 0) {
			System.out.printf("\nHas elegido %s, ¡que lo disfrutes!\n\n", productos[fila][columna]);
			cantidadProductos[fila][columna]--;
			cantidadVendidas[fila][columna]++;
		}
		else {
			System.out.printf("\nNo queda %s, por favor, elige otra bebida.", productos[fila][columna]);
		}	
		
	}
	
	public static boolean comprobarPassword (String strPassword) {
		String pass = "2024";
		return(pass.equals(strPassword));	
	}
	
	public static void mostrarBebidasTecnico(String[][] productos, int[][] cantidadProductos) {
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=2; j++) {
				System.out.printf("\n(%s) - %s - Cantidad: %d ", ("" + i + j), productos[i][j], cantidadProductos[i][j]);
			}
		}
	}
	
	public static void opcionRecargarBebida (String[][] productos, int[][] cantidadProductos ) {
		String strPassword = "";
		int opcionTecnico = -1;
		boolean logged = false;
		int intentosPassword = 3;
		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("\n--- PANEL DE ADMINISTRACION ---");
			if(!logged) {
				
				System.out.printf("\nIntroduce la contraseña de técnico para recargar bebidas (%d intentos): ", intentosPassword--);
				strPassword = scn.nextLine();
				if(comprobarPassword(strPassword)) {
					logged = true;
				} else {
					if(intentosPassword >= 1) {
						System.out.println("Error, contraseña incorrecta.");
					} else {
						System.out.println("Demasiados intentos fallidos. Saliendo del panel de administración.\n");
					}
				}
				
			} else {
				opcionTecnico = mostrarMenuTecnico();
				switch(opcionTecnico) {
					case 1:
						mostrarBebidasTecnico(productos, cantidadProductos);
						break;
					case 2:
						recargarBebidas(productos, cantidadProductos);
						break;	
					case 3: 
						System.out.println("\nSaliendo del panel de administración");
						break;
					default:
						break;
				}		
			}
		} while (opcionTecnico != 3 && intentosPassword >=1);	
	}
	
	public static void recargarBebidas(String[][] productos, int[][] cantidadProductos) {
		Scanner scn = new Scanner(System.in);
		String codigoBebida = "";
		System.out.print("\nIntroduce el código de la bebida a recargar: ");
		codigoBebida = scn.nextLine();
		int cantidadRecarga = 0;
		if(codigoCorrecto(codigoBebida)) {
			int fila = Character.getNumericValue(codigoBebida.charAt(0));
			int columna = Character.getNumericValue(codigoBebida.charAt(1));
			System.out.printf("\nIntroduce la cantidad de %s que deseas recargar: ", productos[fila][columna]);
			try {
				cantidadRecarga = scn.nextInt();
				if(cantidadRecarga > 0) {
					cantidadProductos[fila][columna] += cantidadRecarga;
					System.out.printf("\nSe han añadido %d unidades de %s", cantidadRecarga, productos[fila][columna]);
					
				} else {
					System.out.println("Error, la cantidad debe ser mayor que 0.");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Error, introduce una cantidad correcta.");
			}						
		} else {
			System.out.println("\nError, código incorrecto. Por favor, introduce un código correcto de dos digitos.");
		}
	}
	
	public static void mostrarVentas(String[][] productos, int[][] cantidadVendidas) {
		System.out.println("\n--- VENTAS TOTALES ---");
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=2; j++) {
				if(cantidadVendidas[i][j] > 0) {
					System.out.printf("\n%s : %d ", productos[i][j], cantidadVendidas[i][j]);
				}
				
			}
		}
	}	
	
}
