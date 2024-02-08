package unidad5.empresa;

public class Empresa {
	private String nombre;
	private String cif;
	private String direccion;
	private String telefono;
	private Empleado[] empleados;
	private static int contEmpleados = 0;
	private static final int MAX_EMPLEADOS = 10;
	
	public Empresa(String nombre, String cif, String direccion, String telefono) {
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
		this.telefono = telefono;
		this.empleados = new Empleado[MAX_EMPLEADOS];
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	public void nuevoEmpleado (Empleado emp) {
		if (contEmpleados <= MAX_EMPLEADOS) {
			empleados[contEmpleados++] = emp;
			
		} else {
			System.out.printf("\nNo se admiten más empleados. (MAX: %d)", MAX_EMPLEADOS);
		}
	}
	
	public void borrarEmpleado (Empleado emp) {
		emp.getDni();
	}
	
	 
}
