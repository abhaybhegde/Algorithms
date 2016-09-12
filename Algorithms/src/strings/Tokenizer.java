/**
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line
 */

package strings;



public class Tokenizer {
	
	public static void tokenizer(String inputString) {
		
		String input =  inputString.trim();

		if (input.length() >0 && input.length() <=400000) {
			if (input.matches("[A-Za-z !,?._'@]+")) {
				String[] tokenArray = input.split("[\\s+!,?._'@]+");
				int tokenCount = tokenArray.length;
				System.out.println(tokenCount);

				for (int i = 0; i < tokenArray.length; ++i) {
					System.out.println(tokenArray[i]);
				}
			} 
		} else {
			System.out.println("Input Constraint violation");
		}
		
	}

}
