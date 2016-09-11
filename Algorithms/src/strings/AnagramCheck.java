/**
 * Given two strings, check if they are Anagrams of each other. 
 * The strings may consist at most 50 English characters; 
 * The comparison should NOT be case sensitive. 
 */


package strings;

public class AnagramCheck {

	public static boolean isAnagram(String stringOne, String stringTwo) {

		String inputStrOne =stringOne.replaceAll(" ", "").toLowerCase();
		String inputStrTwo =stringTwo.replaceAll(" ", "").toLowerCase();

		// If string length are unequal,they cannot be anagrams
		if (inputStrOne.length() != inputStrTwo.length() ) {
			return false;
		}

		// Integer array to store frequency of characters 
		int [] stringOneCharacterCountArray = new int[26];
		int [] stringTwoCharacterCountArray = new int[26];

		for (int i=0; i < inputStrOne.length(); ++i) {
			stringOneCharacterCountArray[inputStrOne.charAt(i) - 'a']++;
		}

		for ( int i=0; i<inputStrTwo.length();++i) {
			stringTwoCharacterCountArray[inputStrTwo.charAt(i) - 'a']++;
		}

		//Check for frequency of characters
		for ( int i=0; i<stringOneCharacterCountArray.length;++i) {

			if( stringOneCharacterCountArray[i] != stringTwoCharacterCountArray[i]) {
				return false;
			}

		}
		return true;

	}

}
