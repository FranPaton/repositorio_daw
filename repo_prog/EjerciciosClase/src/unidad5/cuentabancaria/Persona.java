package unidad5.cuentabancaria;

public class Persona implements Imprimible{
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String devolverInfoString() {
		String infoString = "Nombre: " + this.nombre
							+ "\nApellidos: " + this.apellidos
							+ "\nDNI: " + this.dni;
		return(infoString);
	}

}
