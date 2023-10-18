package practice.strings;
/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 
*/

public class NoFirstNoLast {

	public static void main(String[] args) {
		
		String str = "abc";
		String msgReturn = "";
		if (str.length() < 2) {
			msgReturn = "";
		}
		else {
			msgReturn = str.substring(1, str.length()-1);		
		}
		System.out.println(msgReturn);
		

	}

}

