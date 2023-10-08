package boletin2;

import java.util.Scanner;

public class Ejercicio14_ {
    public static void main(String[] args) {

        final double PRECIO_BASE = 0.01; 
        final double PRECIO_AUM = 0.012;
        final double PRECIO_ESCUDO = 2.5;
        final double GASTOS_ENVIO = 3.25;

        double precioMetro = 0;
        double anchoBandera = 0, altoBandera = 0, precioBandera = 0; //
        String escudoBordadoOpcion;
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Introduzca la altura de la bandera en cm: ");
        anchoBandera = entrada.nextDouble();
        System.out.println("\nIntroduzca la anchura de la bandera en cm: ");
        altoBandera = entrada.nextDouble();
        System.out.println("\n¿Quiere escudo? (s/n): ");
        escudoBordadoOpcion = entrada.next();

        if(anchoBandera * altoBandera < 60000){
            precioMetro = PRECIO_BASE; 
        }
        else {
            precioMetro = PRECIO_AUM;
        }
        precioBandera += anchoBandera * altoBandera * precioMetro;
        if (escudoBordadoOpcion.equalsIgnoreCase("s")) {
            precioBandera += PRECIO_ESCUDO;
        }
        precioBandera += GASTOS_ENVIO; // Por último añadimos los gastos de envío como constante, que siempre se añaden. 
        
        System.out.println("\nGracias. Aquí tiene el desglose de su compra."
                        +"\nBandera de " + (anchoBandera * altoBandera) + "cm2 (" + (anchoBandera * altoBandera)/10000 + "m2): " + anchoBandera * altoBandera * precioMetro + '\u20ac' //                  
                        +" \n" + ((escudoBordadoOpcion == "n") ? "Sin escudo." : "Con escudo: 2,50 " + '\u20ac')  //
                        +"\nGastos de envío: 3,25 " + '\u20ac'//
                        +"\n" + "Total: Precio/m2 = " + precioMetro + "m2 ==> " +  + precioBandera + '\u20ac' );    

        entrada.close();

    }
}
