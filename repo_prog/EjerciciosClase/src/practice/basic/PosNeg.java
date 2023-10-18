package practice.basic;

/*

 Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
posNeg(1, 1, true) -> false

 
 */

public class PosNeg {
    public static void main(String[] args) {
        int a =1;
        int b =1;
        boolean negative = true;

        if (negative) {
            System.out.println(a < 0 && b < 0);
        }
        else {
            System.out.println(a * b < 0);
        }
       
    }
    
}
