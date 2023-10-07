package ejemplos;
import java.util.*;

public class EjemploTiposApp {



	public static void main(String[] args) {
		
		boolean bool = true;
		int i = 1;
		byte b = 5;
		short sh = 1000;
		long lo = 100000000;
		float f = 2.5f;
		double d = 5.767;
		char c = 'X';
		String s = "Cadena";
		int intArray[] = {1,3,5,7,9};
		
		System.out.println("La variable 'bool' es de tipo boolean y su valor es " + bool);
		System.out.println("La variable 'i' es de tipo int y su valor es " + i);
		System.out.println("La variable 'b' es de tipo byte y su valor es " + b);
		System.out.println("La variable 'sh' es de tipo short y su valor es " + sh);
		System.out.println("La variable 'lo' es de tipo long y su valor es " + lo);
		System.out.println("La variable 'f' es de tipo float y su valor es " + f);
		System.out.println("La variable 'd' es de tipo double y su valor es " + d);
		System.out.println("La variable 'c' es de tipo char y su valor es " + c);
		System.out.println("La variable 's' es de tipo String y su valor es " + s);
		System.out.println("La variable 'intArray' es una variable de tipo array de enteros y su valor es " + Arrays.toString(intArray));		

	}

}
