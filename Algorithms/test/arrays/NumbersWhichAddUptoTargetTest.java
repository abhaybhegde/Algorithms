package arrays;

import arrays.NumbersWhichAddUptoTarget;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class NumbersWhichAddUptoTargetTest {

	@Test
	public void returnNumbersWhichAddUptoTargetShouldReturnExpectedNumbers() {
		
		int [] inputArray = {5,3,1,7,8,9,5,6,2,10,4,11};
		int target  = 6;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(1);
		expected.add(1);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		
		assertEquals(expected, NumbersWhichAddUptoTarget.returnNumbersWhichAddUptoTarget(inputArray, target));
		
	}
	
}
