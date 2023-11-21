package boletin3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 
 Crea una aplicación que nos pida por teclado que introduzcamos nuestra fecha
de cumpleaños y nos indique por pantalla cuantos meses, semanas y días nos
faltan para celebrar nuestro cumpleaños.
 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date hoy = new Date();
		Date cumple = new Date();
		boolean fechaCorrecta = false;
		String fechaCumpleaniosStr ="15/10";
		while (!fechaCorrecta) {
			System.out.print("Introduce tu fecha de cumpleaños con formato (dd/MM/yyyy): ");
			String fechaCumpleaniosStr_ = scan.nextLine();
			
			try {
				cumple = obtenerFechaProxCumpleanios(fechaCumpleaniosStr_);
				fechaCorrecta = true;
			} catch (Exception e) {
				System.out.print(e.getMessage());
				fechaCorrecta = false;
			}
		}
		scan.close();
		// Se calcula la diferencia entre el cumpleaños y hoy
		long diferencia = cumple.getTime() - hoy.getTime();
		long meses = diferencia/ (1000l * 60 * 60 * 24 * 30);
		long semanas = (diferencia - meses * (1000l * 60 * 60 * 24 * 30)) / (1000l * 60 * 60 * 24 * 7);
		long dias = (diferencia - meses * (1000l * 60 * 60 * 24 * 30) - semanas * (1000l * 60 * 60 * 24 * 7)) / (1000l * 60 * 60 * 24);

		System.out.printf("Faltan %d meses, %d semanas y %d días para tu cumpleaños", meses, semanas, dias);
	}

	/**
	 * Obtiene la fecha del próximo cumpleaños a partir de la fecha de nacimiento.
	 * @param fechaStr
	 * @return fechaProxCumpleanios
	 * @throws Exception
	 */
	public static Date obtenerFechaProxCumpleanios(String fechaStr) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaNacimiento = null;
		//Date hoy = new Date();
		try {
			fechaNacimiento = dateFormat.parse(fechaStr);
		} catch (ParseException e) {
			throw new Exception("El formato no es el adecuado, por favor introduce una fecha correcta.");
		}
		
		//TODO: Lo que hay que calcular es si según la fecha que es el cumpleaños es en el año actual o en el siguiente.
		// para ello habrá que comparar los meses y modificar el año de la fecha de nacimiento
		
		//System.out.println(fechaProxCumpleanios.get);
		//TODO: Podrían hacerse cálculos como en casos anteriores con los milisegundos de las fechas, pero en este caso se 
		// realizarán estos cálculos usando la clase Calendar. Ver documentación --> https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
		
		// Un objeto calendar se inicializaliza de la siguiente manera
		
		Calendar calHoy = Calendar.getInstance();
		Calendar calFechaNacimiento = Calendar.getInstance();
		Calendar calCumple = Calendar.getInstance();
		calCumple = calFechaNacimiento;
		calFechaNacimiento.setTime(fechaNacimiento);
		int diaNacimiento =  calFechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int diaHoy = calHoy.get(Calendar.DAY_OF_MONTH);
		int mesNacimiento = calFechaNacimiento.get(Calendar.MONTH);
		int mesHoy = calHoy.get(Calendar.MONTH);
		
		if (mesHoy < mesNacimiento || ((mesHoy == mesNacimiento) && (diaNacimiento < diaHoy))){
			calCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR));
		} else {
			calCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR) + 1);
		}
		System.out.println("Mes fecha nacimiento: " + calFechaNacimiento.get(Calendar.MONTH));
		System.out.println("Mes hoy: " + calHoy.get(Calendar.MONTH));
		System.out.println("Dia fecha nacimiento: " + calFechaNacimiento.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia hoy: " + calHoy.get(Calendar.DAY_OF_MONTH));
		System.out.println("Año hoy: " + calHoy.get(Calendar.YEAR));
		System.out.println("Año proximo cumpleaños: " + calCumple.get(Calendar.YEAR));
		// Para obtener el año de una fecha se opera así
		
		// TODO: TERMINAR EL EJERCICIO
		return (calCumple.getTime());
	}

}
