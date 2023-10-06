package practicestrings;
import java.util.*;

/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
*/

public class FirstTwoLast {

	public static void main(String[] args) {
		
		String str = "hi";
		String msgReturn;
		
		msgReturn = str.substring(2, str.length()) + str.substring(0, 2);
		
		System.out.println(msgReturn);
		
		

	}

}
