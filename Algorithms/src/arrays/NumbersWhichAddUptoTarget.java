package arrays;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given a target number and an input array consisting of positive integers, the algorithm should return all the numbers 
 * all the numbers in the array whose sum adds upto the target
 * 
 * 
 * 
 */





public class NumbersWhichAddUptoTarget {

	/**
	 * Return numbers which add upto target.
	 *
	 * @param theArray the the array
	 * @param theTarget the the target
	 * @return the array list consisting of all numbers which add upto theTarget
	 */
	public static ArrayList<Integer> returnNumbersWhichAddUptoTarget(int [] theArray, int theTarget) {

		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		
		if (theArray.length == 0) {
			return null;
		}

		for( int i =0; i < theArray.length; ++i ) {

			if ( map.containsKey(theTarget - theArray[i]) || map.containsValue(theTarget - theArray[i])) {

				result.add(theTarget-theArray[i]);
				result.add(theArray[i]);
			} else {
				map.put(theTarget-theArray[i], theArray[i]);
			}
		}
		return result;

	}

}
