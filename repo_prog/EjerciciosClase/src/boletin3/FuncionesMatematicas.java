package boletin3;

import java.awt.Rectangle;

/*
 */
public class FuncionesMatematicas {
	
	public static int volteaNumero (int num) {
		int digit, aux, numInverso=0;
		aux=num;
		while (aux != 0) {
			digit = aux % 10;
			numInverso = numInverso * 10 + digit;
			aux /= 10;
		}
		return(numInverso);
	}
	
	public static boolean esCapicua(int num) {
		boolean capicua = false;
		if(num == volteaNumero(num)) {
			capicua = true;
		}
		return(capicua);
		
	}
	
	public static boolean esPrimo (int num) {
		int i = 2;
		boolean esPrimo = true;
		while(i < num && esPrimo) {
			if (num % i == 0) {
				esPrimo = false;
			}	
			i++;
		}
		return (esPrimo);
	}
	
	public static int siguientePrimo(int num) {
		int aux = num + 1;
		while(!esPrimo(aux)) {
			aux++;
		}
		return(aux);
	}
	
	public static long potencia(int base, int exponente) {
		long numPotencia = 1;
		for (int i=0; i < exponente; i++) {
			numPotencia = numPotencia * base;
		}
		return(numPotencia);
	}
	
	public static int numeroDigitos (long num) {
		long aux = num;
		int contDigitos = 0;
		while (aux != 0) {
			aux /= 10;
			contDigitos++;
		}
		return (contDigitos);
	}
	
	public static int nDigito (int num, int posicion) throws Exception{	
		int aux = num;
		int longNumero = numeroDigitos (num);
		int digito = 0;
		int i = longNumero - 1;
		
		if (posicion > longNumero - 1) {
			throw new Exception ("La posición está fuera de la longitud del número");
		}	
		while (i >= posicion) {
				digito = aux % 10;
				aux /= 10;
				i--;
		}		
		return(digito);		
	}
	
