package boletin3;

public class UtilidadesEj06 {
	
	public static int introduceInt(String cadena) throws Exception{
		int res;
		
		try {
			res = Integer.parseInt(cadena);
			
		} catch (NumberFormatException e){
			throw new Exception("El valor introducido no es de tipo entero.");	
		}
		return res;
	}
	
	public static float introduceFloat(String cadena) throws Exception{
		float res;
		
		try {
			res = Float.parseFloat(cadena);
			
		} catch (NumberFormatException e){
			throw new Exception("El valor introducido no es de tipo Float.");	
		}
		return res;
	}

}
