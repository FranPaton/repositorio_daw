package boletin3;

public class Ejercicio9 {

	public static void main(String[] args) {
		String fechaNac = "15/10/1";
		try {
			FuncionesFechas.fechaCorrecta(fechaNac);
			System.out.printf("%s es correcta", fechaNac);
			
		} catch (Exception e) {
			System.out.println("\n\n" + e.getMessage());
		}

	}

}
