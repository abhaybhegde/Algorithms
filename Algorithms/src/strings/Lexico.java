/**
 * Given a string, find out the lexicographically smallest and largest substring of length K
 */


package strings;

import java.util.*;


//Test cases
// input  = welcome;
// length = 7


public class Lexico {

	public static  List<String> computeSubstring(String input, int length)  {
		
		//ArrayList to hold string objects
		List<String> listOfStrings = new ArrayList<String>();
		
		try {

			for ( int i =0; i<input.length()-length; ++i ) {
				listOfStrings.add(input.substring(i,length+i));
			}
			//Add the remainder of the input string that is not covered above
			listOfStrings.add(input.substring(input.length()-length));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return listOfStrings;
	}

	public static String returnSmallest(List<String>input) {

		
		String currentMinima="";

		if (input.size() >=0) {
			currentMinima = input.get(0);
			for (int i = 1; i < input.size(); ++i) {

				if (input.get(i).compareTo(currentMinima) < 0) {

					currentMinima = input.get(i);

				}
			} 
		}
		return currentMinima;	
	}

	public static String returnLargest(List<String>input) {

		String currentMaxima = input.get(0);

		for ( int i=1; i< input.size();++i) {

			if ( input.get(i).compareTo(currentMaxima) > 0) {

				currentMaxima = input.get(i);

			}
		}

		return currentMaxima;	
	}

}