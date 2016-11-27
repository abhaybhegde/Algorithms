package arrays;

import arrays.ClosestSumIntegers;

import org.junit.Test;
import static org.junit.Assert.*;


public class ClosestSumIntegersTest {
	
	@Test
	public void returnClosestSumOfIntegersShouldReturnClosestSum() throws Exception {
		
		assertEquals(2, ClosestSumIntegers.returnSumOfIntegersWhichIsClosestToTarget(new int []{-1, 2 ,1 ,-4}, 1));
		assertEquals(0, ClosestSumIntegers.returnSumOfIntegersWhichIsClosestToTarget(new int []{-1, -1 ,2 ,-4}, 1));
	}
	
	@Test(expected = Exception.class)
	public void testCornerCases() throws Exception {
		
		assertEquals(2, ClosestSumIntegers.returnSumOfIntegersWhichIsClosestToTarget(new int []{-1, 2 }, 1));
	}

}
