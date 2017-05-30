package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two integer arrays where second array is duplicate of first array with just 1 element missing.
 * Find that element.
 * 
 * Example:
 * 
 * Array_1= 9 7 8 5 4 6 2 3 1
 * Array_2= 2 3 4 9 1 8 5 6
 * Output: 7
 * 
 * Assumption:
 * => There are no duplicate elements within one array
 * => No negative
 * => Maximum Array size = 1000
 */


/* Approach
 * 
 * 1. Construct a map from the elements in smaller Array
 * 2. Iterate over each element in larger Array. In each iteration, check if the Map contains key with 
 *    iterating element. If it doesn't we found the missing number
 */


public class MissingNumberInDuplicateArray {
	
	public static int findTheMissingNumber(int [] biggerArray, int [] smallerArray) {
		
		if ( biggerArray.length == 0 || smallerArray.length == 0 ) {
			return -1;
		}
		
		if ( smallerArray.length > biggerArray.length || biggerArray.length < smallerArray.length || smallerArray.length == biggerArray.length ) {
			throw new IllegalArgumentException("Invalid sizes of Input Array.");
		}
		
		Map<Integer,Boolean> result = new HashMap<>();
		
		for ( Integer eachElement : smallerArray ) {
			result.put(eachElement, true);
		}

		for ( Integer eachElement: biggerArray ) {
			
			if ( result.containsKey(eachElement)) {
				continue;
			}else {
				return eachElement;
			}
		}
		
		return 0;
		
		
	}
	

}
