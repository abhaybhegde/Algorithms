/**
 * Given an input String , print 'Yes' if it is a Palindrome , else print 'No'
 * 
 * 
 */

package strings;

public class PalindromeCheck {

	public static boolean isPalindrome(String input) {
		
		if ( input.length() == 0) {
			return false;
		}
		int startIndex = 0, endIndex=input.length()-1;
		
		while ( startIndex < endIndex) {
			
			if ( input.charAt(startIndex) == input.charAt(endIndex)) {
				++startIndex;
				--endIndex;
			} else {
				return false;
			}
			
		}
		
		return true;
		
	}
	
}
