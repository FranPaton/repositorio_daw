package boletin2;
import java.util.*;

/*
 Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        int num;
        String numString;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número entero con cinco cifras como máximo: ");
        num = entrada.nextInt();
        if (num < 0) {
            num *= -1;
        }
        numString = String.valueOf(num);
        if(numString.length()<=5) {
            System.out.println("El número " + num + " tiene " + numString.length() + " cifras");
        } else {
            System.out.println("Error. Sólo se permiten números de cinco cifras como máximo.");
        }
        
        entrada.close();
    }
}
