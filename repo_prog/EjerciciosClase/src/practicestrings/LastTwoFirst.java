package practicestrings;

/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
*/

public class LastTwoFirst {

	public static void main(String[] args) {
		String str = "cat";
		String msgReturn;
		
		if (str.length() == 2) {
			msgReturn = str;
		} else if (str.length() == 3) {
			msgReturn = str.substring(1);
		}

		else if(str.length() % 2 != 0) {
			msgReturn = str.substring(str.length() - 2) + str.substring(0,3);
		} else {
			msgReturn = str.substring(str.length() - 2) + str.substring(0,2);
		}
				
		System.out.println(msgReturn);

	}

}
