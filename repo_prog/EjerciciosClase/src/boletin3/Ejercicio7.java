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
		
		long numPotencia = 2, potencia = 5;
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
		int digito = 4;
		System.out.printf("\n\nEl digito %d en el número %d está en la posicion %d", digito, numDigito, FuncionesMatematicas.posicionDigito(numDigito, digito));
		
		// QUITA LOS DOS ULTIMOS DIGITOS DE UN NUMERO
		try {
			int numQuita = 12345;
			int digitosQuitar = 4;
			System.out.println("\n\n" + FuncionesMatematicas.quitaPorDetras(numQuita, digitosQuitar));
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}
	}

}
