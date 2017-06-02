package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  Given two strings, S1 & S2
 *  S1 consists of small case english alphabets,
 *  S2 string consists of their order
 *  Return a third string S3, based on the order of the alphabets in S1
 *  
 */


/*
 * Example 
 * S1 : a b c d k i z y 
 * S2 : 3 6 4 7 5 2 8 1
 * 
 * S3 : y i a c k b d z
 */

/*
 * Assumption , Strings are made up of small case english characters from a to z
 * Strings are space separated
 * Order varies from 1 to 26
 * 
 */


/*
 * Algorithm
 * We maintain two Maps, one map to map alphabets to order
 * Second map to map order to alphabet
 * 
 * We iterate over the second map and print the values;
 */


public class AlphabetRearrangement {
	
	public static List<String> rearrangeAlphabets(String s1, String s2 ) {
		
		if ( s1.length() ==0 || s2.length() == 0 ) {
			throw new IllegalArgumentException("Input Strings are empty.");
		}
		
		Map<String,Integer> inputOrder = new HashMap<>();
		Map<Integer,String> finalOrder = new HashMap<>();
		
		String [] S1 = s1.split(" ");
		String [] S2 = s2.split(" ");
		
		//Populate inputOrder map using values in S1  & S2
		for ( int i=0,j=0; i < S1.length && j < S2.length; ++i,++j) {
			inputOrder.put(S1[i], Integer.parseInt(S2[j]));
		}
		
		// Value of Map one becomes key to second map
		for ( Map.Entry<String, Integer> entry : inputOrder.entrySet() ) {
			
			finalOrder.put(entry.getValue(), entry.getKey());
			
		}
		
		List<String> result = new ArrayList<>();
		for ( Map.Entry<Integer, String> entry : finalOrder.entrySet()) {
			result.add(entry.getValue());
		}
		
		return result;
		
	}

}
