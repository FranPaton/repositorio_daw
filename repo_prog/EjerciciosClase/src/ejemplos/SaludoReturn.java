package ejemplos;

public class SaludoReturn {

	public static String saludo(String nombre) {
		return ("Hola, " + nombre);	
	}
	
	public static void main(String[] args) {
		
		System.out.println(saludo("Fran"));
		
	}

}
