package boletin3;

/*
  
a) esCapicua: Devuelve verdadero si el número que se pasa como parámetro
es capicúa y falso en caso contrario.
b) esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
primo y falso en caso contrario.
c) siguientePrimo: Devuelve el menor primo que es mayor al número que se
pasa como parámetro.
d) potencia: Dada una base y un exponente devuelve la potencia.
e) digitos: Cuenta el número de dígitos de un número entero.
f) voltea: Le da la vuelta a un número.
g) digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha.
h) posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.
i) quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
j) quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda).
k) pegaPorDetras: Añade un dígito a un número por detrás.
l) pegaPorDelante: Añade un dígito a un número por delante.
m) trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
de un número y devuelve el trozo correspondiente.
n) juntaNumeros: Pega dos números para formar uno.

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
		/*String numStr = String.valueOf(num);
		String numReverse="";
		boolean capicua= false;
		
		//return(true);
		for(int i=numStr.length()-1; i>=0 ; i--) {
			numReverse += "" + numStr.charAt(i);
			
		}
		if(numStr.equals(numReverse)) {
			capicua=true;
		}	
		return(capicua);*/
		
		// CON ENTEROS
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
	
	public static long potencia(long base, long exponente) {
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
		int i = longNumero - 1;;
		
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
		int aux = num;
		int longNum = numeroDigitos(num);
		
		if(digitos > longNum - 1) {
			throw new Exception ("Error, se intentan quitar más digitos que la longitud del número");
		}
		for(int i=0; i<digitos; i++) {
			aux/=10;
		}
		return(aux);				
	}
		
	
}
