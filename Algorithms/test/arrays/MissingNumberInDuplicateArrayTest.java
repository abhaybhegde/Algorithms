package arrays;

import org.junit.Test;
import static org.junit.Assert.*;


public class MissingNumberInDuplicateArrayTest {
	
	@Test
	public void test_findTheMissingNumber() {
		int [] biggerArray = {9, 7, 8, 5, 4, 6 ,2, 3, 1};
		int [] smallerArray = {9, 8, 5, 4, 6 ,2, 3, 1};
		
		assertEquals(7, MissingNumberInDuplicateArray.findTheMissingNumber(biggerArray, smallerArray));
	}

}
