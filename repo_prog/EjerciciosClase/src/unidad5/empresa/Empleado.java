package unidad5.empresa;

import unidad5.cuentabancaria.Persona;

public class Empleado extends Persona{
	
	private double sueldoBruto;
	private int edad;
	private String telefono;
	private String direccion;
		
	public Empleado(String nombre, String apellidos, String dni, double sueldoBruto, int edad, String telefono, String direccion) {
		super(nombre, apellidos, dni);
		this.sueldoBruto = sueldoBruto;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;	
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double calcularSueldoNeto (double sueldoBruto) {
		double res = 0d;
		if(sueldoBruto < 12000 ) {
			res = sueldoBruto * 0.8;
		} else if (sueldoBruto < 25000) {
			res = sueldoBruto * 0.7;
		} else {
			res = sueldoBruto * 0.6;
		}
		return res;
	}

	@Override
	public String devolverInfoString() {
		// TODO Auto-generated method stub
		String res = super.devolverInfoString();
		res += "\nSueldo neto: " + this.calcularSueldoNeto(sueldoBruto);
		return res;
	}
}
