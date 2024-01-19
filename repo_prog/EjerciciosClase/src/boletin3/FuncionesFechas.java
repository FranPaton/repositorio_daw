package boletin3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuncionesFechas {
	
	public static Date obtenerFecha(String fechaStr, String formatoFechaStr) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat(formatoFechaStr);
        Date fechaDate;
        try {
            fechaDate = dateFormat.parse(fechaStr);
        } catch (ParseException e) {
        	String strException = "Error, la fecha no tiene el formato correcto: " + formatoFechaStr;
        	throw new Exception (strException);
        }
		return(fechaDate);
	}
	
	public static String formatearFecha(Date fechaDate, String formatoFechaStr) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat(formatoFechaStr);
	    return(dateFormat.format(fechaDate));
	}
	
	public static int calcularEdad(Date fechaDate) throws Exception{
        Calendar calFechaHoy = Calendar.getInstance();	
        Calendar calFechaNac = Calendar.getInstance();    
        
        calFechaNac.setTime(fechaDate);
        if (calFechaHoy.before(calFechaNac)){
        	throw new Exception("Error, la fecha de nacimiento debe ser menor que la fecha actual");
        }
        
        return(calFechaHoy.get(Calendar.YEAR) - calFechaNac.get(Calendar.YEAR));
    }

	
	
	// Devuelve si un año en objeto Date es bisiesto. Un año es bisiesto
	public static boolean esAnioBisiesto (String fechaStr) throws Exception{
		boolean esBisiesto = false;
		String formatoFecha = "dd/MM/yyyy";
		Date fechaDate = obtenerFecha(fechaStr, formatoFecha);
		Calendar calFecha = Calendar.getInstance();
		
		calFecha.setTime(fechaDate);
		int anio = calFecha.get(Calendar.YEAR);
		if (anio % 4 == 0 && anio % 100 != 0|| (anio % 400 == 0)) {
			esBisiesto = true;
		}
		return(esBisiesto);	
	}
	
	public static int obtenerMes (Date fechaDate) throws Exception {
	
		Calendar calFecha = Calendar.getInstance();
		calFecha.setTime(fechaDate);
		return(calFecha.get(Calendar.MONTH));
	}	
	
	public static Date sumarDias(String fechaStr, int numDias) throws Exception{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaAntigua = dateFormat.parse(fechaStr);
		Calendar cal = Calendar.getInstance();
		cal.setTime(fechaAntigua);
		cal.add(Calendar.DAY_OF_MONTH, numDias);
		return(cal.getTime());
	}
	
	public static Date restarDias(String fechaStr, int numDias) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = new Date();
		fecha = sdf.parse(fechaStr);
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.add(Calendar.DAY_OF_MONTH, -numDias);
		return(cal.getTime());
	}
		
	
}

