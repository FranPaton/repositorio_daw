package boletin;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		double d = (double)Math.random() * 100;
		System.out.println("d: " + d);
		String resultado = (d >= 0 && d < 20) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 0 y 20, 20 no incluido");
		resultado = (d >= 20 && d <= 50) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 20 y 50, ambos incluidos");
		resultado = (d > 50 && d < 75) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 50 y 75, ninguno incluido");
		resultado = (d >= 75 && d <= 100) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 75 y 100, ambos incluidos");		
		
	}

}
