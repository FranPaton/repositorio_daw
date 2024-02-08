package unidad5.cuentabancaria;

import org.apache.commons.lang3.StringUtils;

public abstract class CuentaCorriente extends CuentaBancaria{
	//Atributos
	private String[] entidades;
		
	//Constructores
	
	public CuentaCorriente(String nombre, String apellidos, String dni, double saldo, String iban, String[] entidades) throws CuentaBancariaDatosIncorrectosException {
		super(nombre, apellidos, dni, saldo, iban);
		this.entidades = entidades;
	}
	//Getters y setters
	/**
	 * @return the entidades
	 */
	public String[] getEntidades() {
		return entidades;
	}
	/**
	 * @param entidades the entidades to set
	 */
	public void setEntidades(String[] entidades) {
		this.entidades = entidades;
	}
	@Override
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append(super.devolverInfoString());
		result.append("\nEntidades autorizadas:");
		for (String entidad : entidades) {
			if(null != entidad && StringUtils.isNotEmpty(entidad)) {
				result.append("\n\t-\t");	
				result.append(entidad);	
			}
			
		}
		
		return result.toString();
	}
	
		
	
}
