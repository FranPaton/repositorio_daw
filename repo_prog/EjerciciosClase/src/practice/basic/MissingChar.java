package practice.basic;

/*
  
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"  substr(0,0) + substr(2, lenght()-1)
missingChar("kitten", 0) → "itten"  substr(1, length(-1))
missingChar("kitten", 4) → "kittn"

public String missingChar(String str, int n) {
  
}
  
 */

public class MissingChar {
    public static void main(String[] args) {

    int n = 4;
    String str = "kitten";
    String strFront, strBack;

    strFront = str.substring(0, n);
    strBack = str.substring(n + 1, str.length());

    System.out.println(strFront + strBack);


       

       
        
    }

    
}
