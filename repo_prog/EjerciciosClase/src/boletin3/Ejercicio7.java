package boletin3;

import org.apache.commons.lang3.StringUtils;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// COMPROBAR SI UN NUMERO ES CAPICUA
		
		int numCapicua = 1232321;
		if(	FuncionesMatematicas.esCapicua(numCapicua)) {
			System.out.printf("%d es capicua", numCapicua);
		} else {
			System.out.printf("%d no es capicua", numCapicua);
		}
		
		// COMPROBAR SI UN NUMERO ES PRIMO
		
		int numPrimo = 123;
		if (FuncionesMatematicas.esPrimo(numPrimo)) {
			System.out.printf("\n\n%d es primo", numPrimo);
		} else {
			System.out.printf("\n\n%d no es primo", numPrimo);
		}
		
		// MOSTRAR EL SIGUIENTE PRIMO DE UN NUMERO
		
		System.out.printf("\n\nEl primo siguiente de %d es %d", numPrimo, FuncionesMatematicas.siguientePrimo(numPrimo));
		
		// ELEVAR UN NUMERO A UNA POTENCIA
		
		int numPotencia = 2, potencia = 5;
		System.out.printf("\n\n%d elevado a %d = %d", numPotencia, potencia, FuncionesMatematicas.potencia(numPotencia, potencia));
		
		// MOSTRAR EL NUMERO DE DIGITOS
		
		int contDigitos = -12345678;
		System.out.printf("\n\n%d tiene %d digitos", contDigitos, FuncionesMatematicas.numeroDigitos(contDigitos));
		
		// MOSTRAR EL DIGITO DE UNA POSICION DENTRO DE UN NUMERO
		try {
			int numDigito = 12345, posicionDigito = 0;
			System.out.printf("\n\nEn el número %d, en la posicion %d, está el numero %d", numDigito, posicionDigito, FuncionesMatematicas.nDigito(numDigito, posicionDigito));
		} catch (Exception e){
			System.out.println("\n\n" + e.getMessage());
		}
		
		//  MOSTRAR LA POSICION DE UN DIGITO DENTRO DE UN NUMERO, -1 SI NO LA ENCUENTRA
		int numDigito = 1234543;
		int digito = 9;
		if (FuncionesMatematicas.posicionDigito(numDigito, digito) != -1) {
			System.out.printf("\n\nEl digito %d en el número %d está en la posicion %d", digito, numDigito, FuncionesMatematicas.posicionDigito(numDigito, digito));
		} else {
			System.out.printf("\n\nNo se encuentra el dígito %d en el número %d", digito, numDigito);
		}
		
		// QUITA LOS n ULTIMOS DIGITOS DE UN NUMERO
		try {
			int numQuita = 12345;
			int digitosQuitar = 3;
			System.out.printf("\n\n%d quitando %d números por detrás = %d", numQuita, digitosQuitar, FuncionesMatematicas.quitaPorDetras(numQuita, digitosQuitar));
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
		
		//QUITA LOS n PRIMEROS DIGITOS DE UN NUMERO
		try {
			int numQuitar = 102133450;
			int digitosQuitar =4;
			//ncionesMatematicas.quitaPorDelante(numQuitar, digitosQuitar);
			System.out.printf("\n\n%d quitando %d números por delante = %d", numQuitar, digitosQuitar, FuncionesMatematicas.quitaPorDelante(numQuitar, digitosQuitar));
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
		
		// DADO UN NUMERO n Y DOS POSICIONES INICIAL Y FINAL, DEVUELVE LOS DIGITOS ENTRE ESTAS DOS POSICIONES
		try {
			int numQuitar = 123456789;
			int inicio = 4, fin = 6;		
			System.out.printf("\n\n%d de la posición %d a la posición %d = %d", numQuitar, inicio, fin,FuncionesMatematicas.trozoDeNumero(numQuitar, inicio, fin));	
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
		
		
		//CONCATENAR DOS NUMEROS ENTEROS
		int numJuntar1 = 123, numJuntar2 = 4567;
		System.out.printf("\n\n%d + %d = %d", numJuntar1, numJuntar2, FuncionesMatematicas.juntaNumeros(numJuntar1, numJuntar2));
		
		//CALCULAR LA LETRA DE UN NIF
		try {
			int numNif = 12345678;
			System.out.printf("\n\n%d Letra = %c", numNif, FuncionesMatematicas.letraNif(numNif));
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
		
		//COMPROBAR SI UN NIF ES CORRECTO
		try {
			String nifStr = "75764133K";
			if( FuncionesMatematicas.nifCorrecto(nifStr)) {
				System.out.printf("\n\nNIF: %s es correcto", nifStr); 
			} else {
				System.out.printf("\n\nNIF: %s no es correcto", nifStr);
			}	
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
		
		//CALCULAR EL AREA DE UN CIRCULO
		
		try {
			double radio = 12d;
			System.out.printf("\n\nEl área de un círculo con radio %.2f = %.2f", radio, FuncionesMatematicas.areaCirculo(radio));	
		} catch (Exception e){
			System.out.println("\n\n" + e.getMessage());
		}
		
		//CALCULAR EL AREA DE UN RECTANGULO
		try {
			double base = 2, altura = 4;
			System.out.printf("\n\nEl área de un rectángulo con base %.2f y altura %.2f = %.2f", base, altura, FuncionesMatematicas.areaRectangulo(base,altura));	
		} catch (Exception e){
			System.out.println("\n\n" + e.getMessage());
		}
		
		//CALCULAR EL MINIMO DE BILLETES Y MONEDAS NECESARIO PARA UNA CANTIDAD DE EUROS
		try {
			double cantidadDevuelta = 27.23;
			FuncionesMatematicas.cambioExacto(cantidadDevuelta);
		} catch (Exception e) {
			
		}
		
		System.out.println("\n\n");
		int numRandom;
		for (int i = 0; i <= 50 ; i++) {
			numRandom = (int)(Math.random() * (101)) -50;
			System.out.print(numRandom + " ");	
		}
		
	}

}
