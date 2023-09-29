package boletin;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		double d = Math.random() * 100;
		System.out.println("d: " + Math.round(d));
		String msg;
		
		/*String resultado = (d >= 0 && d < 20) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 0 y 20, 20 no incluido");
		resultado = (d >= 20 && d <= 50) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 20 y 50, ambos incluidos");
		resultado = (d > 50 && d < 75) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 50 y 75, ninguno incluido");
		resultado = (d >= 75 && d <= 100) ? "SI" : "NO";
		System.out.println("d " + resultado + " está entre 75 y 100, ambos incluidos");*/		
		
		/*
		 * System.out.println(d >= 0 && d < 20 ? "d está entre 0 y 20, 20 no incluido" :
		 * d >= 20 && d <= 50 ? "d está entre 20 y 50, ambos incluidos" : d > 50 && d <
		 * 75 ? "d está entre 50 y 75, ninguno incluido" :
		 * "d está entre 75 y 100, ambos incluidos" );
		 */
		
		msg = (d >= 0 && d < 20 ?   "d está entre 0 y 20, 20 no incluido" : 
			   d >= 20 && d <= 50 ? "d está entre 20 y 50, ambos incluidos" :
			   d > 50 && d < 75 ?   "d está entre 50 y 75, ninguno incluido" :
				   				    "d está entre 75 y 100, ambos incluidos"
			);
		
		System.out.println(msg);
				
		msg = ((d >= 0 && d <= 25) || (d >= 75 && d <= 100) ? "d está entre 0 y 25 o entre 75 y 100" :
															  "d no está entre 0 y 25 o entre 75 y 100");
		System.out.println(msg);

		
	}

}
