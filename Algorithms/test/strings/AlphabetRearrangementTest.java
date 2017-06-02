package strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphabetRearrangementTest {
	
	@Test
	public void rearrangeAlphabetsShouldReturnElementsWithSpecifiedOrder() {
		
		assertEquals("[y, i, a, c, k, b, d, z]", AlphabetRearrangement.rearrangeAlphabets("a b c d k i z y", "3 6 4 7 5 2 8 1").toString());
		
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void rearrangeAlphabetsShouldThrowIllegalArgumentExceptionWhenInvalidInputIsPassed() {
		
		AlphabetRearrangement.rearrangeAlphabets("", "");
		
	}
}
