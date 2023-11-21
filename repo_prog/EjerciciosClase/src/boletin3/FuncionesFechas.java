package boletin3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesFechas {

	public static boolean fechaCorrecta (String fechaNacStr) throws Exception{
		Date fechaHoy = new Date();
		SimpleDateFormat fechaFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaNacimiento = null;
		//Date hoy = new Date();
		try {
			fechaNacimiento = fechaFormat.parse(fechaNacStr);
		} catch (ParseException e) {
			throw new Exception("El formato no es el adecuado, por favor introduce una fecha correcta.");
		}
		System.out.println("Hola" + fechaNacimiento);
		return(true);
	}
}
