package arrays;

/* Given an sorted input array and a target integer,
 * Find the pairs of integer whose sum is closest to the target
 * 
 */


/*
 * Since the array is already sorted, we can have two pointers , one at the left and the other the end o
 * of the array.
 * We shall use a variable minDiffSeenSoFar and keep updating this based on the 
 * result of sum(left + right - target)
 * 
 * We will use Math.abs() for addition or sutraction to rule out the negative values
 */

public class PairsWithClosestSumToTarget {
	
	public static void pairsWithClosestSumToTarget(int [] inputArray,int target) {
		
		//Base condition
		if ( inputArray.length == 0 ) {
			throw new IllegalArgumentException("Input array is empty.");
		}
		
		int left_result = 0, right_result=0;
		int left = 0;
		int right = inputArray.length -1;
		//Initialize maxDiffSeenSoFar to a very large value. Hence first computation will be less 
		//than this
		int minDiffSeenSoFar = Integer.MAX_VALUE;
		
		while ( left < right ) {
			
			if ( Math.abs(inputArray[left] + inputArray[right] - target)  < minDiffSeenSoFar ) {
				left_result = left;
				right_result = right;
				minDiffSeenSoFar = Math.abs(inputArray[left] + inputArray[right] - target);
				
			}
			
			if ( inputArray[left] + inputArray[right] > target) {
				--right;
			}else {
				++left;
			}
			
		}
		System.out.println("Pairs: " + inputArray[left_result] + "," + inputArray[right_result] );
	}

	public static void main(String [] args) {
		
		int arr[] =  {10, 22, 28, 29, 30, 40};
		int target = 54;
		pairsWithClosestSumToTarget(arr, target);
		
	}



}
