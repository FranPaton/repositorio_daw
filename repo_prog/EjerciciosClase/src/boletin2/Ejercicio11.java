package boletin2;
import java.util.*;

/*
 Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.
 */

public class Ejercicio11 {

    public static void main(String[] args) {

        int num=0;
        String numString;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        numString = String.valueOf(num);
        if (numString.length() <= 5) {
              System.out.println("La primera cifra es " + numString.charAt(0));
        } else {
              System.out.println("Error. Introduce un número con cinco cifras como máximo");
        }
        
        entrada.close();
    }
}
