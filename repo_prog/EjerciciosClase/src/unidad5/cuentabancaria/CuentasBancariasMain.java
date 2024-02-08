package unidad5.cuentabancaria;

public class CuentasBancariasMain {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		try {
			String [] entidades = new String[5];
			entidades[0] = "netflix";
			entidades[2] = "endesa";
			entidades[3] = "movistar";
			CuentaCorrientePersonal cuentaCorrPersonal1 = new CuentaCorrientePersonal("Ana", "Sáinz Núñez", "44052327J", 1000d, "ES0000000000000000000000", entidades, 0.0);
			
			CuentaAhorro cuentaAhorro1 = new CuentaAhorro("Ana", "Sáinz Núñez", "44052327J", 1000d, "ES0000000000000000000000", 3.6);
			banco.abrirCuenta(cuentaAhorro1);
			banco.abrirCuenta(cuentaCorrPersonal1);
			int contador = 0;
			for (CuentaBancaria cuenta : banco.listadoCuentas()) {
				if (null != cuenta) {
					System.out.println("--------- " + ++contador + " --------------");
					System.out.println(cuenta.devolverInfoString());
				}
			}
		} catch (CuentaBancariaDatosIncorrectosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		do {
			
			System.out.println("\nIntroduce una opción: \n"
					+ "1. Abrir una nueva cuenta.\n"
			        + "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual).\n"
			        + "3. Obtener los datos de una cuenta concreta.\n" + "4. Realizar un ingreso en una cuenta.\n"
			        + "5. Retirar efectivo de una cuenta.\n" + "6. Consultar el saldo actual de una cuenta.\n"
			        + "7. Salir de la aplicación.\n");
			
			opcion = scan.nextInt();
			

			switch (opcion) {
			case 1:
				//CuentaBancaria cb = new CuentaBancaria("gsdgsd ","asfdasf","1928471284");
				break;

			case 2:

				break;

			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				System.out.println("Hasta luego.");
				break;

			default:

			}
		} while (opcion != 7);
		*/
	}

}
