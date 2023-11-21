package com.franpaton.tarea3;

public class UtilidadesMatematicas {
	
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
	
	//El método numeroDigitos es un método de apoyo que devuelve la cantidad de dígitos de un número
	private static int numeroDigitos (long num) {
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
			throw new Exception ("Error, la posición está fuera de la longitud del número");
		}	
		while (i >= posicion) {
				digito = aux % 10;
				aux /= 10;
				i--;
		}		
		return(digito);		
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
}
