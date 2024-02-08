package unidad5.cuentabancaria;


public abstract class CuentaBancaria implements Imprimible {

	//atributos de la clase
	private Persona titular;
	private double saldo;
	private String iban;
	
	//constructores
	public CuentaBancaria (String nombre, String apellidos, String dni, double saldo, String iban) throws CuentaBancariaDatosIncorrectosException {
		this.titular = new Persona(nombre, apellidos, dni);
		this.saldo = saldo;
		this.iban = comprobarIban(iban);
	}
	
	private String comprobarIban(String iban) throws CuentaBancariaDatosIncorrectosException {
		//TODO: Validar IBAN
		boolean valido = true;
		String result = iban;
		if (!valido) {
			throw new CuentaBancariaDatosIncorrectosException("El iban es incorrecto");
		}
		return result;
	}

	@Override
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append("Cuenta Bancaria: " + this.iban);
		result.append("\nTitular: " + this.titular.devolverInfoString());
		result.append("\nSaldo: " + this.saldo + " €");
		// TODO Auto-generated method stub
		return result.toString();
	}

	/**
	 * @return the titular
	 */
	public Persona getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}
	
}
