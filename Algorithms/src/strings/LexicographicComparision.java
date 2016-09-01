package strings;

/*
 * Given two strings of lowercase English letters A and B perform the following operations:

    Sum the lengths of A and B
    Compare A and B Lexicographically. Print "Yes",if A is lexicographically larger than B, else print "No" 
    Capitalize the first letter in A and B and print them on a single line, separated by a space.

 */

public class LexicographicComparision {

	
	public static int computeLengthOfIndividualStrings(String one, String two) {
		return one.length() + two.length();
	}
	
	public static int isLexicographicallyGreater(String one,String two) {
		return one.compareTo(two);
		
	}
	
	public static String capitailize(String one,String two) {
		String capitalizedString ="";
		capitalizedString = one.substring(0, 1).toUpperCase() + one.substring(1) + " " + two.substring(0, 1).toUpperCase() + two.substring(1);
		return capitalizedString;
	}


}
