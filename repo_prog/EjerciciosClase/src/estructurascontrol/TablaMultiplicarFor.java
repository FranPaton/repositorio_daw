package estructurascontrol;

/*
 
 Dado un número num, mostrar su tabla de multiplicar con el bucle for
 
 */

public class TablaMultiplicarFor {

	public static void main(String[] args) {
		
		int num = 7;
		
		System.out.println("Tabla de multiplicar del " + num);
		for(int i = 0; i<= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		

	}

}
