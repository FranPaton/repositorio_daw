package practice.basic;

/*
 
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"


 */

public class NotString {
    
    public static void main(String[] args) {
        
        String str = "not candy";

        if (str.length()> 3 && str.substring(0, 3).equals("not")) {
            System.out.println(str);
        } else {
            System.out.println("not " + str);
        }

    }
    
}
