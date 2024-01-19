package boletin3;

public class pruebas {

	public static void main(String[] args) {
		int num = 5;
		int digito = 0, numVolteado = 0;
		
		int aux = num;
		while(aux!=0) {
			digito = aux % 10;
			numVolteado = numVolteado * 10 + digito;
			aux/=10;
		}
		
		System.out.println(num);
		System.out.println(numVolteado);
		
		int numDelante = 12345;
		int longNum = 5;
		int posiciones = 2;
		int auxDelante = 0;
		auxDelante = (numDelante / (int)Math.pow(10,longNum-posiciones)) * (int)Math.pow(10,longNum-posiciones);
		System.out.println(" " + auxDelante);
		
		
		

	}

}
