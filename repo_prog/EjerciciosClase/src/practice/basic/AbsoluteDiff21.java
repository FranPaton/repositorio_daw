package practice.basic;
import java.util.*;
/*
 
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

DIFERENCIA ABSOLUTA ENTRE N Y 21. SI N ES MAYOR QUE 21 DEVOLVER EL DOBLE DE LA DIFERENCIA ABSOLUTA
SI N ES <= 21
    2, 21 = 19
    -2, 21 = 23
    2, -21 = 23
    -2, -21 = 19

SI N ES > 21
    2, 21 = 19 * 2
    -2, 21 = 23 * 2
    2, -21 = 23 * 2
    -2, -21 = 19 * 2
 

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

 */
public class AbsoluteDiff21 {
    public static void main(String[] args) {

        int num = 0, res = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número entero, positivo o negativo: ");
        if (!entrada.hasNextInt()){
            System.out.println("Error. Introduce un número entero.");
        }
        else {
            num = entrada.nextInt();
            if (num <= 21) {
                res = 21 - num;
            } else {
                res = (num - 21) * 2;
            }
            
        }
        
        System.out.println("\nDiferencia absoluta de " + num + " y 21 = " + res);
        entrada.close();

    }
}
