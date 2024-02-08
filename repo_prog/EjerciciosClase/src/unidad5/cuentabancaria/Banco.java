package ejerciciosClase.unidad5.cuentabancaria;

public class Banco {
	private CuentaBancaria[] cuentas;

	// Constructores
	public Banco() {
		this.cuentas = new CuentaBancaria[100];
	}

	// getter de cuenta
	/**
	 * @return the cuentas
	 */
	public CuentaBancaria[] listadoCuentas() {
		return cuentas;
	}

	// Métodos de la clase
	/**
	 * abrirCuenta: recibe por parámetro un objeto CuentaBancaria y lo almacena en
	 * la estructura. Devuelve true o false indicando si la operación se realizó con
	 * éxito.
	 */
	public boolean abrirCuenta(CuentaBancaria cuenta) {
		for (int i = 0; i < this.cuentas.length; i++) {
			if (this.cuentas[i] == null) {
				this.cuentas[i] = cuenta;
				return true;
			}
		}
		System.out.println("No se permiten más cuentas bancarias en este banco");
		return false;

	}
}
