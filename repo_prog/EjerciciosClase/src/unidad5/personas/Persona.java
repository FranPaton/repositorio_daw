package unidad5.personas;

public class Persona {
	private static final char SEXO_HOMBRE = 'H';
	private static final char SEXO_MUJER= 'M';
	private static final char SEXO_NOID = 'N';
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private int peso;
	private double altura;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = SEXO_NOID;
		this.peso = 0;
		this.altura = 0d;
	}
	
	Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
	}

	Persona(String nombre, int edad, String dni, char sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	private char comprobarSexo(char sexo) {
		char res;
		if(sexo == 'H' || sexo == 'M') {
			res = sexo;
		} else {
			res = 'N';
		}
		return(res);
	}
	
	public boolean esMayorDeEdad (int edad) {
		return(edad >= 18);
	}
	
	public String generaDNI () {
		int num, numDNI;
		String dniSinLetra = "";
		String dniCompleto = "";
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";      
		char letra;

		for(int i=0; i<=7;i++) {
			num = (int)(Math.random() * 10);
			dniSinLetra += "" + num;
		}
		numDNI = Integer.valueOf(dniSinLetra);
		letra = letrasDNI.charAt(numDNI % 23);
		dniCompleto = dniSinLetra + letra;
		return(dniCompleto);
	}
	
	public int calcularIMC(int peso, double altura) {
		return 0;
		
	}
	
	
	

}
