/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target
 * Algorithms should return the sum of three integers.
 * Assumption - only one such  pairs are available.
 */


package arrays;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class ClosestSumIntegers.
 */
public class ClosestSumIntegers {

	
	
	/**
	 * Return sum of integers which is closest to target.
	 *
	 * @param array the array
	 * @param target the target
	 * @return the result
	 * @throws Exception the exception
	 */
	public static int returnSumOfIntegersWhichIsClosestToTarget(int [] array,int target) throws Exception {

		if ( array.length < 3) {
			throw new Exception("Input Array contains less than 3 integers");
		}
		int result = 0;
		
		//Arrays need to be sorted for this algorithms to work
		Arrays.sort(array);

		//Set min to MAX_VALUE instead of a random value
		int min = Integer.MAX_VALUE;
		
		/*
		 * Maintain 3 pointers i, start ,end within the sorted array
		 * Compute the sum
		 * 			:If the diff is 0, return sum as the result
		 * 			:if the sum <= target , increment start by one position,increment end by one
		 * 			:if the sum > target , decrement end by one position
		 */

		for ( int i =0; i < array.length; ++i) {
			int start = i+1;
			int end = array.length-1;

			while ( start < end) {

				int sum = array[i] + array[start] + array[end];
				int diff = Math.abs(sum-target);
				
				if ( diff == 0) {
					return sum;
				}

				if ( diff < min) {
					min = diff;
					result = sum;
				}

				if (sum <= target) {
					++start;
					--end;
				} else {
					--end;
				}
			}
		}
		return result;
	}




}
