package strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string, find the first non repeated character
 * 
 * Assumption:
 * -> String consists of only English characters
 * -> String length can be upto 100000
 *  
 * 
 */


/*
 * Algorithm
 * 
 * Step 1 - Store each character of the string in a map, with key as character itself
 * and value as the count 
 * 
 * Step 2 - We iterate over the map checking for the first key with value 1 and return the key
 *  
 * 
 */

/* 
 * Complexity - Time Complexity - O(n)
 * 
 */

public class FirstNonRepeatedCharacter {
	
	public static Character firstNonRepeatedCharacter(String input) {
		
		if ( input.isEmpty()) {
			throw new NullPointerException("Empty String as Input");
		}
		
		Map<Character,Integer> characterCount = new HashMap<>();
		
		for ( int i=0; i < input.length(); ++i ) {
			
			Character currentChar = input.charAt(i);
			
			if ( null != characterCount.get(input.charAt(i)) ) {
				characterCount.put(currentChar, characterCount.get(currentChar) + 1);
			} else {
				characterCount.put(currentChar, 1);
			}
			
		}
		
		for ( int i=0; i < input.length(); ++i ) {
			
			Character currentChar = input.charAt(i);
			
			int count = characterCount.get(currentChar);
			
			if ( count == 1 ) {
				return currentChar;
			}
			
		}
		return null;

		
	}

}
