package Ejemplos;

public class EjemploStrings {

	public static void main(String[] args) {
			
		String s1 = "Me gusta programar";
		String s2 = "Nuestro código compila perfectamente";
		
		//Concatenar las dos cadenas
		
		System.out.println(s1 + ". " + s2);
		System.out.println(s1.concat(". " + s2));
		
		//Comparar si las cadenas son iguales
		
		System.out.println( s1.equalsIgnoreCase(s2) ? "Las cadenas s1 y s2 son iguales" : 
													  "Las cadenas s1 y s2 no son iguales"
				);
		
		//Devolver el carácter de una posición concreta del String
		
		System.out.println("Primer carácter de la cadena s1: " + s1.charAt(0));
		System.out.println("Último carácter de la cadena s2: " + s2.charAt(s2.length() - 1));
		
		//Mostrar las frases en MAYÚSCULAS y minúsculas 
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//Reemplazar caracteres de una cadena
		
		System.out.println(s1.replace('a', 'A'));
		
		//Quitar espacios al principio y final de una cedena
		
		String cadena = "    Ésta es una cadena con espacios al inicio y al final        ";		
		System.out.println(cadena);
		System.out.println(cadena.trim());
		
		//Concatenar s1 y s2 separadas por un punto.
		//Sustituir las s por $ y las e por €.
		//Devolver el contenido en la variable b
		
		 String b = s1 + ". " + s2;
		 
		b = b.replace('e', '€');
		b = b.replace('E', '€');
		b = b.replace('s', '$');
		b = b.replace('S', '$');
		
		
	}

}
