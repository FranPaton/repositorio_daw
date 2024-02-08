package unidad5.cuentabancaria;

public class CuentaAhorro extends CuentaBancaria {

	//Atributos
	private double tipoInteresAnual;
	
	//Constructor
	public CuentaAhorro(String nombre, String apellidos, String dni, double saldo, String iban, double tipoInteresAnual) throws CuentaBancariaDatosIncorrectosException {
		super(nombre, apellidos, dni, saldo, iban);
		this.tipoInteresAnual = tipoInteresAnual;
	}
	
	//Getters y Setters
	/**
	 * @return the tipoInteresAnual
	 */
	public double getTipoInteresAnual() {
		return tipoInteresAnual;
	}

	/**
	 * @param tipoInteresAnual the tipoInteresAnual to set
	 */
	public void setTipoInteresAnual(double tipoInteresAnual) {
		this.tipoInteresAnual = tipoInteresAnual;
	}
	
	@Override
	public String devolverInfoString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.devolverInfoString());
		sb.append("\nTipo de interes anual: " + tipoInteresAnual + "%");
		return sb.toString();
	}
	
	

	
	
}
