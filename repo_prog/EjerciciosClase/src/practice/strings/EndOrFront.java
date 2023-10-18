package practice.strings;
/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

*/

public class EndOrFront {

	public static void main(String[] args) {
		String str = "Hello";
		String msgReturn ="";
		boolean front = false;
		
		if (str.length() > 2) {
			if (front) {
				msgReturn = str.substring(0,1);
			} else {
				msgReturn = str.substring(str.length() - 1);
			}
		} else {
			if (front) {
				msgReturn = str.substring(0,1);
			}
		}		
		
		System.out.println(msgReturn);

	}

}
