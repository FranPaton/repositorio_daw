package unidad5.cuentabancaria;

public class CuentaCorrientePersonal extends CuentaCorriente {
	


	//Atributos 
	private double comisionMantenimiento;
	
	//Constructores
	
	public CuentaCorrientePersonal(String nombre, String apellidos, String dni, double saldo, String iban,
	        String[] entidades, double comisionMantenimiento) throws CuentaBancariaDatosIncorrectosException {
		super(nombre, apellidos, dni, saldo, iban, entidades);
		this.comisionMantenimiento  = comisionMantenimiento;
		
	}
	//Getters and Setters

	/**
	 * @return the comisionMantenimiento
	 */
	public double getComisionMantenimiento() {
		return comisionMantenimiento;
	}

	/**
	 * @param comisionMantenimiento the comisionMantenimiento to set
	 */
	public void setComisionMantenimiento(double comisionMantenimiento) {
		this.comisionMantenimiento = comisionMantenimiento;
	}

	@Override
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append(super.devolverInfoString());
		result.append("\nComisión de mantenimiento: ").append(comisionMantenimiento);
		return result.toString();
	}
	
	
	
}
