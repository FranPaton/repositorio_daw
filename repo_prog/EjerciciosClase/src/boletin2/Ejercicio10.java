package boletin2;
import java.util.*;

/*
 Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 */

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num;
        String numString;

        System.out.println("Introduce un número: ");
        num = entrada.nextInt();
        numString = String.valueOf(num);
        System.out.println("La última cifra es: "+ numString.charAt(numString.length()-1));           
      
       
        entrada.close();

    }
}
