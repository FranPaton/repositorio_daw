package unidad5.modelodatos;

import java.time.LocalDate;

public class Equipo {
	private String nombreEquipo;
	private String cifEequipo;
	private String direccionEquipo;
	private String telefono;
	private String nombrePresidente;
	private String observaciones;
	private LocalDate fechaFundacion;
	private boolean masCienAbonados;
	private char categoria;
	public static int numeroEquipos = 0;
	
	public Equipo() {
		this.nombreEquipo = "";
		this.cifEequipo = "";
		this.direccionEquipo = "";
		this.telefono = "";
		this.nombrePresidente = "";
		this.observaciones = "";
		this.fechaFundacion = LocalDate.now();
		this.masCienAbonados = false;
		this.categoria = 'A';
		numeroEquipos++;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getCifEequipo() {
		return cifEequipo;
	}

	public void setCifEequipo(String cifEequipo) {
		this.cifEequipo = cifEequipo;
	}

	public String getDireccionEquipo() {
		return direccionEquipo;
	}

	public void setDireccionEquipo(String direccionEquipo) {
		this.direccionEquipo = direccionEquipo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombrePresidente() {
		return nombrePresidente;
	}

	public void setNombrePresidente(String nombrePresidente) {
		this.nombrePresidente = nombrePresidente;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public boolean isMasCienAbonados() {
		return masCienAbonados;
	}

	public void setMasCienAbonados(boolean masCienAbonados) {
		this.masCienAbonados = masCienAbonados;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) throws Exception {
		if(categoria == 'A' || categoria == 'J' || categoria == 'I') {
			this.categoria = categoria;
		} else {
			throw new Exception("Error, la categoría solo puede ser 'A', 'I', o 'J'");
		}				
	}

}