	public static int posicionDigito (int num, int digito) {
		int posicion = numeroDigitos(num) - 1;
		try {
			while (posicion >= 0 && nDigito(num, posicion) != digito) {
				posicion--;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return(posicion);	
	}
	
	public static int quitaPorDetras (int num, int digitos) throws Exception{
		int result = num;
		int longNum = numeroDigitos(num);

		if (digitos == longNum) {
			throw new Exception ("Error, no se pueden quitar todos los digitos");
		}
		if(digitos > longNum - 1) {
			throw new Exception ("Error, se intentan quitar más digitos que la longitud del número");
		}
		for(int i=0; i<digitos; i++) {
			result/=10;
		}
		return(result);				
	}
	
	public static int quitaPorDelante (int num, int digitos) throws Exception{
		int result = 0;
		int longNum = numeroDigitos(num);
		int auxDelante;
		
		if (digitos == longNum) {
			throw new Exception ("Error, no se pueden quitar todos los digitos");
		}
		if(digitos > longNum - 1) {
			throw new Exception ("Error, se intentan quitar más digitos que la longitud del número");
		}
		
		auxDelante = (num / (int)potencia(10, longNum - digitos)) * (int)potencia(10,(longNum - digitos));
		//System.out.println("\n\n" + (num - auxDelante));
		result = num - auxDelante;
		return(result);		
	}
	
	public static int trozoDeNumero (int num, int inicio, int fin) throws Exception{
		int longNum = numeroDigitos(num);
		int auxDelante, result;
		
		auxDelante = quitaPorDelante(num, inicio);
		result = quitaPorDetras(auxDelante, longNum - fin - 1);
		
		return(result);		
	}
	
	public static int juntaNumeros (int num1, int num2) {
		int longNum2 = numeroDigitos(num2);
		int result = num1 * (int)potencia(10, longNum2) + num2;
		return(result);
	}
	
	public static char letraNif (int num) throws Exception{	
		String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (numeroDigitos(num) != 8) {
			throw new Exception("Error, el número del NIF debe tener 8 dígitos");
		}
		int numChar = num % 23;
		return(letrasNif.charAt(numChar));
	}
	
	public static boolean nifCorrecto(String nif) throws Exception {
		char letraNif;
		int numNif;
		boolean nifCorrecto = false;
		if (nif.length()!= 9) {
			throw new Exception("Error, el NIF debe tener 9 caracteres, 8 cifras y una letra");
		}
		letraNif = nif.charAt(8);
		try {
			numNif = Integer.parseInt(nif.substring(0,8));
		} catch (Exception e) {
			throw new Exception ("Error, el NIF debe tener 9 caracteres, 8 cifras y una letra");
		}
		if(letraNif == letraNif(numNif)){
			nifCorrecto = true;
		}
		System.out.printf("\n\nNumero: %d, Letra NIF = %c", numNif, letraNif);
		return (nifCorrecto);	
	}
	
	public static double areaCirculo (double radio) throws Exception{
		final double PI = 3.14159;
		if (radio <= 0 ) {
			throw new Exception ("Error, el radio debe ser un número mayor que 0") ;
		}
		return(PI * radio * radio);
	}
	
	public static double areaRectangulo (double base, double altura) throws Exception{
		if (base <= 0 || altura < 0) {
			throw new Exception ("Error, la base y la altura deben ser números mayor que 0") ;
		}
		return(base * altura);
	}
	
	public static void cambioExacto (double cantidadDevuelta)  throws Exception{
		if (cantidadDevuelta < 0) {
			throw new Exception ("Error, la cantidad debe ser un número mayor que 0");
		}
		int cantidadCentimos =(int) (cantidadDevuelta * 100);
		int billetes500 = (int)(cantidadCentimos / 50000);
		cantidadCentimos %= 50000;
		int billetes200 = (int)(cantidadCentimos / 20000);
		cantidadCentimos %= 20000;
		int billetes100 = (int)(cantidadCentimos / 10000);
		cantidadCentimos %= 10000;
		int billetes50 = (int)(cantidadCentimos / 5000);
		cantidadCentimos %= 5000;
		int billetes20 = (int)(cantidadCentimos / 2000);
		cantidadCentimos %= 2000;
		int billetes10 = (int)(cantidadCentimos / 1000);
		cantidadCentimos %= 1000;
		int billetes5 = (int)(cantidadCentimos / 500);
		cantidadCentimos %= 500;
		int monedas2Euros = (int)(cantidadCentimos / 200);
		cantidadCentimos %= 200;
		int monedas1Euro = (int)(cantidadCentimos / 100);
		cantidadCentimos %= 100;
		int monedas50Cent = (int)(cantidadCentimos / 50);
		cantidadCentimos %= 50;
		int monedas20Cent = (int)(cantidadCentimos / 20);
		cantidadCentimos %= 20;
		int monedas10Cent = (int)(cantidadCentimos / 10);
		cantidadCentimos %= 10;
		int monedas5Cent = (int)(cantidadCentimos / 5);
		cantidadCentimos %= 5;
		int monedas2Cent = (int)(cantidadCentimos / 2);
		cantidadCentimos %= 2;
		int monedas1Cent = cantidadCentimos;		
		
		System.out.printf("\n\nCantidad devuelta: %.2f", cantidadDevuelta);
		System.out.print((billetes500 != 0 ?  "\nBilletes de 500 : " + billetes500: ""));
		System.out.print((billetes200 != 0 ?  "\nBilletes de 200 : " + billetes200: ""));
		System.out.print((billetes100 != 0 ?  "\nBilletes de 100 : " + billetes100: ""));
		System.out.print((billetes50 != 0 ?  "\nBilletes de 50 : " + billetes50: ""));
		System.out.print((billetes20 != 0 ?  "\nBilletes de 20 : " + billetes20: ""));
		System.out.print((billetes10 != 0 ?  "\nBilletes de 10 : " + billetes10: ""));
		System.out.print((billetes5 != 0 ?  "\nBilletes de 5 : " + billetes5: ""));
		System.out.print((monedas2Euros != 0 ?  "\nMonedas de 2 Euros : " + monedas2Euros: ""));
		System.out.print((monedas1Euro != 0 ?  "\nMonedas de 1 Euro : " + monedas1Euro: ""));
		System.out.print((monedas50Cent != 0 ?  "\nMonedas de 50 céntimos : " + monedas50Cent: ""));
		System.out.print((monedas20Cent != 0 ?  "\nMonedas de 20 céntimos : " + monedas20Cent: ""));
		System.out.print((monedas10Cent != 0 ?  "\nMonedas de 10 céntimos : " + monedas10Cent: ""));
		System.out.print((monedas5Cent != 0 ?  "\nMonedas de 5 céntimos : " + monedas5Cent: ""));
		System.out.print((monedas2Cent != 0 ?  "\nMonedas de 2 céntimos : " + monedas2Cent: ""));
		System.out.print((monedas1Cent != 0 ?  "\nMonedas de 1 céntimo : " + monedas1Cent: ""));					
	}
	
	public static boolean esPar(int num) {
		return(num % 2 == 0);
	}
	
	public static boolean esPar(long num) {
		return(num % 2 == 0);
	}

	public static long[] getRandomArrayLong(int longArray, long min, long max) {
		long[] arrayNumeros = new long[longArray];

		for(int i=0; i<=arrayNumeros.length-1; i++) {

		}
		return(arrayNumeros);
	}
	
	
	
	/*public static int[] getRandomArray(int longArray, int min, int max) {
		int[] arrayNumeros = new int[longArray];
		for(int i=0; i<arrayNumeros.length-1; i++) {
			int num = (int)(Math.random() * (max - min + 1) + min);
			arrayNumeros[i] = num;	
		}
		return(arrayNumeros);
	}*/
		
}	

