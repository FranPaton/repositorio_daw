package practicestrings;
/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/

public class StringContatWithoutFirst {

	public static void main(String[] args) {
		
		String s1 = "shotl";
		String s2 = "java";

		System.out.println(s1.substring(1 , s1.length()) + s2.substring(1, s2.length()));
	}

}
