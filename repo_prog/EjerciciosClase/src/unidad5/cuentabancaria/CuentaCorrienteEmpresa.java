package ejerciciosClase.unidad5.cuentabancaria;

public class CuentaCorrienteEmpresa extends CuentaCorriente{
	
	
	//ATRIBUTOS
	private double tipoInteresDescubierto;
	private double maxDescubierto;
	private double comisionFija;
	//CONSTRUCTORES
	public CuentaCorrienteEmpresa(String nombre, String apellidos, String dni, double saldo, String iban,
	        String[] entidades, double tipoInteresDescubierto, double maxDescubierto, double comisionFija) throws CuentaBancariaDatosIncorrectosException {
		super(nombre, apellidos, dni, saldo, iban, entidades);
		this.tipoInteresDescubierto = tipoInteresDescubierto;
		this.maxDescubierto = maxDescubierto;
		this.comisionFija = comisionFija;
	}
	//GETTER & SETTER
	/**
	 * @return the tipoInteresDescubierto
	 */
	public double getTipoInteresDescubierto() {
		return tipoInteresDescubierto;
	}
	/**
	 * @param tipoInteresDescubierto the tipoInteresDescubierto to set
	 */
	public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
		this.tipoInteresDescubierto = tipoInteresDescubierto;
	}
	/**
	 * @return the maxDescubierto
	 */
	public double getMaxDescubierto() {
		return maxDescubierto;
	}
	/**
	 * @param maxDescubierto the maxDescubierto to set
	 */
	public void setMaxDescubierto(double maxDescubierto) {
		this.maxDescubierto = maxDescubierto;
	}
	/**
	 * @return the comisionFija
	 */
	public double getComisionFija() {
		return comisionFija;
	}
	/**
	 * @param comisionFija the comisionFija to set
	 */
	public void setComisionFija(double comisionFija) {
		this.comisionFija = comisionFija;
	}
	@Override
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append(super.devolverInfoString());
		result.append("\ntipo interés descubierto: ").append(tipoInteresDescubierto);
		result.append("\nmáximo descubierto: ").append(maxDescubierto);
		result.append("\ncomisión fija: ").append(comisionFija);
		
		return result.toString();
	}
	
	
	
}
