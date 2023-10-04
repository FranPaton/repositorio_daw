package estructurascontrol;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		
		int i;
		String msg = "Impar";
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		i = scn.nextInt();
		if(i % 2 == 0) {
			msg = "Par";
		}
		
		System.out.println("\nEl número " + i + " es " + msg);
		
		scn.close();
	}
	

}
